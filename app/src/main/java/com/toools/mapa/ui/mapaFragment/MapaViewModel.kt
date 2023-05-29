package com.toools.mapa.ui.mapaFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.toools.mapa.R
import com.toools.mapa.core.Resource
import com.toools.mapa.domain.model.GetSenderoUseCase
import com.toools.mapa.domain.model.InsertaSenderoUseCase
import com.toools.mapa.domain.model.Sendero
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapaViewModel @Inject constructor(private val insertaSenderoUseCase: InsertaSenderoUseCase, private val getSenderoUseCase: GetSenderoUseCase): ViewModel() {
    val insertaSenderoLiveData: MutableLiveData<Resource<String>> = MutableLiveData()
    val getSenderoLiveData: MutableLiveData<Resource<Sendero>> = MutableLiveData()

    fun insertaSendero(sendero: Sendero) {
        viewModelScope.launch {
            insertaSenderoLiveData.value = Resource.loading()
            try{
                insertaSenderoUseCase.invoke(sendero)
                insertaSenderoLiveData.value = Resource.success(null)
            }catch (e: Exception){
                insertaSenderoLiveData.value = Resource.error(R.string.inserta_sendero_error.toString())
            }
        }
    }

    fun getSendero(id : Int) {
        viewModelScope.launch {
            getSenderoLiveData.value = Resource.loading()
            var response = getSenderoUseCase.invoke(id)
            if (response!=null && !response.puntos.isNullOrEmpty()) {
                getSenderoLiveData.value = Resource.success(response)
            } else {
                getSenderoLiveData.value = Resource.error(R.string.recupera_sendero_error.toString())
            }
        }
    }
}