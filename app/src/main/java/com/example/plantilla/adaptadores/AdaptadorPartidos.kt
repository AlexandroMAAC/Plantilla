package com.example.plantilla.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.elemento_partidos.view.*


class AdaptadorPartidos (private var lista: ArrayList<Partidos>, private var contexto: Context): RecyclerView.Adapter<AdaptadorPartidos.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.elemento_partidos,
                    parent,
                    false
                ),
                contexto
            )
        }

        override fun getItemCount(): Int {
            return lista.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(lista[position])
        }

        class ViewHolder(var vista: View, var contexto: Context) : RecyclerView.ViewHolder(vista) {
            fun bind(partidos: Partidos) {
                vista.imgliga.setImageResource(partidos.IdLiga)
                vista.txtliga.text = partidos.Nliga
                vista.imgequipo1.setImageResource(partidos.IdEquipo1)
                vista.txtequipo1.text = partidos.Nequipo1
                vista.imgequipo2.setImageResource(partidos.IdEquipo2)
                vista.txtequipo2.text = partidos.Nequipo2
                vista.txtmarcador1.text = partidos.marcador1
                vista.marcador2.text = partidos.marcador2
                vista.txtfinal.text = partidos.resultadofinal
            }

        }

    }
