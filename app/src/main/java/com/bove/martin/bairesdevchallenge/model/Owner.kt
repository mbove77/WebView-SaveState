package com.bove.martin.bairesdevchallenge.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Owner {
    @SerializedName("login")
    @Expose
    var login: String? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String? = null

    @SerializedName("avatar_url")
    @Expose
    var avatarUrl: String? = null

    @SerializedName("gravatar_id")
    @Expose
    var gravatarId: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null

    @SerializedName("followers_url")
    @Expose
    var followersUrl: String? = null

    @SerializedName("following_url")
    @Expose
    var followingUrl: String? = null

    @SerializedName("gists_url")
    @Expose
    var gistsUrl: String? = null

    @SerializedName("starred_url")
    @Expose
    var starredUrl: String? = null

    @SerializedName("subscriptions_url")
    @Expose
    var subscriptionsUrl: String? = null

    @SerializedName("organizations_url")
    @Expose
    var organizationsUrl: String? = null

    @SerializedName("repos_url")
    @Expose
    var reposUrl: String? = null

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null

    @SerializedName("received_events_url")
    @Expose
    var receivedEventsUrl: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("site_admin")
    @Expose
    var siteAdmin: Boolean? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param receivedEventsUrl
     * @param siteAdmin
     * @param followingUrl
     * @param gistsUrl
     * @param avatarUrl
     * @param organizationsUrl
     * @param reposUrl
     * @param htmlUrl
     * @param subscriptionsUrl
     * @param login
     * @param type
     * @param url
     * @param starredUrl
     * @param gravatarId
     * @param followersUrl
     * @param id
     * @param eventsUrl
     * @param nodeId
     */
    constructor(
        login: String?,
        id: Int?,
        nodeId: String?,
        avatarUrl: String?,
        gravatarId: String?,
        url: String?,
        htmlUrl: String?,
        followersUrl: String?,
        followingUrl: String?,
        gistsUrl: String?,
        starredUrl: String?,
        subscriptionsUrl: String?,
        organizationsUrl: String?,
        reposUrl: String?,
        eventsUrl: String?,
        receivedEventsUrl: String?,
        type: String?,
        siteAdmin: Boolean?
    ) : super() {
        this.login = login
        this.id = id
        this.nodeId = nodeId
        this.avatarUrl = avatarUrl
        this.gravatarId = gravatarId
        this.url = url
        this.htmlUrl = htmlUrl
        this.followersUrl = followersUrl
        this.followingUrl = followingUrl
        this.gistsUrl = gistsUrl
        this.starredUrl = starredUrl
        this.subscriptionsUrl = subscriptionsUrl
        this.organizationsUrl = organizationsUrl
        this.reposUrl = reposUrl
        this.eventsUrl = eventsUrl
        this.receivedEventsUrl = receivedEventsUrl
        this.type = type
        this.siteAdmin = siteAdmin
    }

}