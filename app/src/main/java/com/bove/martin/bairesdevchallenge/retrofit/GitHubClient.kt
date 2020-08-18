package com.bove.martin.bairesdevchallenge.retrofit

import com.bove.martin.bairesdevchallenge.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Martín Bove on 17-Aug-20.
 * E-mail: mbove77@gmail.com
 */
class GitHubClient {
    private val gitHubService: GitHubServices
    private val retrofit: Retrofit

    // Singleton GitHubClient
    companion object {
        var instance: GitHubClient? = null
            get() {
                if(field == null){
                    instance = GitHubClient()
                }
                return field
            }
    }


    init {
        // Api 19 fix for SSL handshake aborted
        val tlsTocketFactory  = TLSSocketFactory()
        val client = OkHttpClient.Builder()
            .sslSocketFactory(tlsTocketFactory, tlsTocketFactory.trustManager)
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl(Constants.GITHUB_API_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        gitHubService = retrofit.create(GitHubServices::class.java)
    }

    fun getGitHubService() = gitHubService
}