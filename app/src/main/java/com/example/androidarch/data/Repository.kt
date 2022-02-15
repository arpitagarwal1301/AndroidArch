package com.example.androidarch.data

import com.example.androidarch.common.Resource
import com.example.androidarch.models.TweetsData

/**
 * @author Arpit Agarwal <arpit.agarwal@lenskart.in>
 * @version $Revision 1.0 $, $Date 2022/02/06 13:59 $
 * @since 0.1.0
 */
object Repository {

    var networkService: NetworkService
    init {
        val retrofitHelper = RetrofitHelper.getInstance()
        networkService = retrofitHelper.create(NetworkService::class.java)
    }

    suspend fun getPosts(): Resource<TweetsData> {
        try{
            val response = networkService.getTweets()
            val result = response.body()
            if(response.isSuccessful && result != null) {
                return Resource.Success(result)
            } else {
                return Resource.Error("Error :" + response.message())
            }
        } catch (e: Exception){
            return Resource.Error("Something went wrong")
        }

    }

}