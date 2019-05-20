package com.example.dinnerapakita

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*
import android.view.WindowManager
import android.os.Build
import android.view.View


class MainActivity : AppCompatActivity() {

    var ListMakanan = arrayListOf("Nasi Goreng", "Bakso", "Pizza", "McDonalds", "Richeese",
        "Mie Rebus/Goreng","Soto", "Martabak", "Steak", "Roti Bakar")
    var ListGambar= arrayListOf(R.drawable.nasgor, R.drawable.bakso, R.drawable.pizza, R.drawable.mcd, R.drawable.richeese,
        R.drawable.mie, R.drawable.soto, R.drawable.martabak, R.drawable.steak, R.drawable.rotibakar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // In Activity's onCreate() for instance
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }
        setContentView(R.layout.activity_main)
        imageView.visibility = View.VISIBLE

        btnDinner.setOnClickListener {
            imageView.visibility = View.GONE
            val random = Random()

            val randomFood = random.nextInt(ListMakanan.count())
            selectedFood.text = ListMakanan[randomFood]
            imageMakan.setImageResource(ListGambar[randomFood])
        }
    }
}
