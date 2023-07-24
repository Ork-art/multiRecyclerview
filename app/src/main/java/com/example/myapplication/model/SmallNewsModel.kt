package com.ork.simpleapp.model

data class SmallNewsModel(
    override val title:String,
    override val image:String
):BaseModel(title, image)