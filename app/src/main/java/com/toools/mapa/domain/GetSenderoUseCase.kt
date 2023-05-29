package com.toools.mapa.domain.model

import com.toools.mapa.data.PuntoRepository
import com.toools.mapa.data.SenderoRepository
import javax.inject.Inject

class GetSenderoUseCase @Inject constructor(private val senderoRepository: SenderoRepository, private val puntoRepository: PuntoRepository){

    suspend operator fun invoke(id : Int): Sendero? {

        val sendero = senderoRepository.getSenderoByIdFromDatabase(id)
        val puntos = puntoRepository.getAllPuntosByIdFromDatabase(id)
        sendero?.puntos = puntos
        return(sendero)
    }
}