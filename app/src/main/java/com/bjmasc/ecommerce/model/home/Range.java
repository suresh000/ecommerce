package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class Range {

    @SerializedName("range_id")
    private String range_id;
    @SerializedName("name")
    private String name;
    @SerializedName("image")
    private String image;

    public String getRange_id() {
        return range_id;
    }

    public void setRange_id(String range_id) {
        this.range_id = range_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
