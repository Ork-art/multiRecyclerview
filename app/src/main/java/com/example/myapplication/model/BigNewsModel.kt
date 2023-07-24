package com.ork.simpleapp.model


data class BigNewsModel(
    override val title: String,
    override val image: String,
    val description: String,
) : BaseModel(title,image)