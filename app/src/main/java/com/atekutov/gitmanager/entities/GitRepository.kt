package com.atekutov.gitmanager.entities

interface GitRepository {

    val object_id: Int
    val title: String?
    val titleFull: String?
    val starsCount: Int?
    val imageUrl: String?
    val browserLink: String?
    val isPrivate: Boolean
}