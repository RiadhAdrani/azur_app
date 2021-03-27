package com.util

import androidx.fragment.app.Fragment
import com.azurapp.R
import com.azurapp.objects.shop.Activity
import com.azurapp.objects.shop.Shop

fun activityToString(activity : Activity):String{

    return when (activity){
        Activity.All -> "All"
        Activity.KIDS_CLOTHING -> "Kids Clothing"
        Activity.MEN_CLOTHING -> "Men Clothing"
        Activity.WOMEN_CLOTHING -> "Women Clothing"
        Activity.FOOTWEAR -> "Footwear"
        Activity.GENERAL_CLOTHING -> "Clothing"
        Activity.TECH -> "Tech."
    }

}

fun activityImage(activity: Activity): Int{
    return R.drawable.pic_inside
}

fun getStatusBarHeight(fragment : Fragment): Int {
    var result = 0
    val resourceId = fragment.resources.getIdentifier("status_bar_height", "dimen", "android")
    if (resourceId > 0) {
        result = fragment.resources.getDimensionPixelSize(resourceId)
    }
    return result
}

fun levelToString(level: Int): String{
    return when (level){
        -1 -> "Ground Floor"
        0 -> "Main Floor"
        1 -> "First Floor"
        else -> "Main Floor"
    }
}

fun getLocalStoreList(): ArrayList<Shop> {

    val list = ArrayList<Shop>()
    list.add(Shop(
        name = "Adidas",
        icon = R.drawable.addidas,
        activity = Activity.FOOTWEAR,
        description = "Description",
        phone = "99888777",
        mapID = 1,
        level = 0)
    )

    list.add(Shop(
        name = "Gucci",
        icon = R.drawable.gucci,
        activity = Activity.GENERAL_CLOTHING,
        description = "Description",
        phone = "99888777",
        mapID = 16,
        level = 1)
    )

    list.add(Shop(
        name = "H&M",
        icon = R.drawable.hm,
        activity = Activity.GENERAL_CLOTHING,
        description = "Description",
        phone = "99888777",
        mapID = 8,
        level = -1)
    )

    list.add(Shop(
        name = "Nike",
        icon = R.drawable.nike,
        activity = Activity.FOOTWEAR,
        description = "Description",
        phone = "99888777",
        mapID = 24,
        level = 1)
    )

    list.add(Shop(
        name = "Polo Ralph Lauren",
        icon = R.drawable.polo,
        activity = Activity.GENERAL_CLOTHING,
        description = "Description",
        phone = "99888777",
        mapID = 4,
        level = -1)
    )

    list.add(Shop(
        name = "Apple",
        icon = R.drawable.addidas,
        activity = Activity.TECH,
        description = "Description",
        phone = "99888777",
        mapID = 6,
        level = 0)
    )

    list.add(Shop(
        name = "Adidas",
        icon = R.drawable.addidas,
        activity = Activity.FOOTWEAR,
        description = "Description",
        phone = "99888777",
        mapID = 1,
        level = 0)
    )

    list.add(Shop(
        name = "Gucci",
        icon = R.drawable.gucci,
        activity = Activity.GENERAL_CLOTHING,
        description = "Description",
        phone = "99888777",
        mapID = 16,
        level = 1)
    )

    list.add(Shop(
        name = "H&M",
        icon = R.drawable.hm,
        activity = Activity.GENERAL_CLOTHING,
        description = "Description",
        phone = "99888777",
        mapID = 8,
        level = -1)
    )

    list.add(Shop(
        name = "Nike",
        icon = R.drawable.nike,
        activity = Activity.FOOTWEAR,
        description = "Description",
        phone = "99888777",
        mapID = 24,
        level = 1)
    )

    list.add(Shop(
        name = "Polo Ralph Lauren",
        icon = R.drawable.polo,
        activity = Activity.GENERAL_CLOTHING,
        description = "Description",
        phone = "99888777",
        mapID = 4,
        level = -1)
    )

    list.add(Shop(
        name = "Apple",
        icon = R.drawable.addidas,
        activity = Activity.TECH,
        description = "Description",
        phone = "99888777",
        mapID = 6,
        level = 0)
    )

    return list
}