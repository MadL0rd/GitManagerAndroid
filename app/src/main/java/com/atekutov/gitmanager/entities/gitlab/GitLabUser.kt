package com.atekutov.gitmanager.entities.gitlab


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GitLabUser(
    @SerialName("avatar_url")
    val avatarUrl: String?,
    @SerialName("bio")
    val bio: String?,
    @SerialName("bio_html")
    val bioHtml: String?,
    @SerialName("bot")
    val bot: Boolean?,
    @SerialName("can_create_group")
    val canCreateGroup: Boolean?,
    @SerialName("can_create_project")
    val canCreateProject: Boolean?,
    @SerialName("color_scheme_id")
    val colorSchemeId: Int?,
    @SerialName("commit_email")
    val commitEmail: String?,
    @SerialName("confirmed_at")
    val confirmedAt: String?,
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("current_sign_in_at")
    val currentSignInAt: String?,
    @SerialName("email")
    val email: String?,
    @SerialName("external")
    val `external`: Boolean?,
    @SerialName("followers")
    val followers: Int?,
    @SerialName("following")
    val following: Int?,
    @SerialName("id")
    val id: Int?,
    @SerialName("job_title")
    val jobTitle: String?,
    @SerialName("last_activity_on")
    val lastActivityOn: String?,
    @SerialName("last_sign_in_at")
    val lastSignInAt: String?,
    @SerialName("linkedin")
    val linkedin: String?,
    @SerialName("location")
    val location: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("organization")
    val organization: String?,
    @SerialName("private_profile")
    val privateProfile: Boolean?,
    @SerialName("projects_limit")
    val projectsLimit: Int?,
    @SerialName("public_email")
    val publicEmail: String?,
    @SerialName("skype")
    val skype: String?,
    @SerialName("state")
    val state: String?,
    @SerialName("theme_id")
    val themeId: Int?,
    @SerialName("twitter")
    val twitter: String?,
    @SerialName("two_factor_enabled")
    val twoFactorEnabled: Boolean?,
    @SerialName("username")
    val username: String?,
    @SerialName("web_url")
    val webUrl: String?,
    @SerialName("website_url")
    val websiteUrl: String?
)