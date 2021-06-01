package com.atekutov.gitmanager.entities.gitlab


import com.atekutov.gitmanager.entities.GitRepository
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GitLabRepository(
    @SerialName("avatar_url")
    val avatarUrl: String?,
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("default_branch")
    val defaultBranch: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("forks_count")
    val forksCount: Int?,
    @SerialName("http_url_to_repo")
    val httpUrlToRepo: String?,
    @SerialName("id")
    val id_repo: Int,
    @SerialName("last_activity_at")
    val lastActivityAt: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("name_with_namespace")
    val nameWithNamespace: String?,
    @SerialName("namespace")
    val namespace: Namespace?,
    @SerialName("path")
    val path: String?,
    @SerialName("path_with_namespace")
    val pathWithNamespace: String?,
    @SerialName("readme_url")
    val readmeUrl: String?,
    @SerialName("ssh_url_to_repo")
    val sshUrlToRepo: String?,
    @SerialName("star_count")
    val starCount: Int?,
    @SerialName("tag_list")
    val tagList: List<String>?,
    @SerialName("web_url")
    val webUrl: String?,
    @SerialName("visibility")
    val visibility: String?
) : GitRepository {

    override val object_id: Int = id_repo
    override val title: String? = name
    override val titleFull: String? = nameWithNamespace
    override val starsCount: Int? = starCount
    override val imageUrl: String? = avatarUrl ?: namespace?.avatarUrl
    override val browserLink: String? = webUrl
    override val isPrivate: Boolean = visibility == "private"
}