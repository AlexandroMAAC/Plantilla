package com.example.plantilla.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plantilla.R
import com.example.plantilla.adaptadores.AdaptadorAlineacion
import com.example.plantilla.adaptadores.AdaptadorPartidos
import com.example.plantilla.clasedatos.Alineacion
import com.example.plantilla.clasedatos.Partidos
import com.example.plantilla.data.Request
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imageView10
import kotlinx.android.synthetic.main.activity_mainc1.*
import kotlinx.android.synthetic.main.principalpartidospantalla.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        rvPlantilla.layoutManager = LinearLayoutManager(this)
        rvPlantilla.adapter =
            AdaptadorAlineacion(
                generarDatosPrueba(),
                this
            )
        rvpartidos.layoutManager = LinearLayoutManager(this)
        rvpartidos.adapter = AdaptadorPartidos(Datos(), this)

        //val url = "https://www.thesportsdb.com/api/v1/json/1/searchteams.php?t=Arsenal"




    }

    private  fun generarDatosPrueba() : ArrayList<Alineacion>{
        val lista = ArrayList<Alineacion>()

        lista.add(
            Alineacion(

                R.drawable.portero,
                "Porteros",
                "Robiño",
                "Marc Andre Ter Stegen",
                "",
                ""


            )
        )
        lista.add(
            Alineacion(
                R.drawable.defensa,
                "Defensas",
                "Sergiño Dest",
                "Gerar Pique",
                "Clement Lenglet",
                "Jordi Alba"
            )
        )
        lista.add(
            Alineacion(
                R.drawable.mediocampi,
                "Mediocampo",
                "Frenkie de Jong",
                "Philipe Coutinho",
                "Riqui Puig",
                "cindyp"

            )
        )

        return lista
        }

    private  fun Datos() : ArrayList<Partidos>{
        val lista = ArrayList<Partidos>()

        lista.add(
            Partidos(

                R.drawable.bundes,
                "Bundesliga",
                R.drawable.frank,
                "Eintrach Frankfut",
                R.drawable.bayer,
                "Bayer Munich",
                "2",
                "3",
                "Final del partido"
            )
        )

        lista.add(
            Partidos(

                R.drawable.premier,
                "Premier League",
                R.drawable.liver,
                "Liverpool",
                R.drawable.united,
                "Sheffield United",
                "4",
                "1",
                "Final del partido"
            )
        )


        return lista
    }




}