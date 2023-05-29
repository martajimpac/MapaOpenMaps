package com.toools.mapa.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.toools.mapa.data.database.entities.SenderoEntity

@Dao
interface SenderoDao {
    @Query("SELECT * FROM sendero_table WHERE id = :id")
    suspend fun getSenderoById(id: Int): SenderoEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSendero(sendero: SenderoEntity)

    @Query("DELETE FROM sendero_table")
    suspend fun deleteSendero()
}