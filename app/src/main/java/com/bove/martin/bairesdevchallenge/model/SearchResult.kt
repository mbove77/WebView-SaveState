package com.bove.martin.bairesdevchallenge.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SearchResult {
    @SerializedName("total_count")
    @Expose
    var totalCount: Int? = null

    @SerializedName("incomplete_results")
    @Expose
    var incompleteResults: Boolean? = null

    @SerializedName("items")
    @Expose
    var items: List<Repository>? =
        null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param incompleteResults
     * @param totalCount
     * @param items
     */
    constructor(
        totalCount: Int?,
        incompleteResults: Boolean?,
        items: List<Repository>?
    ) : super() {
        this.totalCount = totalCount
        this.incompleteResults = incompleteResults
        this.items = items
    }

}