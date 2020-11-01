package com.example.plantilla.clasedatos

import java.io.Serializable

data class Partidos (
    var IdLiga: Int,
    var Nliga: String,
    var IdEquipo1: Int,
    var Nequipo1:String,
    var IdEquipo2: Int,
    var Nequipo2: String,
    var marcador1: String,
    var marcador2: String,
    var resultadofinal: String
) : Serializable
