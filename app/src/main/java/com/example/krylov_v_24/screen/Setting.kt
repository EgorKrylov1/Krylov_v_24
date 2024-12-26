package com.example.krylov_v_24.screen

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.example.krylov_v_24.R

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val constraintLayout = ConstraintLayout(this).apply {
            layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            setBackgroundColor(Color.WHITE)
        }


        val backIcon = ImageView(this).apply {
            setImageResource(R.drawable.Strelka)
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnClickListener {

                val intent = Intent(this@SettingActivity, Personal_AreaActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


        val titleText = TextView(this).apply {
            text = "Настройки"
            setTextColor(Color.BLACK)
            textSize = 18f
            setTypeface(null, Typeface.BOLD)
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val locationText = TextView(this).apply {
            text = "Отображать мое местоположение"
            setTextColor(Color.BLACK)
            textSize = 16f
            id = androidx.core.view.ViewCompat.generateViewId()
        }

        val locationSwitch = Switch(this).apply {
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnCheckedChangeListener { _, isChecked ->

                if (isChecked) {

                    setBackgroundColor(Color.parseColor("#FFA500"))
                } else {

                    setBackgroundColor(Color.WHITE)
                }
            }
        }

        val notificationText = TextView(this).apply {
            text = "Уведомлять меня о новых объявлениях"
            setTextColor(Color.BLACK)
            textSize = 16f
            id = androidx.core.view.ViewCompat.generateViewId()
        }

        val notificationSwitch = Switch(this).apply {
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnCheckedChangeListener { _, isChecked ->

                if (isChecked) {

                    setBackgroundColor(Color.parseColor("#FFA500"))
                } else {

                    setBackgroundColor(Color.WHITE)
                }
            }
        }

        val hideAdsText = TextView(this).apply {
            text = "Скрыть объявления без фотографий"
            setTextColor(Color.BLACK)
            textSize = 16f
            id = androidx.core.view.ViewCompat.generateViewId()
        }

        val hideAdsSwitch = Switch(this).apply {
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnCheckedChangeListener { _, isChecked ->

                if (isChecked) {

                    setBackgroundColor(Color.parseColor("#FFA500"))
                } else {

                    setBackgroundColor(Color.WHITE)
                }
            }
        }


        val supportFrame = ConstraintLayout(this).apply {
            setBackgroundColor(Color.parseColor("#F5F5F5"))
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val supportLabel = TextView(this).apply {
            text = "Техническая поддержка:"
            setTextColor(Color.BLACK)
            textSize = 14f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        val supportLink = TextView(this).apply {
            text = "suport.kvartal.ru"
            setTextColor(Color.parseColor("#FFA500"))
            textSize = 14f
            id = androidx.core.view.ViewCompat.generateViewId()
        }


        supportFrame.addView(supportLabel)
        supportFrame.addView(supportLink)


        val resetButton = Button(this).apply {
            text = "Сбросить настройки"
            setBackgroundColor(Color.parseColor("#FFA500"))
            setTextColor(Color.WHITE)
            textSize = 16f
            id = androidx.core.view.ViewCompat.generateViewId()
            setOnClickListener {

            }
        }


        constraintLayout.addView(backIcon)
        constraintLayout.addView(titleText)
        constraintLayout.addView(locationText)
        constraintLayout.addView(locationSwitch)
        constraintLayout.addView(notificationText)
        constraintLayout.addView(notificationSwitch)
        constraintLayout.addView(hideAdsText)
        constraintLayout.addView(hideAdsSwitch)
        constraintLayout.addView(supportFrame)
        constraintLayout.addView(resetButton)


        setContentView(constraintLayout)


        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)


        constraintSet.connect(
            backIcon.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            backIcon.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            50
        )


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
            backIcon.id,
            ConstraintSet.END,
            16
        )
        constraintSet.connect(
            titleText.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            locationText.id,
            ConstraintSet.TOP,
            titleText.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            locationText.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )


        constraintSet.connect(
            locationSwitch.id,
            ConstraintSet.TOP,
            locationText.id,
            ConstraintSet.TOP,
            0
        )
        constraintSet.connect(
            locationSwitch.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            notificationText.id,
            ConstraintSet.TOP,
            locationText.id,
            ConstraintSet.BOTTOM,
            24
        )
        constraintSet.connect(
            notificationText.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )


        constraintSet.connect(
            notificationSwitch.id,
            ConstraintSet.TOP,
            notificationText.id,
            ConstraintSet.TOP,
            0
        )
        constraintSet.connect(
            notificationSwitch.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            hideAdsText.id,
            ConstraintSet.TOP,
            notificationText.id,
            ConstraintSet.BOTTOM,
            24
        )
        constraintSet.connect(
            hideAdsText.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )


        constraintSet.connect(
            hideAdsSwitch.id,
            ConstraintSet.TOP,
            hideAdsText.id,
            ConstraintSet.TOP,
            0
        )
        constraintSet.connect(
            hideAdsSwitch.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.connect(
            supportFrame.id,
            ConstraintSet.TOP,
            hideAdsText.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            supportFrame.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            supportFrame.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )
        constraintSet.constrainHeight(supportFrame.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(supportFrame.id, ConstraintSet.MATCH_CONSTRAINT)


        constraintSet.connect(
            supportLabel.id,
            ConstraintSet.TOP,
            supportFrame.id,
            ConstraintSet.TOP,
            16
        )
        constraintSet.connect(
            supportLabel.id,
            ConstraintSet.START,
            supportFrame.id,
            ConstraintSet.START,
            16
        )


        constraintSet.connect(
            supportLink.id,
            ConstraintSet.TOP,
            supportLabel.id,
            ConstraintSet.BOTTOM,
            8
        )
        constraintSet.connect(
            supportLink.id,
            ConstraintSet.START,
            supportFrame.id,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            supportLink.id,
            ConstraintSet.BOTTOM,
            supportFrame.id,
            ConstraintSet.BOTTOM,
            16
        )


        constraintSet.connect(
            resetButton.id,
            ConstraintSet.TOP,
            supportFrame.id,
            ConstraintSet.BOTTOM,
            32
        )
        constraintSet.connect(
            resetButton.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            16
        )
        constraintSet.connect(
            resetButton.id,
            ConstraintSet.END,
            ConstraintSet.PARENT_ID,
            ConstraintSet.END,
            16
        )


        constraintSet.applyTo(constraintLayout)
    }
}