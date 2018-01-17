package com.example.lucasarcoverde.aula_13.endpoint;

import com.example.lucasarcoverde.aula_13.model.Post;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by lucasarcoverde on 17/01/2018.
 */

public interface ApiInterface {
    @GET("posts/{id}")
    Call<Post> getPosts(@Path("id") Integer id, @Body Post post);

}
