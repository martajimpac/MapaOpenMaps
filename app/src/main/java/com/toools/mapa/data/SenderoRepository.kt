package com.toools.mapa.data

import com.toools.mapa.data.database.dao.SenderoDao
import com.toools.mapa.data.database.entities.SenderoEntity
import com.toools.mapa.domain.model.Sendero
import com.toools.mapa.domain.model.toDomain
import javax.inject.Inject

class SenderoRepository @Inject constructor(
    private val senderoDao: SenderoDao
) {

    suspend fun getSenderoByIdFromDatabase(id : Int): Sendero? {
        val response: SenderoEntity? = senderoDao.getSenderoById(id)
        if (response != null) {
            return response.toDomain()
        } else return null
    }

    suspend fun insertSendero(sendero: SenderoEntity) {
        senderoDao.insertSendero(sendero)
    }

    suspend fun clearSendero(){
        senderoDao.deleteSendero()
    }
}