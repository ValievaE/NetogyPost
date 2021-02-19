package ru.netology.netogypost.repository

import androidx.lifecycle.LiveData
import ru.netology.netogypost.Post

    interface PostRepository {
        val data: LiveData<Post>
        fun like()
        fun share()
    }
