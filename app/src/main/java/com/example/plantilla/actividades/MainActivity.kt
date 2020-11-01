package com.example.plantilla.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plantilla.R
import com.example.plantilla.adaptadores.AdaptadorAlineacion
import com.example.plantilla.clasedatos.Alineacion
import kotlinx.android.synthetic.main.activity_main.*


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
    }

    private  fun generarDatosPrueba() : ArrayList<Alineacion>{
        val lista = ArrayList<Alineacion>()

        lista.add(
            Alineacion(

                R.drawable.portero,
                "Porteros",
                "Neto",
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
                "Messi"
            )
        )

        return lista
        }




}