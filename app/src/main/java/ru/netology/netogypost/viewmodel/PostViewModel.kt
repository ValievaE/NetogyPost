package ru.netology.netogypost.viewmodel

import ru.netology.netogypost.repository.PostRepository
import ru.netology.netogypost.repository.PostRepositoryInMemory

class PostViewModel {
    private val repository: PostRepository = PostRepositoryInMemory()
    val data = repository.get()
    fun like() = repository.like()
    fun share() = repository.share()
}