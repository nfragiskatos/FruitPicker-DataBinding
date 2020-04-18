package com.nfragiskatos.fruitpicker_databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.nfragiskatos.fruitpicker_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        /*
        ActivityMainBinding is an auto generated class. Whenever you use the <layout> + <data> tags in your activity xml
        the class will be auto-generated
        Boilerplate code....
         */
        DataBindingUtil.setContentView<ActivityMainBinding>(
            this, R.layout.activity_main
        ).apply {
            this.lifecycleOwner = this@MainActivity
            this.viewmodel = mainViewModel
        }

    }
}
