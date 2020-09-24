package com.shaugh.ecommerce

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_guide.*

class GuideFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_guide, container, false)
        val like = rootView.findViewById(R.id.IVlike) as ImageView
        val disLike = rootView.findViewById(R.id.IVdisLike) as ImageView
        val comment = rootView.findViewById(R.id.IVcomment) as ImageView
        like.setOnClickListener {
            Toast.makeText(activity, "Liked", Toast.LENGTH_SHORT).show()
            like.setImageResource(R.drawable.liked)
            disLike.setImageResource(R.drawable.dislike)
        }
        disLike.setOnClickListener {
            Toast.makeText(context, "Disliked", Toast.LENGTH_SHORT).show()
            disLike.setImageResource(R.drawable.disliked)
            like.setImageResource(R.drawable.like)
        }
        comment.setOnClickListener {
            Toast.makeText(context, "Comment", Toast.LENGTH_SHORT).show()
        }
        return rootView
    }
}