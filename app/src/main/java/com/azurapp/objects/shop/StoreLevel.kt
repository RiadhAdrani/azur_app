package com.azurapp.objects.shop

import com.azurapp.R

data class StoreLevel(val level: Int, val name:Int) {

    companion object{
        val ground = StoreLevel(-1, R.string.ground_floor)
        val main = StoreLevel(0, R.string.main_floor)
        val first = StoreLevel(1, R.string.first_floor)
        val second = StoreLevel(2, R.string.second_floor)
    }

}