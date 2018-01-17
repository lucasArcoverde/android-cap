package com.example.lucasarcoverde.aula_13.model;

/**
 * Created by lucasarcoverde on 17/01/2018.
 */

import com.google.gson.annotations.SerializedName;

public class Post {
    private Integer mUserId;
    private Integer mId;
    private String mTitle;
    private String mBody;

    public Post (Integer userId, String body, Integer id, String title) {
        this.mBody = body;
        this.mId = id;
        this.mTitle = title;
        this.mUserId = userId;
    }

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody;
    }

    public String getmTitle() {

        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Integer getmId() {

        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmUserId() {
        return mUserId;
    }

    public void setmUserId(Integer mUserId) {
        this.mUserId = mUserId;
    }
}
