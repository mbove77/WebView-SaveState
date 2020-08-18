package com.bove.martin.bairesdevchallenge.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Repository {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("full_name")
    @Expose
    var fullName: String? = null

    @SerializedName("private")
    @Expose
    var private: Boolean? = null

    @SerializedName("owner")
    @Expose
    var owner: Owner? = null

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("fork")
    @Expose
    var fork: Boolean? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("forks_url")
    @Expose
    var forksUrl: String? = null

    @SerializedName("keys_url")
    @Expose
    var keysUrl: String? = null

    @SerializedName("collaborators_url")
    @Expose
    var collaboratorsUrl: String? = null

    @SerializedName("teams_url")
    @Expose
    var teamsUrl: String? = null

    @SerializedName("hooks_url")
    @Expose
    var hooksUrl: String? = null

    @SerializedName("issue_events_url")
    @Expose
    var issueEventsUrl: String? = null

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null

    @SerializedName("assignees_url")
    @Expose
    var assigneesUrl: String? = null

    @SerializedName("branches_url")
    @Expose
    var branchesUrl: String? = null

    @SerializedName("tags_url")
    @Expose
    var tagsUrl: String? = null

    @SerializedName("blobs_url")
    @Expose
    var blobsUrl: String? = null

    @SerializedName("git_tags_url")
    @Expose
    var gitTagsUrl: String? = null

    @SerializedName("git_refs_url")
    @Expose
    var gitRefsUrl: String? = null

    @SerializedName("trees_url")
    @Expose
    var treesUrl: String? = null

    @SerializedName("statuses_url")
    @Expose
    var statusesUrl: String? = null

    @SerializedName("languages_url")
    @Expose
    var languagesUrl: String? = null

    @SerializedName("stargazers_url")
    @Expose
    var stargazersUrl: String? = null

    @SerializedName("contributors_url")
    @Expose
    var contributorsUrl: String? = null

    @SerializedName("subscribers_url")
    @Expose
    var subscribersUrl: String? = null

    @SerializedName("subscription_url")
    @Expose
    var subscriptionUrl: String? = null

    @SerializedName("commits_url")
    @Expose
    var commitsUrl: String? = null

    @SerializedName("git_commits_url")
    @Expose
    var gitCommitsUrl: String? = null

    @SerializedName("comments_url")
    @Expose
    var commentsUrl: String? = null

    @SerializedName("issue_comment_url")
    @Expose
    var issueCommentUrl: String? = null

    @SerializedName("contents_url")
    @Expose
    var contentsUrl: String? = null

    @SerializedName("compare_url")
    @Expose
    var compareUrl: String? = null

    @SerializedName("merges_url")
    @Expose
    var mergesUrl: String? = null

    @SerializedName("archive_url")
    @Expose
    var archiveUrl: String? = null

    @SerializedName("downloads_url")
    @Expose
    var downloadsUrl: String? = null

    @SerializedName("issues_url")
    @Expose
    var issuesUrl: String? = null

    @SerializedName("pulls_url")
    @Expose
    var pullsUrl: String? = null

    @SerializedName("milestones_url")
    @Expose
    var milestonesUrl: String? = null

    @SerializedName("notifications_url")
    @Expose
    var notificationsUrl: String? = null

    @SerializedName("labels_url")
    @Expose
    var labelsUrl: String? = null

    @SerializedName("releases_url")
    @Expose
    var releasesUrl: String? = null

    @SerializedName("deployments_url")
    @Expose
    var deploymentsUrl: String? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("pushed_at")
    @Expose
    var pushedAt: String? = null

    @SerializedName("git_url")
    @Expose
    var gitUrl: String? = null

    @SerializedName("ssh_url")
    @Expose
    var sshUrl: String? = null

    @SerializedName("clone_url")
    @Expose
    var cloneUrl: String? = null

    @SerializedName("svn_url")
    @Expose
    var svnUrl: String? = null

    @SerializedName("homepage")
    @Expose
    var homepage: String? = null

    @SerializedName("size")
    @Expose
    var size: Int? = null

    @SerializedName("stargazers_count")
    @Expose
    var stargazersCount: Int? = null

    @SerializedName("watchers_count")
    @Expose
    var watchersCount: Int? = null

    @SerializedName("language")
    @Expose
    var language: String? = null

    @SerializedName("has_issues")
    @Expose
    var hasIssues: Boolean? = null

    @SerializedName("has_projects")
    @Expose
    var hasProjects: Boolean? = null

    @SerializedName("has_downloads")
    @Expose
    var hasDownloads: Boolean? = null

    @SerializedName("has_wiki")
    @Expose
    var hasWiki: Boolean? = null

    @SerializedName("has_pages")
    @Expose
    var hasPages: Boolean? = null

    @SerializedName("forks_count")
    @Expose
    var forksCount: Int? = null

    @SerializedName("mirror_url")
    @Expose
    var mirrorUrl: Any? = null

    @SerializedName("archived")
    @Expose
    var archived: Boolean? = null

    @SerializedName("disabled")
    @Expose
    var disabled: Boolean? = null

    @SerializedName("open_issues_count")
    @Expose
    var openIssuesCount: Int? = null

    @SerializedName("license")
    @Expose
    var license: Any? = null

    @SerializedName("forks")
    @Expose
    var forks: Int? = null

    @SerializedName("open_issues")
    @Expose
    var openIssues: Int? = null

    @SerializedName("watchers")
    @Expose
    var watchers: Int? = null

    @SerializedName("default_branch")
    @Expose
    var defaultBranch: String? = null

    @SerializedName("score")
    @Expose
    var score: Double? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param sshUrl
     * @param archiveUrl
     * @param languagesUrl
     * @param language
     * @param assigneesUrl
     * @param commitsUrl
     * @param openIssues
     * @param cloneUrl
     * @param forksCount
     * @param subscribersUrl
     * @param createdAt
     * @param score
     * @param forksUrl
     * @param watchersCount
     * @param _private
     * @param issueCommentUrl
     * @param statusesUrl
     * @param id
     * @param collaboratorsUrl
     * @param updatedAt
     * @param forks
     * @param labelsUrl
     * @param defaultBranch
     * @param keysUrl
     * @param downloadsUrl
     * @param contentsUrl
     * @param pushedAt
     * @param tagsUrl
     * @param license
     * @param commentsUrl
     * @param size
     * @param treesUrl
     * @param name
     * @param mergesUrl
     * @param nodeId
     * @param teamsUrl
     * @param blobsUrl
     * @param issueEventsUrl
     * @param hasPages
     * @param milestonesUrl
     * @param issuesUrl
     * @param releasesUrl
     * @param description
     * @param watchers
     * @param branchesUrl
     * @param contributorsUrl
     * @param gitRefsUrl
     * @param hooksUrl
     * @param openIssuesCount
     * @param archived
     * @param stargazersCount
     * @param disabled
     * @param hasIssues
     * @param owner
     * @param hasWiki
     * @param compareUrl
     * @param gitCommitsUrl
     * @param htmlUrl
     * @param stargazersUrl
     * @param fullName
     * @param svnUrl
     * @param url
     * @param pullsUrl
     * @param mirrorUrl
     * @param hasDownloads
     * @param fork
     * @param hasProjects
     * @param deploymentsUrl
     * @param eventsUrl
     * @param gitTagsUrl
     * @param notificationsUrl
     * @param gitUrl
     * @param subscriptionUrl
     * @param homepage
     */
    constructor(
        id: Int?,
        nodeId: String?,
        name: String?,
        fullName: String?,
        _private: Boolean?,
        owner: Owner?,
        htmlUrl: String?,
        description: String?,
        fork: Boolean?,
        url: String?,
        forksUrl: String?,
        keysUrl: String?,
        collaboratorsUrl: String?,
        teamsUrl: String?,
        hooksUrl: String?,
        issueEventsUrl: String?,
        eventsUrl: String?,
        assigneesUrl: String?,
        branchesUrl: String?,
        tagsUrl: String?,
        blobsUrl: String?,
        gitTagsUrl: String?,
        gitRefsUrl: String?,
        treesUrl: String?,
        statusesUrl: String?,
        languagesUrl: String?,
        stargazersUrl: String?,
        contributorsUrl: String?,
        subscribersUrl: String?,
        subscriptionUrl: String?,
        commitsUrl: String?,
        gitCommitsUrl: String?,
        commentsUrl: String?,
        issueCommentUrl: String?,
        contentsUrl: String?,
        compareUrl: String?,
        mergesUrl: String?,
        archiveUrl: String?,
        downloadsUrl: String?,
        issuesUrl: String?,
        pullsUrl: String?,
        milestonesUrl: String?,
        notificationsUrl: String?,
        labelsUrl: String?,
        releasesUrl: String?,
        deploymentsUrl: String?,
        createdAt: String?,
        updatedAt: String?,
        pushedAt: String?,
        gitUrl: String?,
        sshUrl: String?,
        cloneUrl: String?,
        svnUrl: String?,
        homepage: String?,
        size: Int?,
        stargazersCount: Int?,
        watchersCount: Int?,
        language: String?,
        hasIssues: Boolean?,
        hasProjects: Boolean?,
        hasDownloads: Boolean?,
        hasWiki: Boolean?,
        hasPages: Boolean?,
        forksCount: Int?,
        mirrorUrl: Any?,
        archived: Boolean?,
        disabled: Boolean?,
        openIssuesCount: Int?,
        license: Any?,
        forks: Int?,
        openIssues: Int?,
        watchers: Int?,
        defaultBranch: String?,
        score: Double?
    ) : super() {
        this.id = id
        this.nodeId = nodeId
        this.name = name
        this.fullName = fullName
        private = _private
        this.owner = owner
        this.htmlUrl = htmlUrl
        this.description = description
        this.fork = fork
        this.url = url
        this.forksUrl = forksUrl
        this.keysUrl = keysUrl
        this.collaboratorsUrl = collaboratorsUrl
        this.teamsUrl = teamsUrl
        this.hooksUrl = hooksUrl
        this.issueEventsUrl = issueEventsUrl
        this.eventsUrl = eventsUrl
        this.assigneesUrl = assigneesUrl
        this.branchesUrl = branchesUrl
        this.tagsUrl = tagsUrl
        this.blobsUrl = blobsUrl
        this.gitTagsUrl = gitTagsUrl
        this.gitRefsUrl = gitRefsUrl
        this.treesUrl = treesUrl
        this.statusesUrl = statusesUrl
        this.languagesUrl = languagesUrl
        this.stargazersUrl = stargazersUrl
        this.contributorsUrl = contributorsUrl
        this.subscribersUrl = subscribersUrl
        this.subscriptionUrl = subscriptionUrl
        this.commitsUrl = commitsUrl
        this.gitCommitsUrl = gitCommitsUrl
        this.commentsUrl = commentsUrl
        this.issueCommentUrl = issueCommentUrl
        this.contentsUrl = contentsUrl
        this.compareUrl = compareUrl
        this.mergesUrl = mergesUrl
        this.archiveUrl = archiveUrl
        this.downloadsUrl = downloadsUrl
        this.issuesUrl = issuesUrl
        this.pullsUrl = pullsUrl
        this.milestonesUrl = milestonesUrl
        this.notificationsUrl = notificationsUrl
        this.labelsUrl = labelsUrl
        this.releasesUrl = releasesUrl
        this.deploymentsUrl = deploymentsUrl
        this.createdAt = createdAt
        this.updatedAt = updatedAt
        this.pushedAt = pushedAt
        this.gitUrl = gitUrl
        this.sshUrl = sshUrl
        this.cloneUrl = cloneUrl
        this.svnUrl = svnUrl
        this.homepage = homepage
        this.size = size
        this.stargazersCount = stargazersCount
        this.watchersCount = watchersCount
        this.language = language
        this.hasIssues = hasIssues
        this.hasProjects = hasProjects
        this.hasDownloads = hasDownloads
        this.hasWiki = hasWiki
        this.hasPages = hasPages
        this.forksCount = forksCount
        this.mirrorUrl = mirrorUrl
        this.archived = archived
        this.disabled = disabled
        this.openIssuesCount = openIssuesCount
        this.license = license
        this.forks = forks
        this.openIssues = openIssues
        this.watchers = watchers
        this.defaultBranch = defaultBranch
        this.score = score
    }

}