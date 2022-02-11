package com.example.androidarch.data

import com.example.androidarch.models.TweetsData
import retrofit2.Response

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

    suspend fun getPosts(): Response<TweetsData> {
        return networkService.getTweets()
    }

}