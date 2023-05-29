package com.toools.mapa.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.toools.mapa.domain.model.Punto

@Entity(tableName = "punto_table")
data class PuntoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "latitud") val latitud: Double,
    @ColumnInfo(name = "longitud") val longitud: Double,
    @ColumnInfo(name = "senderoId") val senderoId: Int,
)

fun Punto.toDatabase() = PuntoEntity(latitud = latitud, longitud = longitud, senderoId = senderoId)

/*
@Entity(tableName = "punto_table", //TODO NO SE SI ESTO ES NECESARIO
    foreignKeys = [ForeignKey (entity = PuntoEntity::class,
        parentColumns = ["id"],
        childColumns = ["senderoId"],
        onDelete = ForeignKey.CASCADE)]) */
