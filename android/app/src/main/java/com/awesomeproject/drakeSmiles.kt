package com.awesomeproject

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.makeramen.roundedimageview.RoundedImageView
import com.makeramen.roundedimageview.RoundedTransformationBuilder
import com.squareup.picasso.Picasso


class drakeSmiles : AppCompatActivity() {


    private lateinit var imageView1 : RoundedImageView
    private lateinit var imageView2 : RoundedImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

        val transformation1 = RoundedTransformationBuilder()
            .borderWidthDp(3f)
            .cornerRadiusDp(30f)
            .oval(false)
            .build()

        val transformation2 = RoundedTransformationBuilder()
            .borderWidthDp(3f)
            .cornerRadiusDp(30f)
            .oval(false)
            .build()

        Picasso.get()
            .load("https://i.kym-cdn.com/entries/icons/original/000/020/147/drake.jpg")
            .transform(transformation1)
            .into(imageView1)

        Picasso.get()
            .load("https://litreactor.com/sites/default/files/images/column/headers/drake_ignores_writing_advice.jpg")
            .transform(transformation2)
            .into(imageView2)

    }

    fun displayToast1(view: View) {
        Toast.makeText(this@drakeSmiles, "Drake is happy", Toast.LENGTH_SHORT).show()
    }

    fun displayToast2(view: View) {
        Toast.makeText(this@drakeSmiles, "Drake is unhappy", Toast.LENGTH_SHORT).show()
    }

}