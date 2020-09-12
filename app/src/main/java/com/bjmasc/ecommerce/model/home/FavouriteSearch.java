package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class FavouriteSearch {

    @SerializedName("fav_search")
    private String fav_search;

    public String getFav_search() {
        return fav_search;
    }

    public void setFav_search(String fav_search) {
        this.fav_search = fav_search;
    }

}
