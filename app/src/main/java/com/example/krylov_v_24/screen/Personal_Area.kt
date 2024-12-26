package com.example.krylov_v_24.screen

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.text.font.FontVariation
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.example.krylov_v_24.R

class Personal_AreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val constraintLayout = ConstraintLayout(this).apply {
            layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            setBackgroundColor(Color.WHITE)
        }


        val titleText = TextView(this).apply {
            text = "Личный кабинет"
            setTextColor(Color.BLACK)
            textSize = 18f
            setTypeface(null, Typeface.BOLD)
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val logoutIcon = ImageView(this).apply {
            setImageResource(R.drawable.vihod)
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnClickListener {

                val intent = Intent(this@Personal_AreaActivity, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


        val settingsIcon = ImageView(this).apply {
            setImageResource(R.drawable.shesterenka)
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnClickListener {

                val intent = Intent(this@Personal_AreaActivity, FontVariation.Setting::class.java)
                startActivity(intent)
            }
        }


        val login = intent.getStringExtra("LOGIN")


        val welcomeText = TextView(this).apply {
            text = "Привет, $login!"
            setTextColor(Color.BLACK)
            textSize = 18f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val buyButton = Button(this).apply {
            text = "Купить"
            setBackgroundColor(Color.parseColor("#E0E0E0"))
            setTextColor(Color.BLACK)
            textSize = 14f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val sellButton = Button(this).apply {
            text = "Продать"
            setBackgroundColor(Color.parseColor("#E0E0E0"))
            setTextColor(Color.BLACK)
            textSize = 14f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val photoButton = Button(this).apply {
            text = "Сделать фотографию квартиры"
            setBackgroundColor(Color.parseColor("#FFA500"))
            setTextColor(Color.WHITE)
            textSize = 14f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        constraintLayout.addView(titleText)
        constraintLayout.addView(logoutIcon)
        constraintLayout.addView(settingsIcon)
        constraintLayout.addView(welcomeText)
        constraintLayout.addView(buyButton)
        constraintLayout.addView(sellButton)
        constraintLayout.addView(photoButton)


        setContentView(constraintLayout)


        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)


        constraintSet.connect(
            logoutIcon.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            logoutIcon.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            50
        )
        constraintSet.connect(
            logoutIcon.id,
            ConstraintSet.END,
            titleText.id,
            ConstraintSet.START,
            16
        )

        // Привязываем titleText по центру
        constraintSet.connect(
            titleText.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            50
        )
        constraintSet.connect(
            titleText.id,
            ConstraintSet.START,
            logoutIcon.id,
            ConstraintSet.END,
            16
        )
        constraintSet.connect(
            titleText.id,
            ConstraintSet.END,
            settingsIcon.id,
            ConstraintSet.START,
            16
        )


        constraintSet.connect(
            settingsIcon.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            50
        )
        constraintSet.connect(
            settingsIcon.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            welcomeText.id,
            ConstraintSet.TOP,
            titleText.id,
            ConstraintSet.BOTTOM,
            24
        )
        constraintSet.connect(
            welcomeText.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            welcomeText.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            buyButton.id,
            ConstraintSet.TOP,
            welcomeText.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            buyButton.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            buyButton.id,
            ConstraintSet.END,
            sellButton.id,
            ConstraintSet.START,
            16
        )


        constraintSet.connect(
            sellButton.id,
            ConstraintSet.TOP,
            welcomeText.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            sellButton.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            photoButton.id,
            ConstraintSet.TOP,
            buyButton.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            photoButton.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            photoButton.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.applyTo(constraintLayout)


        buyButton.setOnClickListener {

        }


        sellButton.setOnClickListener {

        }


        photoButton.setOnClickListener {
            val intent = Intent(this, Personal_AreaActivity::class.java)
            val intent = Intent(this, System_Camera::class.java)
            startActivity(intent)
        }
    }
}