package com.example.krylov_v_24.screen

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val constraintLayout = ConstraintLayout(this).apply {
            layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            setBackgroundColor(Color.WHITE)
        }


        val loginEditText = EditText(this).apply {
            hint = "Логин:"
            setTextColor(Color.BLACK)
            textSize = 16f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val passwordEditText = EditText(this).apply {
            hint = "Пароль:"
            setTextColor(Color.BLACK)
            textSize = 16f
            inputType = android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val authButton = Button(this).apply {
            text = "Авторизоваться"
            setBackgroundColor(Color.parseColor("#FFA500"))
            setTextColor(Color.WHITE)
            textSize = 18f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        constraintLayout.addView(loginEditText)
        constraintLayout.addView(passwordEditText)
        constraintLayout.addView(authButton)


        setContentView(constraintLayout)


        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)


        constraintSet.connect(
            loginEditText.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            0
        )
        constraintSet.connect(
            loginEditText.id,
            ConstraintSet.BOTTOM,
            ConstraintSet.PARENT_ID,
            ConstraintSet.BOTTOM,
            0
        )
        constraintSet.connect(
            loginEditText.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            loginEditText.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )
        constraintSet.setVerticalBias(loginEditText.id, 0.3f)


        constraintSet.connect(
            passwordEditText.id,
            ConstraintSet.TOP,
            loginEditText.id,
            ConstraintSet.BOTTOM,
            16
        )
        constraintSet.connect(
            passwordEditText.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            passwordEditText.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            authButton.id,
            ConstraintSet.TOP,
            passwordEditText.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            authButton.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            authButton.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.applyTo(constraintLayout)


        authButton.setOnClickListener {

            val login = loginEditText.text.toString()
            val password = passwordEditText.text.toString()


            val intent = Intent(this, Personal_AreaActivity::class.java)
            intent.putExtra("LOGIN", login)
            startActivity(intent)
        }
    }
}