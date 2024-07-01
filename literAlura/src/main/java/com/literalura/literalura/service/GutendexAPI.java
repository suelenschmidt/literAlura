package com.literalura.literalura.service;

import com.literalura.literalura.api.BookApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface GutendexAPI {
    @GET("books")
    Call<BookApiResponse> getBooks(@Query("topic") String topic);
}
