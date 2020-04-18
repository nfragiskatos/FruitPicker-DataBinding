package com.nfragiskatos.fruitpicker_databinding

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Nicholas Fragiskatos on 4/18/2020.
 */
class MainViewModel : ViewModel() {
    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()

    /*
    This is 2-way databinding. When value changes in code it will change on screen, and when the
    value changes on screen it will change in code
     */
    @Bindable
    val editTextContent = MutableLiveData<String>()
}