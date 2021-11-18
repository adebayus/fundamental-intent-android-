package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjecActivity : AppCompatActivity() {
    private lateinit var tvObject:TextView

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_objec)

        tvObject = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = """
            |Name :${person.name.toString()}
            |Email :${person.age}
            |Email :${person.email}
            |Email :${person.city}
        """.trimMargin()
        tvObject.text = text



    }
}