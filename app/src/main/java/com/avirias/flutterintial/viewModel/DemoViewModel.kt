package com.avirias.flutterintial.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DemoViewModel : ViewModel() {

    private val _liveData = MutableLiveData<Int>(0)

    val data: LiveData<Int> = _liveData

    fun increase() {
        _liveData.value = _liveData.value?.plus(1)
    }
}