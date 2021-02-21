package ru.netology.netogypost.viewmodel

import ru.netology.netogypost.repository.PostRepositoryInMemory
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.netology.netogypost.Post

class PostViewModel: ViewModel() {
    private val repository = PostRepositoryInMemory()
    val data: LiveData<Post>
        get() = repository.data
    fun like() = repository.like()
    fun share() = repository.share()
}