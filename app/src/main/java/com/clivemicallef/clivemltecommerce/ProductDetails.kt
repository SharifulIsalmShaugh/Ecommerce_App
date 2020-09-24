package com.shaugh.ecommerce

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_details.*

class ProductDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)

        val title = intent.getStringExtra("title")
        val photoUrl = intent.getIntExtra("photo_url",0)
        val price = intent.getStringExtra("price")



        product_name.text = "Product Name: $title"
        product_price.text = "Price $price TK"
        //Picasso.get().load(photoUrl).into(photo)
        //photo.setImageResource(photoUrl.toInt())
        photo.setImageResource(photoUrl)

        availability.setOnClickListener {
            AlertDialog.Builder(this)
                    .setMessage("$title has been added to your cart!")
                    .setPositiveButton("OK") {
                        p0, p1 ->
                        val intent = Intent(this, CartDetails::class.java)
                        intent.putExtra("cTitle",title)
                        intent.putExtra("cPhoto_url", photoUrl)
                        intent.putExtra("cPrice", price)
                        this.startActivity(intent)
                    }
                    .setNegativeButton("Cancel"){
                        p0, p1 ->
                        p0.dismiss()
                    }
                    .create()
                    .show()
        }
    }
}