package com.example.plantilla.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plantilla.R
import com.example.plantilla.adaptadores.AdaptadorAlineacion
import com.example.plantilla.adaptadores.AdaptadorPartidos
import com.example.plantilla.clasedatos.Alineacion
import com.example.plantilla.clasedatos.Partidos
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.principalpartidospantalla.*


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