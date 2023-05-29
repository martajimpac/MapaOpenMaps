package com.toools.mapa.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.toools.mapa.data.database.dao.PuntoDao
import com.toools.mapa.data.database.entities.PuntoEntity

@Database(entities = [PuntoEntity::class], version = 1)
abstract class PuntoDatabase: RoomDatabase() {
    abstract fun getPuntoDao(): PuntoDao
}