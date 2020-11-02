package com.example.plantilla.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantilla.clasedatos.Alineacion
import com.example.plantilla.R
import com.example.plantilla.actividades.Detalles
import kotlinx.android.synthetic.main.elemento_lista_jugador.view.*

class AdaptadorAlineacion (private var lista: ArrayList<Alineacion>, private var contexto: Context): RecyclerView.Adapter<AdaptadorAlineacion.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elemento_lista_jugador,
                parent,
                false
            ),
            contexto
        )
    }

    override fun getItemCount(): Int {
        return  lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(lista[position])
    }

    class ViewHolder(var vista: View, var contexto: Context): RecyclerView.ViewHolder(vista){
        fun bind(alineacion: Alineacion){
            vista.ImgAlin.setImageResource(alineacion.idImagen)
            vista.portero.text = alineacion.Alineacion1
            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalles::class.java).putExtra("Ali", alineacion))
            }
            }

    }

}