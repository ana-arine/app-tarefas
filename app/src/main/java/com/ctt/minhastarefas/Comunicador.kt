package com.ctt.minhastarefas

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Comunicador : ViewModel() {

    val mensagem = MutableLiveData<MutableList<String>>()

    fun msgCommunicador (lista: MutableList<String>) {
        mensagem.value = lista
    }
}