package ru.netology.netogypost.repository

import androidx.lifecycle.LiveData
import ru.netology.netogypost.Post

    interface PostRepository {
        fun get(): LiveData<Post>
        fun like()
        fun share()
    }
