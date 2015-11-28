package com.example.leo.criminalintent;

import java.util.UUID;

/**
 * Created by Leo on 15/11/28.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        this.mId = UUID.randomUUID();
    }

    public String getmTitle() {
        return mTitle;
    }

    public UUID getmId() {
        return mId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
