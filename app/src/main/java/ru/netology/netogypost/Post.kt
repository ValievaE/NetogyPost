package ru.netology.netogypost

data class Post(
        val id: Long,
        val author: String,
        val content: String,
        val published: String,
        var liked: Boolean,
        var shared: Boolean,
        var likesCount: Int,
        var sharesCount: Int
)

