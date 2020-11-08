package com.example.plantilla.actividad_noticia_equipo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.plantilla.R
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class Activity_Noticias : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener{
            setContentView(R.layout.activity_mainc1)
        }
        val partidos = findViewById<TextView>(R.id.partidos)
        partidos.setOnClickListener {
            setContentView(R.layout.activity_detalles)
        }

        val plantilla = findViewById<TextView>(R.id.plantilla)
        plantilla.setOnClickListener {
            setContentView(R.layout.principalpartidospantalla)
        }
        val linkNoticia1 = findViewById<Button>(R.id.btn1)
        linkNoticia1.setOnClickListener(){
            val url = "https://www.fcbarcelonanoticias.com/jugadores/brillantes-ansu-fati-pedri-lideraron-en-intento-remontada_261910_102.html"
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(url)))
        }
        val linkNoticia2 = findViewById<Button>(R.id.btn2)
        linkNoticia2.setOnClickListener(){
            val url ="https://www.fcbarcelonanoticias.com/champions-league/dynamo-kiev-presentara-camp-nou-sin-porteros_261927_102.html"
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(url)))
        }
        val linkNoticia3 = findViewById<Button>(R.id.btn3)
        linkNoticia3.setOnClickListener(){
            val url= "https://www.fcbarcelonanoticias.com/fichajes/salida-bartomeu-no-cambiado-planes-barcelona-eric-garcia_261922_102.html"
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(url)))
        }

        val linkNoticia4 = findViewById<Button>(R.id.btn4)
        linkNoticia4.setOnClickListener(){
            val url= "https://www.fcbarcelonanoticias.com/fc-barcelona/barca-gano-liga-comienzos-casi-tan-horribles-2020_261923_102.html"
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(url)))
        }

        val linkNoticia5 = findViewById<Button>(R.id.btn5)
        linkNoticia5.setOnClickListener(){
            val url= "https://www.fcbarcelonanoticias.com/jugadores/lionel-messi/peor-arranque-goleador-carrera-messi-1-gol-6-jornadas-liga_261921_102.html"
            startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(url)))
        }
    }


}