package ru.netology.netogypost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.netology.netogypost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = Post(
            id = 1,
            author = getString(R.string.title),
            content = getString(R.string.text),
            published = getString(R.string.date),
            liked = false,
            shared = false,
            likesCount = 0,
            sharesCount = 0
        )
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
            post.liked=!post.liked

            likes.setOnClickListener {
                Log.d("stuff", "likes")

                if (post.liked) {
                    post.likesCount++
                    textViewLikes.text = Converter.convert(post.likesCount)
                    likes.setImageResource(R.drawable.ic_baseline_favorite_24)
                }

                else {
                    textViewLikes.text = post.likesCount--.toString()
                    likes.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                }
            }

            share.setOnClickListener {
                Log.d("stuff", "share")
                post.sharesCount++
                textViewShare.text = Converter.convert(post.sharesCount)
            }

            root.setOnClickListener{
                Log.d("stuff", "stuff")
            }

            imageViewNetology.setOnClickListener{
                Log.d("stuff", "avatar")
            }
        }

    }
}









