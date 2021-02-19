package ru.netology.netogypost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import ru.netology.netogypost.databinding.ActivityMainBinding
import ru.netology.netogypost.viewmodel.PostViewModel
import kotlin.properties.ReadOnlyProperty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel: PostViewModel by viewModels()
        viewModel.data.observe(this, { post ->
            with(binding) {
                textViewTitle.text = post.author
                textViewDate.text = post.published
                text.text = post.content
                textViewLikes.text = post.likesCount.toString()
                textViewShare.text = post.sharesCount.toString()

                likes.setImageResource(
                        if (post.liked) R.drawable.ic_baseline_favorite_24
                        else R.drawable.ic_baseline_favorite_border_24
                )
            }
        })

        binding.likes.setOnClickListener {
            viewModel.like()
//            if (post.liked) {
//                post.likesCount++
//                textViewLikes.text = Converter.convert(post.likesCount)
//                likes.setImageResource(R.drawable.ic_baseline_favorite_24)
//            } else {
//                textViewLikes.text = post.likesCount--.toString()
//                likes.setImageResource(R.drawable.ic_baseline_favorite_border_24)
//            }
        }

        binding.ivShare.setOnClickListener {
            viewModel.share()
//            post.sharesCount++
//            textViewShare.text = Converter.convert(post.sharesCount)
        }


    }



}










