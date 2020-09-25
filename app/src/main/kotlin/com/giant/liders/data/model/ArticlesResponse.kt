package com.giant.liders.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesResponse(
    val articles: List<Article>?,
)

@Serializable
@Parcelize
data class Article(
    val banner : String?,
) : Parcelable

@Serializable
@Parcelize
data class Lider(
    val name: String?,
) : Parcelable