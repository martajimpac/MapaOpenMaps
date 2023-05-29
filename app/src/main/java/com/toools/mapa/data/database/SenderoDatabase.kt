package com.toools.mapa.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.toools.mapa.data.database.dao.SenderoDao
import com.toools.mapa.data.database.entities.SenderoEntity

@Database(entities = [SenderoEntity::class], version = 1)
abstract class SenderoDatabase: RoomDatabase() {
    abstract fun getSenderoDao(): SenderoDao
}