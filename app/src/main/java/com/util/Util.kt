package com.util

import androidx.fragment.app.Fragment
import com.azurapp.R
import com.azurapp.objects.shop.Activity
import com.azurapp.objects.shop.Link
import com.azurapp.objects.shop.Store
import com.azurapp.objects.shop.StoreLevel


fun activityImage(): Int{
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


fun getLocalStoreList(): ArrayList<Store> {

    val list = ArrayList<Store>()

    list.add(Store(
        name = R.string.store_aldo,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_aldo_des,
        phone = R.string.store_aldo_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_aldo_fb),
            Link.web(R.string.store_aldo_web)
        ))
    ))

    list.add(Store(
        name = R.string.store_sens_inverse,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_sens_inverse_des,
        phone = R.string.store_sens_inverse_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_sens_inverse_fb),
            Link.web(R.string.store_sens_inverse_web)
        ))
    ))

    list.add(Store(
        name = R.string.store_maha_modern,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearWomen)),
        description = R.string.store_maha_modern_des,
        phone = R.string.store_maha_modern_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_maha_modern_fb),
            Link.web(R.string.store_maha_modern_web)
        ))
    ))

    list.add(Store(
        name = R.string.store_yves_rocher,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.cosmetics)),
        description = R.string.store_yves_rocher_des,
        phone = R.string.store_yves_rocher_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_yves_rocher_fb),
            Link.web(R.string.store_yves_rocher_web)
        ))
    ))

    return list
}