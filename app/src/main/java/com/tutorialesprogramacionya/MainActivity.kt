package com.tutorialesprogramacionya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1 = findViewById<EditText>(R.id.et1)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val et1 = findViewById<EditText>(R.id.et1)
            val nro1 = et1.text.toString().toInt()
            var p1 = Integer.parseInt(et1.text.toString())
            val x = 3.1416 //se utiliza para realizar la operacion del calculo de area
            val v: Int = 22  //es el resultado de 7*3.14= 22 de radio de las 7 farolas de aprox 1 mt de radio

            if (p1 >= 100 && p1 <= 300) {
                val suma = x * p1 * p1 - v
                //area total de la plaza ap = pi*radio^2=3.14*plaza^2 =Respuesta en m^2

                tv1.text = "Resultado:" + (suma.toString())

            }
        }
    }
}
