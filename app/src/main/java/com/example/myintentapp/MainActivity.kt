package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnMove: Button
    private lateinit var btnMoveData: Button
    private lateinit var btnDialPhone: Button
    private lateinit var btnMovewithObjec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Button Section
         */
        btnMove = findViewById(R.id.btn_move_activity)
        btnMoveData = findViewById(R.id.btn_move_activity_data)
        btnDialPhone = findViewById(R.id.btn_dial_number)
        btnMovewithObjec = findViewById(R.id.btn_move_activity_object)

        btnMove.setOnClickListener(this)
        btnMoveData.setOnClickListener(this)
        btnDialPhone.setOnClickListener(this)
        btnMovewithObjec.setOnClickListener(this)

    }
    /**
     * How to Summon/Override fun onClick, MainAtivity extends/implement View.OnclickLister
     * hawla alt + insert Onclik found
     *
     */
    override fun onClick(view: View?) {

        when(view?.id){
            R.id.btn_move_activity -> {
                val intentMv = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(intentMv)
            }
            R.id.btn_move_activity_data -> {
                val intentMvData = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                startActivity(intentMvData)
                intentMvData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Academy")
                intentMvData.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
            }
            R.id.btn_dial_number -> {
                val phoneNumber =" 081390280100"
                val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(intentDial)
            }
            R.id.btn_move_activity_object -> {
                val person = Person(
                    "Dicoding",
                    5,
                    "academy@google",
                    "Bandung"
                )
                val intentData = Intent(this@MainActivity, MoveWithObjecActivity::class.java)
                intentData.putExtra(MoveWithObjecActivity.EXTRA_PERSON,person)
                startActivity(intentData)
            }

        }

        Toast.makeText(this, "${view?.id} ", Toast.LENGTH_LONG).show()
    }


}