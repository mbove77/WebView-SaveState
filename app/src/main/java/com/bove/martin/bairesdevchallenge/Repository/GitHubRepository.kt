package com.bove.martin.bairesdevchallenge.Repository

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.bove.martin.bairesdevchallenge.model.SearchResult
import com.bove.martin.bairesdevchallenge.retrofit.GitHubClient
import com.bove.martin.bairesdevchallenge.retrofit.GitHubServices
import com.bove.martin.bairesdevchallenge.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Martín Bove on 17-Aug-20.
 * E-mail: mbove77@gmail.com
 */
class GitHubRepository {
    var gitHubDBService: GitHubServices? = null
    var gitHubClient: GitHubClient? = null
    var kotlinRepositories: MutableLiveData<SearchResult>? = null

    init {
        gitHubClient = GitHubClient.instance
        gitHubDBService = gitHubClient?.getGitHubService()
        kotlinRepositories = getRepositories()
    }

    private fun getRepositories(): MutableLiveData<SearchResult>? {
        if (kotlinRepositories == null) kotlinRepositories = MutableLiveData()

        val call: Call<SearchResult>? = gitHubDBService?.getKotlinRepositories(Constants.QUERY_STRING, Constants.ITEMS_PER_PAGE)
        call?.enqueue(object : Callback<SearchResult> {

            override fun onResponse(call: Call<SearchResult>, response: Response<SearchResult>) {
                if (response.isSuccessful) {
                    kotlinRepositories?.value = response.body()
                } else {
                    Log.w("CAll", "Error in the response")
                }
            }

            override fun onFailure(call: Call<SearchResult>, t: Throwable) {
                Log.w("CAll", "Error in the call", t)
            }

        })

        return kotlinRepositories
    }
}