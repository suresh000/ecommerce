package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class Banner {

    @SerializedName("banner_image")
    private String banner_image;

    @SerializedName("banner_type")
    private String banner_type;

    @SerializedName("banner_id")
    private String banner_id;

    public String getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(String banner_image) {
        this.banner_image = banner_image;
    }

    public String getBanner_type() {
        return banner_type;
    }

    public void setBanner_type(String banner_type) {
        this.banner_type = banner_type;
    }

    public String getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(String banner_id) {
        this.banner_id = banner_id;
    }

}
