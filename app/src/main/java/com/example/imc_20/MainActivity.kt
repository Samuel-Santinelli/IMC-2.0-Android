package com.example.imc_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPeso = findViewById<EditText>(R.id.et_peso)
        val editTextAltura = findViewById<EditText>(R.id.et_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val textViewResultado = findViewById<TextView>(R.id.tv_resultado)

        buttonCalcular.setOnClickListener {
            var peso = editTextPeso.text.toString().toInt()
            var altura = editTextAltura.text.toString().toDouble()

            var imc = peso / Math.pow(altura, 2.0)

            textViewResultado.text = imc.toString()
        }

        //declarando variavel
        //var valor = 10     //int
        //var valor2 = 10.0  //double
        //var valor3 = 10.0f //float



        //O tipo da variavel vai depender do valor que você atribui a ela

        //valor = 35

        //val x = "5"

        //val y = valor.toInt()
    }
}