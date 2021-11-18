package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnMove: Button
    private lateinit var btnMoveData: Button
    private lateinit var btnDialPhone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move_activity)
        btnMoveData = findViewById(R.id.btn_move_activity_data)
        btnDialPhone = findViewById(R.id.btn_dial_number)

        btnMove.setOnClickListener {
            startActivity(Intent(this, MoveActivity::class.java))
        }

        btnMoveData.setOnClickListener {
            val moveWith = Intent(this, MoveWithDataActivity::class.java)
            moveWith.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Academy")
            moveWith.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
            startActivity(moveWith)
        }

        btnDialPhone.setOnClickListener {
            val phoneNumber =" 081390280100"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)

        }

    }
}