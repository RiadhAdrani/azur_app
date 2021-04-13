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
data class Store(
    val name : Int,
    val icon : Int,
    val activity : ArrayList<Activity>,
    val description : Int,
    val phone : Int,
    val mapID : Int,
    val level : StoreLevel,
    val links : ArrayList<Link>,
) {

}