package com.toools.mapa.domain.model

import com.toools.mapa.data.database.entities.SenderoEntity

data class Sendero(
    val id:Int,
    val url:String,
    val nombre:String,
    val descripcion:String,
    val estilo: String,
    var puntos: List<Punto>?
)
fun SenderoEntity.toDomain() = Sendero(id ,url,nombre, descripcion, estilo, puntos = null)
