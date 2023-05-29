package com.toools.mapa.domain.model

import com.toools.mapa.data.PuntoRepository
import com.toools.mapa.data.SenderoRepository
import com.toools.mapa.data.database.entities.toDatabase
import javax.inject.Inject

class InsertaSenderoUseCase @Inject constructor(private val senderoRepository: SenderoRepository, private val puntoRepository: PuntoRepository){

    suspend operator fun invoke(sendero: Sendero){

        senderoRepository.insertSendero(sendero.toDatabase())
        sendero.puntos?.let{
            puntoRepository.insertPuntos(it.map { it.toDatabase() })
        }
    }
}