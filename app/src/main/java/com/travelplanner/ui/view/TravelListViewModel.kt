package com.travelplanner.ui.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TravelListViewModel: ViewModel() {

    companion object{}
    val title = MutableLiveData<String>()
    val price = MutableLiveData<String>()

    fun getTitle(): LiveData<String>{
        return title
    }

    fun getPrice(): LiveData<String>{
        return price
    }
}