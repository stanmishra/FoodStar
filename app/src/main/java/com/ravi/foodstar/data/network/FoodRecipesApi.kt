package com.ravi.foodstar.data.network

import com.ravi.foodstar.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>

    @GET("/recipes/complexSearch")
    suspend fun searchRecipe(
        @QueryMap searchQuery: Map<String, String>
    ): Response<FoodRecipe>
}