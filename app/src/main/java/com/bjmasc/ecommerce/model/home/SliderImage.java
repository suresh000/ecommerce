package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class SliderImage {

    @SerializedName("title")
    private String title;
    @SerializedName("image")
    private String image;
    @SerializedName("sort_order")
    private String sort_order;
    @SerializedName("slider_type")
    private String slider_type;
    @SerializedName("slider_id")
    private String slider_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSort_order() {
        return sort_order;
    }

    public void setSort_order(String sort_order) {
        this.sort_order = sort_order;
    }

    public String getSlider_type() {
        return slider_type;
    }

    public void setSlider_type(String slider_type) {
        this.slider_type = slider_type;
    }

    public String getSlider_id() {
        return slider_id;
    }

    public void setSlider_id(String slider_id) {
        this.slider_id = slider_id;
    }

}
