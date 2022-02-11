package com.example.androidarch.models

data class TweetsData(
    val data: List<Tweet>,
    val success: Boolean
) {
    data class Tweet(
        val favoriteCount: Int,
        val handle: String,
        val name: String,
        val profileImageUrl: String,
        val retweetCount: Int,
        val text: String
    )
}