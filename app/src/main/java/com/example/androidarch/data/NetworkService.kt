package com.example.androidarch.data

import com.example.androidarch.models.TweetsData
import retrofit2.Response
import retrofit2.http.GET

/**
 * @author Arpit Agarwal <arpit.agarwal@lenskart.in>
 * @version $Revision 1.0 $, $Date 2022/02/06 14:01 $
 * @since 0.1.0
 */
interface NetworkService {

    @GET("/tweets")
    suspend fun getTweets() : Response<TweetsData>
}