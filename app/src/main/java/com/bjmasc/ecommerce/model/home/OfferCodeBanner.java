package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class OfferCodeBanner {

    @SerializedName("banner_image")
    private String banner_image;
    @SerializedName("type")
    private String type;

    public String getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(String banner_image) {
        this.banner_image = banner_image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
