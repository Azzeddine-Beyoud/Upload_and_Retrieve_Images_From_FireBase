package com.example.uploadandretrieveimagesfromfirebase;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String key;
    public Upload(){

    }

    public Upload(String name , String imageUrl){
        if (name.trim().equals("")){
            name = "No name";
        }
        this.mName=name;
        this.mImageUrl=imageUrl;
    }

    public String getmName(){
        return mName;
    }
    public String getmImageUrl(){
        return mImageUrl;
    }

    @Exclude
    public String getKey(){
        return key;
    }
    public void setmName(String name){
        this.mName=name;
    }
    public void setmImageUrl(String imageUrl){
        this.mImageUrl=imageUrl;
    }

    @Exclude
    public void setKey(String key){
        this.key = key;
    }

}
