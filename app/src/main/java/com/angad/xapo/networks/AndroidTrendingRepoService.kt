package com.angad.xapo.networks

import com.angad.xapo.models.AndroidTrendingRepo
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

/**
 * @author Angad Tiwari
 * @Date 11 Oct 2018
 * @comment API interface to call retrofit
 */
interface AndroidTrendingRepoService {

    @GET("search/repositories")
    fun getAndroidTrendingRepos(@Query("q", encoded=true) q: String, @Query("sort") sort: String, @Query("order") order: String): Call<AndroidTrendingRepo>
}