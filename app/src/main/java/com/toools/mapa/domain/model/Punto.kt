package com.toools.mapa.domain.model

import com.toools.mapa.data.database.entities.PuntoEntity

data class Punto(
    val latitud: Double,
    val longitud: Double,
    val senderoId: Int,
)
fun PuntoEntity.toDomain() = Punto(latitud, longitud, senderoId)
