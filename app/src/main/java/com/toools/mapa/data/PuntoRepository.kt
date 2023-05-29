package com.toools.mapa.data

import com.toools.mapa.data.database.dao.PuntoDao
import com.toools.mapa.data.database.entities.PuntoEntity
import com.toools.mapa.domain.model.Punto
import com.toools.mapa.domain.model.toDomain
import javax.inject.Inject

class PuntoRepository @Inject constructor(
    private val puntoDao: PuntoDao
) {

    suspend fun getAllPuntosByIdFromDatabase(senderoId : Int): List<Punto> {
        val response: List<PuntoEntity> = puntoDao.getPuntosById(senderoId)
        return response.map { it.toDomain() }
    }

    suspend fun insertPuntos(puntos: List<PuntoEntity>) {
        puntoDao.insertAllPuntos(puntos)
    }

    suspend fun clearPuntos(){
        puntoDao.deleteAllPuntos()
    }
}