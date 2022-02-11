package com.example.androidarch.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * @author Arpit Agarwal <arpit.agarwal@lenskart.in>
 * @version $Revision 1.0 $, $Date 2022/02/10 20:48 $
 * @since 0.1.0
 */
object RetrofitHelper {
    val BASE_URL = "https://6f8a2fec-1605-4dc7-a081-a8521fad389a.mock.pstmn.io"
    fun getInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}