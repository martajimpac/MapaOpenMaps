package com.toools.mapa.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.toools.mapa.domain.model.Sendero

@Entity(tableName = "sendero_table")
data class SenderoEntity(
    @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "descripcion") val descripcion: String,
    @ColumnInfo(name = "estilo") val estilo: String,
)
fun Sendero.toDatabase() = SenderoEntity(id = id, url = url, nombre = nombre, descripcion = descripcion, estilo = estilo)