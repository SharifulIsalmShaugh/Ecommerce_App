package com.shaugh.ecommerce

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shaugh.ecommerce.model.Product
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_main.view.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.support.v4.uiThread
import org.jetbrains.anko.uiThread
import java.net.URL

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
            uiThread {
                //val products = Gson().fromJson(json, Array<Product>::class.java).toList()
                val products =listOf<Product>(
                        Product("Images 1", R.drawable.img1,"10"),
                        Product("Images 2", R.drawable.img2,"20"),
                        Product("Images 3", R.drawable.img3,"30"),
                        Product("Images 4", R.drawable.img4,"40"),
                        Product("Images 5", R.drawable.img5,"50")
                )

                root.recycler_view.apply {
                    layoutManager = GridLayoutManager(activity, 2)
                    adapter = ProductsAdapter(products)
                    root.progressBar.visibility = View.GONE
                }
            }


        return root
    }
}