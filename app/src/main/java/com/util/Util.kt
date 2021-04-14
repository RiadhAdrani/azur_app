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

    // -------------------------------------------------------------------------------------------
    // ALDO
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

    // -------------------------------------------------------------------------------------------
    // SENS-INVERSE
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

    // -------------------------------------------------------------------------------------------
    // MAHA MODERN
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

    // -------------------------------------------------------------------------------------------
    // YVES ROCHER
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

    // -------------------------------------------------------------------------------------------
    // NINE WEST
    list.add(Store(
        name = R.string.store_nine_west,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_nine_west_des,
        phone = R.string.store_nine_west_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_nine_west_fb),
            Link.web(R.string.store_nine_west_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PIMKIE
    list.add(Store(
        name = R.string.store_pimkie,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearWomen)),
        description = R.string.store_pimkie_des,
        phone = R.string.store_pimkie_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_pimkie_fb),
            Link.web(R.string.store_pimkie_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // MODA VINCI
    list.add(Store(
        name = R.string.store_moda_vinci,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearMen)),
        description = R.string.store_moda_vinci_des,
        phone = R.string.store_moda_vinci_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_moda_vinci_fb),
            Link.web(R.string.store_moda_vinci_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ECOVILLAGE
    list.add(Store(
        name = R.string.store_ecovillage,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.cosmetics)),
        description = R.string.store_ecovillage_des,
        phone = R.string.store_ecovillage_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_ecovillage_fb),
            Link.web(R.string.store_ecovillage_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // HMILA
    list.add(Store(
        name = R.string.store_hmila,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.decoration)),
        description = R.string.store_hmila_des,
        phone = R.string.store_hmila_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_hmila_fb),
            Link.web(R.string.store_hmila_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // HUMMEL
    list.add(Store(
        name = R.string.store_hummel,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.sport)),
        description = R.string.store_hummel_des,
        phone = R.string.store_hummel_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_hummel_fb),
            Link.web(R.string.store_hummel_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PRETTY WOMAN
    list.add(Store(
        name = R.string.store_pretty_women,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.perfumery)),
        description = R.string.store_pretty_women_des,
        phone = R.string.store_pretty_women_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_pretty_women_fb),
            Link.web(R.string.store_pretty_women_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // L'ILE AUX BIJOUX
    list.add(Store(
        name = R.string.store_lile_aux_bijoux,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.jewelry)),
        description = R.string.store_lile_aux_bijoux_des,
        phone = R.string.store_lile_aux_bijoux_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_lile_aux_bijoux_fb),
            Link.web(R.string.store_lile_aux_bijoux_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // WOMEN SECRET
    list.add(Store(
        name = R.string.store_women_secret,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.lingerie)),
        description = R.string.store_women_secret_des,
        phone = R.string.store_women_secret_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_women_secret_fb),
            Link.web(R.string.store_women_secret_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // FATALES
    list.add(Store(
        name = R.string.store_fatales,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.perfumery)),
        description = R.string.store_fatales_des,
        phone = R.string.store_fatales_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_fatales_fb),
            Link.web(R.string.store_fatales_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ORANGE
    list.add(Store(
        name = R.string.store_orange,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.service)),
        description = R.string.store_orange_des,
        phone = R.string.store_orange_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_orange_fb),
            Link.web(R.string.store_orange_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // MANUELLA
    list.add(Store(
        name = R.string.store_manuella,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_manuella_des,
        phone = R.string.store_manuella_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_manuella_fb),
            Link.web(R.string.store_manuella_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // BALI OPTIQUE
    list.add(Store(
        name = R.string.store_bali_optique,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.optics)),
        description = R.string.store_bali_optique_des,
        phone = R.string.store_bali_optique_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_bali_optique_fb),
            Link.web(R.string.store_bali_optique_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // FAOUZIA FRAD
    list.add(Store(
        name = R.string.store_faouzia_frad,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearWomen)),
        description = R.string.store_faouzia_frad_des,
        phone = R.string.store_faouzia_frad_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_faouzia_frad_fb),
            Link.web(R.string.store_faouzia_frad_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ETAM
    list.add(Store(
        name = R.string.store_etam,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.lingerie)),
        description = R.string.store_etam_des,
        phone = R.string.store_etam_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_etam_fb),
            Link.web(R.string.store_etam_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // NAF NAF
    list.add(Store(
        name = R.string.store_naf_naf,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearWomen)),
        description = R.string.store_naf_naf_des,
        phone = R.string.store_naf_naf_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_naf_naf_fb),
            Link.web(R.string.store_naf_naf_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // BELTONI
    list.add(Store(
        name = R.string.store_beltoni,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_beltoni_des,
        phone = R.string.store_beltoni_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_beltoni_fb),
            Link.web(R.string.store_beltoni_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // KAREENA
    list.add(Store(
        name = R.string.store_kareena,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearWomen)),
        description = R.string.store_kareena_des,
        phone = R.string.store_kareena_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_kareena_fb),
            Link.web(R.string.store_kareena_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // 123
    list.add(Store(
        name = R.string.store_123,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.readyToWearWomen)),
        description = R.string.store_123_des,
        phone = R.string.store_123_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_123_fb),
            Link.web(R.string.store_123_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PARFOIS
    list.add(Store(
        name = R.string.store_parfois,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.jewelry)),
        description = R.string.store_parfois_des,
        phone = R.string.store_parfois_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_parfois_fb),
            Link.web(R.string.store_parfois_web)
        ))
    ))

    return list
}