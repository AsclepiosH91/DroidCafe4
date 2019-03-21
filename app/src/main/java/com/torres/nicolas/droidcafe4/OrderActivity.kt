package com.torres.nicolas.droidcafe4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    private lateinit var orderMessage : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        order_button.setOnClickListener {view ->

            orderMessage = when {
                sameday.isChecked -> getString(R.string.you_choose) + " " + getString(R.string.same_day_messenger_service)
                nextday.isChecked -> getString(R.string.you_choose) + " " + getString(R.string.next_day_ground_delivery)
                pickup.isChecked -> getString(R.string.you_choose) + " " + getString(R.string.pick_up)
                else -> getString(R.string.choose_delivery)
            }
            displayOrderSnackbar(view,orderMessage)
        }
    }

    private fun displayOrderSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction("Action", null).show()
    }

}





















