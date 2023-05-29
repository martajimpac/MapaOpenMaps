package com.toools.mapa.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.toools.mapa.data.database.entities.PuntoEntity

@Dao
interface PuntoDao {
    @Query("SELECT * FROM punto_table WHERE senderoId = :senderoId") //TODO: get puntos by id
    suspend fun getPuntosById(senderoId: Int): List<PuntoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllPuntos(puntos:List<PuntoEntity>)

    @Query("DELETE FROM punto_table")
    suspend fun deleteAllPuntos()
}