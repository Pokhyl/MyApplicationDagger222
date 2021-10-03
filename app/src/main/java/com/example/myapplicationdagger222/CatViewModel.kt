package com.example.myapplicationdagger222


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CatViewModel: ViewModel() {
    val selected = MutableLiveData<String>()
    val catLiveData = MutableLiveData<Cat>()
init {
    selected.value = "lifeData"
    catLiveData.value = Cat("barsik", 10)
}
    fun select(item: String) {
        selected.value = item
    }
    fun setCatLifData(cat: Cat){
        catLiveData.value = cat
    }
}