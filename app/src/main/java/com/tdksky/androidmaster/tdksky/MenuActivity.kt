package com.tdksky.androidmaster.tdksky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.tdksky.androidmaster.R
import com.tdksky.androidmaster.R.id
import com.tdksky.androidmaster.tdksky.firstapp.FirstAppActivity
import com.tdksky.androidmaster.tdksky.imccalculator.ImcCalculatorActivity
import com.tdksky.androidmaster.tdksky.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<AppCompatButton>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<AppCompatButton>(R.id.btnIMCApp)
        val btnTODO = findViewById<AppCompatButton>(R.id.btnTODO)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener{navigateToImcApp()}
        btnTODO.setOnClickListener{navigateToTodoApp()}

    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}