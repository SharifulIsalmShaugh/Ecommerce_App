package com.shaugh.ecommerce

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cart_details.*

class CartDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_details)

        val title = intent.getStringExtra("cTitle")
        val photoUrl = intent.getIntExtra("cPhoto_url",0)
        val price = intent.getStringExtra("cPrice")

        IVproductPhoto.setImageResource(photoUrl)
        TVproductName.text = "Product name: $title"
        TVproductPrice.text = "Product price: $price"

        BtnBuyNow.setOnClickListener {
            val intent = Intent(this, DeliveryAddress::class.java)
/*            intent.putExtra("cTitle",title)
            intent.putExtra("cPhoto_url", photoUrl)
            intent.putExtra("cPrice", price)*/
            this.startActivity(intent)
        }
    }
}
