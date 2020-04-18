package com.nfragiskatos.fruitpicker_databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Nicholas Fragiskatos on 4/18/2020.
 */
class MainViewModel : ViewModel() {
    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()
}