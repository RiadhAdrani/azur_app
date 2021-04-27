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

fun getLocalRestaurantList(): ArrayList<Store>{
    val list = ArrayList<Store>()

    // -------------------------------------------------------------------------------------------
    // BAGUETTE & BAGUETTE
    list.add(Store(
        name = R.string.store_baguette_baguette,
        icon = R.drawable.ic_store_baguette_baguette,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_baguette_baguette_des,
        phone = R.string.store_baguette_baguette_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_baguette_baguette_fb),
            Link.web(R.string.store_baguette_baguette_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // CHILLIS
    list.add(Store(
        name = R.string.store_chillis,
        icon = R.drawable.ic_store_chillis,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_chillis_des,
        phone = R.string.store_chillis_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_chillis_fb),
            Link.web(R.string.store_chillis_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // HOBO
    list.add(Store(
        name = R.string.store_hobo,
        icon = R.drawable.ic_store_hobo,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_hobo_des,
        phone = R.string.store_hobo_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_hobo_fb),
            Link.web(R.string.store_hobo_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // KFC
    list.add(Store(
        name = R.string.store_kfc,
        icon = R.drawable.ic_store_kfc,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_kfc_des,
        phone = R.string.store_kfc_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_kfc_fb),
            Link.web(R.string.store_kfc_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // LEGEND'S
    list.add(Store(
        name = R.string.store_legends,
        icon = R.drawable.ic_store_legends,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_legends_des,
        phone = R.string.store_legends_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_legends_fb),
            Link.web(R.string.store_legends_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PAPA JOHN'S
    list.add(Store(
        name = R.string.store_papa_johns,
        icon = R.drawable.ic_store_papa_johns,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_papa_johns_des,
        phone = R.string.store_papa_johns_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_papa_johns_fb),
            Link.web(R.string.store_papa_johns_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ECHEMI
    list.add(Store(
        name = R.string.store_echemi,
        icon = R.drawable.ic_store_echemi,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_echemi_des,
        phone = R.string.store_echemi_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_echemi_fb),
            Link.web(R.string.store_echemi_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // 66KIF
    list.add(Store(
        name = R.string.store_99kif,
        icon = R.drawable.ic_store_99kif,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_99kif_des,
        phone = R.string.store_99kif_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_99kif_fb),
            Link.web(R.string.store_99kif_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // POMME DE PAIN
    list.add(Store(
        name = R.string.store_pomme_de_pain,
        icon = R.drawable.ic_store_pomme_de_pain,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_pomme_de_pain_des,
        phone = R.string.store_pomme_de_pain_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_pomme_de_pain_fb),
            Link.web(R.string.store_pomme_de_pain_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // BARIOLO
    list.add(Store(
        name = R.string.store_bariolo,
        icon = R.drawable.ic_store_bariolo,
        activity =  ArrayList(arrayListOf(Activity.restaurant)),
        description = R.string.store_bariolo_des,
        phone = R.string.store_bariolo_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_bariolo_fb),
            Link.web(R.string.store_bariolo_web)
        ))
    ))

    return list
}


fun getLocalStoreList(): ArrayList<Store> {

    val list = ArrayList<Store>()

    // -------------------------------------------------------------------------------------------
    // ALDO
    list.add(Store(
        name = R.string.store_aldo,
        icon = R.drawable.ic_store_aldo,
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
        icon = R.drawable.ic_store_sens_inverse,
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
        icon = R.drawable.ic_store_maha_modern,
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
        icon = R.drawable.ic_store_yves_rocher,
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
        icon = R.drawable.ic_store_nine_west,
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
        icon = R.drawable.ic_store_pimkie,
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
        icon = R.drawable.ic_store_moda_vinci,
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
        icon = R.drawable.ic_store_ecovillage,
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
        icon = R.drawable.ic_store_hmila,
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
        icon = R.drawable.ic_store_hummel,
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
        icon = R.drawable.ic_store_pretty_woman,
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
        icon = R.drawable.ic_store_ile_aux_bijoux,
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
        icon = R.drawable.ic_store_women_secret,
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
        icon = R.drawable.ic_store_fatales,
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
        icon = R.drawable.ic_store_orange,
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
        icon = R.drawable.ic_store_manuella,
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
        name = R.string.store_balti_optique,
        icon = R.drawable.ic_store_balti_optic,
        activity =  ArrayList(arrayListOf(Activity.optics)),
        description = R.string.store_balti_optique_des,
        phone = R.string.store_balti_optique_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_balti_optique_fb),
            Link.web(R.string.store_balti_optique_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // FAOUZIA FRAD
    list.add(Store(
        name = R.string.store_faouzia_frad,
        icon = R.drawable.ic_store_faouzia_frad,
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
        icon = R.drawable.ic_store_etam,
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
        icon = R.drawable.ic_store_naf_naf,
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
        icon = R.drawable.ic_store_beltoni,
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
        icon = R.drawable.ic_store_kareena,
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
        icon = R.drawable.ic_store_parfois,
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

    // -------------------------------------------------------------------------------------------
    // SAMSUNG
    list.add(Store(
        name = R.string.store_samsung,
        icon = R.drawable.ic_store_samsung,
        activity =  ArrayList(arrayListOf(Activity.service,Activity.telecom)),
        description = R.string.store_samsung_des,
        phone = R.string.store_samsung_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_samsung_fb),
            Link.web(R.string.store_samsung_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ARCHIPEL
    list.add(Store(
        name = R.string.store_archipel,
        icon = R.drawable.ic_store_archipel,
        activity =  ArrayList(arrayListOf(Activity.furniture)),
        description = R.string.store_archipel_des,
        phone = R.string.store_archipel_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_archipel_fb),
            Link.web(R.string.store_archipel_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // GIFT STORY
    list.add(Store(
        name = R.string.store_gift_story,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.watchmaking)),
        description = R.string.store_gift_story_des,
        phone = R.string.store_gift_story_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_gift_story_fb),
            Link.web(R.string.store_gift_story_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // SPEC S OPTIQUE
    list.add(Store(
        name = R.string.store_specs_optique,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.optics)),
        description = R.string.store_specs_optique_des,
        phone = R.string.store_specs_optique_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_specs_optique_fb),
            Link.web(R.string.store_specs_optique_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // CITY WATCH
    list.add(Store(
        name = R.string.store_city_watch,
        icon = R.drawable.ic_store_city_watch,
        activity =  ArrayList(arrayListOf(Activity.watchmaking)),
        description = R.string.store_city_watch_des,
        phone = R.string.store_city_watch_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_city_watch_fb),
            Link.web(R.string.store_city_watch_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // LUFIAN
    list.add(Store(
        name = R.string.store_lufian,
        icon = R.drawable.ic_store_lufian,
        activity =  ArrayList(arrayListOf(Activity.readyToWearMen)),
        description = R.string.store_lufian_des,
        phone = R.string.store_lufian_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_lufian_fb),
            Link.web(R.string.store_lufian_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // STAR WATCHES
    list.add(Store(
        name = R.string.store_star_watches,
        icon = R.drawable.ic_store_star_watches,
        activity =  ArrayList(arrayListOf(Activity.watchmaking)),
        description = R.string.store_star_watches_des,
        phone = R.string.store_star_watches_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_star_watches_fb),
            Link.web(R.string.store_star_watches_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ELU
    list.add(Store(
        name = R.string.store_elu,
        icon = R.drawable.ic_store_elu,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_elu_des,
        phone = R.string.store_elu_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_elu_fb),
            Link.web(R.string.store_elu_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // L OCCITANE
    list.add(Store(
        name = R.string.store_loccitane,
        icon = R.drawable.ic_store_loccitane,
        activity =  ArrayList(arrayListOf(Activity.cosmetics)),
        description = R.string.store_loccitane_des,
        phone = R.string.store_loccitane_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_loccitane_fb),
            Link.web(R.string.store_loccitane_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // STRASS
    list.add(Store(
        name = R.string.store_strass,
        icon = R.drawable.ic_store_strass,
        activity =  ArrayList(arrayListOf(Activity.jewelry)),
        description = R.string.store_strass_des,
        phone = R.string.store_strass_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_strass_fb),
            Link.web(R.string.store_strass_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PENTI
    list.add(Store(
        name = R.string.store_penti,
        icon = R.drawable.ic_store_penti,
        activity =  ArrayList(arrayListOf(Activity.lingerie)),
        description = R.string.store_penti_des,
        phone = R.string.store_penti_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_penti_fb),
            Link.web(R.string.store_penti_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // TIFFOSI
    list.add(Store(
        name = R.string.store_tiffosi,
        icon = R.drawable.ic_store_tiffosi,
        activity =  ArrayList(arrayListOf(Activity.readyToWearMen)),
        description = R.string.store_tiffosi_des,
        phone = R.string.store_tiffosi_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_tiffosi_fb),
            Link.web(R.string.store_tiffosi_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // TEMPUS
    list.add(Store(
        name = R.string.store_tempus,
        icon = R.drawable.ic_store_tempus,
        activity =  ArrayList(arrayListOf(Activity.watchmaking)),
        description = R.string.store_tempus_des,
        phone = R.string.store_tempus_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_tempus_fb),
            Link.web(R.string.store_tempus_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // GIMEL
    list.add(Store(
        name = R.string.store_gimel,
        icon = R.drawable.ic_store_gimel,
        activity =  ArrayList(arrayListOf(Activity.readyToWearKids)),
        description = R.string.store_gimel_des,
        phone = R.string.store_gimel_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_gimel_fb),
            Link.web(R.string.store_gimel_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // GIOSEPPO
    list.add(Store(
        name = R.string.store_gioseppo,
        icon = R.drawable.ic_store_gioseppo,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_gioseppo_des,
        phone = R.string.store_gioseppo_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_gioseppo_fb),
            Link.web(R.string.store_gioseppo_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // COSMITO
    list.add(Store(
        name = R.string.store_cosmito,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.cafeteria)),
        description = R.string.store_cosmito_des,
        phone = R.string.store_cosmito_phone,
        mapID = 50,
        level = StoreLevel.second,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_cosmito_fb),
            Link.web(R.string.store_cosmito_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PEAK
    list.add(Store(
        name = R.string.store_peak,
        icon = R.drawable.ic_store_peak,
        activity =  ArrayList(arrayListOf(Activity.sport)),
        description = R.string.store_peak_des,
        phone = R.string.store_peak_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_peak_fb),
            Link.web(R.string.store_peak_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // JOLIESSE
    list.add(Store(
        name = R.string.store_joliesse,
        icon = R.drawable.ic_store_joliesse,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_joliesse_des,
        phone = R.string.store_joliesse_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_joliesse_fb),
            Link.web(R.string.store_joliesse_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // SPRINGFIELD
    list.add(Store(
        name = R.string.store_springfield,
        icon = R.drawable.ic_store_springfield,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_springfield_des,
        phone = R.string.store_springfield_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_springfield_fb),
            Link.web(R.string.store_springfield_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // SEBAGO CAT
    list.add(Store(
        name = R.string.store_sebago_cat,
        icon = R.drawable.ic_store_sebago,
        activity =  ArrayList(arrayListOf(Activity.sport)),
        description = R.string.store_sebago_cat_des,
        phone = R.string.store_sebago_cat_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_sebago_cat_fb),
            Link.web(R.string.store_sebago_cat_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // WAEL OPTIC
    list.add(Store(
        name = R.string.store_wael_optic,
        icon = R.drawable.ic_store_wael_optic,
        activity =  ArrayList(arrayListOf(Activity.optics)),
        description = R.string.store_wael_optic_des,
        phone = R.string.store_wael_optic_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_wael_optic_fb),
            Link.web(R.string.store_wael_optic_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // POLARIS
    list.add(Store(
        name = R.string.store_polaris,
        icon = R.drawable.ic_store_polaris,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_polaris_des,
        phone = R.string.store_polaris_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_polaris_fb),
            Link.web(R.string.store_polaris_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // LEE COOPER LOIS
    list.add(Store(
        name = R.string.store_lee_cooper_lois,
        icon = R.drawable.ic_store_lee_cooper,
        activity =  ArrayList(arrayListOf(Activity.sport)),
        description = R.string.store_lee_cooper_lois_des,
        phone = R.string.store_lee_cooper_lois_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_lee_cooper_lois_fb),
            Link.web(R.string.store_lee_cooper_lois_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // LA SCARFA
    list.add(Store(
        name = R.string.store_la_scarfa,
        icon = R.drawable.ic_store_la_scarfa,
        activity =  ArrayList(arrayListOf(Activity.jewelry)),
        description = R.string.store_la_scarfa_des,
        phone = R.string.store_la_scarfa_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_la_scarfa_fb),
            Link.web(R.string.store_la_scarfa_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // PITILLOS
    list.add(Store(
        name = R.string.store_pitillos,
        icon = R.drawable.ic_store_pitillos,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_pitillos_des,
        phone = R.string.store_pitillos_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_pitillos_fb),
            Link.web(R.string.store_pitillos_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // COURIR
    list.add(Store(
        name = R.string.store_courir,
        icon = R.drawable.ic_store_courir,
        activity =  ArrayList(arrayListOf(Activity.sport)),
        description = R.string.store_courir_des,
        phone = R.string.store_courir_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_courir_fb),
            Link.web(R.string.store_courir_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // DU PAREIL AU MEME
    list.add(Store(
        name = R.string.store_du_pareil_au_meme,
        icon = R.drawable.ic_store_du_pareil_au_meme,
        activity =  ArrayList(arrayListOf(Activity.readyToWearKids)),
        description = R.string.store_du_pareil_au_meme_des,
        phone = R.string.store_du_pareil_au_meme_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_du_pareil_au_meme_fb),
            Link.web(R.string.store_du_pareil_au_meme_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ENZO
    list.add(Store(
        name = R.string.store_enzo,
        icon = R.drawable.ic_store_enzo,
        activity =  ArrayList(arrayListOf(Activity.watchmaking)),
        description = R.string.store_enzo_des,
        phone = R.string.store_enzo_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_enzo_fb),
            Link.web(R.string.store_enzo_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // XTI
    list.add(Store(
        name = R.string.store_xti,
        icon = R.drawable.ic_store_xti,
        activity =  ArrayList(arrayListOf(Activity.shoes)),
        description = R.string.store_xti_des,
        phone = R.string.store_xti_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_xti_fb),
            Link.web(R.string.store_xti_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // KIABI
    list.add(Store(
        name = R.string.store_kiabi,
        icon = R.drawable.ic_store_kiabi,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_kiabi_des,
        phone = R.string.store_kiabi_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_kiabi_fb),
            Link.web(R.string.store_kiabi_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // H&M
    list.add(Store(
        name = R.string.store_hm,
        icon = R.drawable.ic_store_hm,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_hm_des,
        phone = R.string.store_hm_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_hm_fb),
            Link.web(R.string.store_hm_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // LINDEX
    list.add(Store(
        name = R.string.store_lindex,
        icon = R.drawable.ic_store_lindex,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_lindex_des,
        phone = R.string.store_lindex_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_lindex_fb),
            Link.web(R.string.store_lindex_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ITALCAR
    list.add(Store(
        name = R.string.store_italcar,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.showroom)),
        description = R.string.store_italcar_des,
        phone = R.string.store_italcar_phone,
        mapID = 50,
        level = StoreLevel.main,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_italcar_fb),
            Link.web(R.string.store_italcar_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // KOTON
    list.add(Store(
        name = R.string.store_koton,
        icon = R.drawable.ic_store_koton,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_koton_des,
        phone = R.string.store_koton_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_koton_fb),
            Link.web(R.string.store_koton_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // HA
    list.add(Store(
        name = R.string.store_ha,
        icon = R.drawable.ic_store_ha,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_ha_des,
        phone = R.string.store_ha_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_ha_fb),
            Link.web(R.string.store_ha_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // HENI COLLECTION
    list.add(Store(
        name = R.string.store_heni_collection,
        icon = R.drawable.ic_store_heni_collection,
        activity =  ArrayList(arrayListOf(Activity.readyToWearMen)),
        description = R.string.store_heni_collection_des,
        phone = R.string.store_heni_collection_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_heni_collection_fb),
            Link.web(R.string.store_heni_collection_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // EXIST
    list.add(Store(
        name = R.string.store_exist,
        icon = R.drawable.ic_store_exist,
        activity =  ArrayList(arrayListOf(Activity.readyToWearMen)),
        description = R.string.store_exist_des,
        phone = R.string.store_exist_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_exist_fb),
            Link.web(R.string.store_exist_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // CARAJA
    list.add(Store(
        name = R.string.store_caraja,
        icon = R.drawable.ic_store,
        activity =  ArrayList(arrayListOf(Activity.linens)),
        description = R.string.store_caraja_des,
        phone = R.string.store_caraja_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_caraja_fb),
            Link.web(R.string.store_caraja_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // GO SPORT
    list.add(Store(
        name = R.string.store_go_store,
        icon = R.drawable.ic_store_go_sport,
        activity =  ArrayList(arrayListOf(Activity.sport)),
        description = R.string.store_go_store_des,
        phone = R.string.store_go_store_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_go_store_fb),
            Link.web(R.string.store_go_store_web)
        ))
    ))

    // -------------------------------------------------------------------------------------------
    // ZEN
    list.add(Store(
        name = R.string.store_zen,
        icon = R.drawable.ic_store_zen,
        activity =  ArrayList(arrayListOf(Activity.readyToWear)),
        description = R.string.store_zen_des,
        phone = R.string.store_zen_phone,
        mapID = 50,
        level = StoreLevel.first,
        links = ArrayList(arrayListOf(
            Link.facebook(R.string.store_zen_fb),
            Link.web(R.string.store_zen_web)
        ))
    ))



    return list
}