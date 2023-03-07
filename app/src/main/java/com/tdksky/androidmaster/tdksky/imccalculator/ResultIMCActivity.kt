package com.tdksky.androidmaster.tdksky.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.tdksky.androidmaster.R

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result: Double = intent.extras?.getDouble(ImcCalculatorActivity.IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {

        btnRecalculate.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result) {
            in 0.00..18.50 -> {//bajo peso

                tvResult.text = getString(R.string.tittle_bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvDescription.text = getString(R.string.desrcription_bajo_peso)
            }
            in 18.51..24.99 -> {//peso normal

                tvResult.text = getString(R.string.tittle_peso_normal)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvDescription.text = getString(R.string.desrcription_peso_normal)
            }
            in 25.00..29.99 -> {//sobrepeso

                tvResult.text = getString(R.string.tittle_sobrepeso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                tvDescription.text = getString(R.string.desrcription_sobrepeso)
            }
            in 30.00..99.99 -> {//obesidad

                tvResult.text = getString(R.string.tittle_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_obesidad))
                tvDescription.text = getString(R.string.desrcription_obesidad)
            }
            else -> {//error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }


    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}