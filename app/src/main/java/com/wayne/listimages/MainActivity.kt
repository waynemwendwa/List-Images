package com.wayne.listimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data
        val p1 = Product("Balenciaga", 12000.0, 23, R.drawable.pic_1)
        val p2 = Product("Nike airforce one high top", 18000.0, 12, R.drawable.pic_2)
        val p3 = Product("Camera", 27000.0, 2, R.drawable.pic_3)
        val p4 = Product("Nike logo", 19000.0, 21, R.drawable.pic_4)
        val p5 = Product("Vasache", 3200.0, 32, R.drawable.pic_5)
        val p6 = Product("Glasses", 14300.0, 31, R.drawable.pic_6)
        val p7 = Product("Half-court set", 52000.0, 20, R.drawable.pic_7)
        val p8 = Product("Full court set", 32000.0, 19, R.drawable.pic_8)
        val p9 = Product("Baseball bats", 23000.0, 10, R.drawable.pic_9)
        val p10 = Product("Jordan one's", 45000.0, 5, R.drawable.pic_10)

        val products = arrayListOf<Product>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

        val productsRecyclerView : RecyclerView = findViewById(R.id.recyclerViewProducts)
        productsRecyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = CustomAdapter(products)

        productsRecyclerView.adapter = adapter

    }
}