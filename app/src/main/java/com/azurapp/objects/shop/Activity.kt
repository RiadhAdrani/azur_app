package com.azurapp.objects.shop

import com.azurapp.R

data class Activity(val id: Int, val name: Int) {

    companion object {

        val all = Activity(0, R.string.all)
        val shoes = Activity(1, R.string.activity_shoes)
        val readyToWear = Activity(2, R.string.activity_ready_to_wear)
        val readyToWearWomen = Activity(3, R.string.activity_ready_to_wear_women)
        val readyToWearMen = Activity(4, R.string.activity_ready_to_wear_men)
        val readyToWearKids = Activity(5, R.string.activity_ready_to_wear_kids)
        val cosmetics = Activity(6, R.string.activity_cosmetics)
        val decoration = Activity(7, R.string.activity_decoration)
        val sport = Activity(8, R.string.activity_sport)
        val perfumery = Activity(9, R.string.activity_perfumery)
        val jewelry = Activity(10, R.string.activity_jewelry)
        val lingerie = Activity(11, R.string.activity_lingerie)
        val service = Activity(12, R.string.activity_service)
        val optics = Activity(13, R.string.activity_optics)
        val furniture = Activity(14, R.string.activity_furniture)
        val cafeteria = Activity(15, R.string.activity_cafeteria)
        val showroom = Activity(16, R.string.activity_showroom)
        val linens = Activity(17, R.string.activity_linens)
        val restaurant = Activity(18, R.string.activity_restaurant)

    }
}