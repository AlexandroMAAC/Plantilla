package com.example.plantilla.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plantilla.R
import com.example.plantilla.clasedatos.Alineacion
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val alinacion = intent.getSerializableExtra("Ali") as Alineacion
        textView9.text = alinacion.Alineacion1
        JU1.text =  alinacion.JU1
        JU2.text = alinacion.JU2
        JU3.text = alinacion.JU3
        JU4.text = alinacion.JU4

    }
}