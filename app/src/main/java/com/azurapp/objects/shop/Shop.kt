package com.azurapp.objects.shop

/**
 * Data class representing a shop object.
 * @param name name.
 * @param icon icon.
 * @param activity activity. check [Activity].
 * @param description brief description.
 * @param phone main phone number.
 * @param mapID ID on the center's map.
 * @param level level in which the shop exists according to the center's map.
 */
data class Shop(
    val name : String,
    val icon : Int,
    val activity : Activity,
    val description : String,
    val phone : String,
    val mapID : Int,
    val level : Int
) {

}