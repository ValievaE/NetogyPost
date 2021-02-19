package ru.netology.netogypost

data class Post(
        val id: Long,
        val author: String,
        val content: String,
        val published: String,
        val liked: Boolean,
        val shared: Boolean,
        var likesCount: Int,
        var sharesCount: Int
)

