package com.example.kotlinretrofitdemo

import com.google.gson.annotations.*;

data class MyDataItem(
    //@SerializedName("body")
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)