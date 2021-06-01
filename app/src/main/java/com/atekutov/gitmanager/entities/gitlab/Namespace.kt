package com.atekutov.gitmanager.entities.gitlab


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Namespace(
    @SerialName("avatar_url")
    val avatarUrl: String?,
    @SerialName("full_path")
    val fullPath: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("path")
    val path: String?,
    @SerialName("web_url")
    val webUrl: String?
)