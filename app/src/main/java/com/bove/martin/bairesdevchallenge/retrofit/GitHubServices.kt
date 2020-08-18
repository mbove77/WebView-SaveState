package com.bove.martin.bairesdevchallenge.retrofit

import com.bove.martin.bairesdevchallenge.model.SearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Martín Bove on 17-Aug-20.
 * E-mail: mbove77@gmail.com
 */
interface GitHubServices {
    @GET("search/repositories")
    fun getKotlinRepositories(@Query("q") queryString:String, @Query("per_page") perPage:Int): Call<SearchResult>
}