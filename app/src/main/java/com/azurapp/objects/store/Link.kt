package com.azurapp.objects.store

import com.azurapp.R

data class Link(val link: Int, val name: Int, val icon: Int) {

    companion object{
        fun web(link: Int) = Link(link, R.string.website, R.drawable.ic_link)
        fun facebook(link: Int)= Link(link, R.string.facebook, R.drawable.ic_facebook)
    }
}