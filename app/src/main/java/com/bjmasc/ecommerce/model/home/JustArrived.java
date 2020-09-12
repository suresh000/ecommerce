package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class JustArrived {

    @SerializedName("product_id")
    private String product_id;
    @SerializedName("image")
    private String image;
    @SerializedName("name")
    private String name;
    @SerializedName("rating")
    private Integer rating;
    @SerializedName("is_favourites")
    private String is_favourites;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getIs_favourites() {
        return is_favourites;
    }

    public void setIs_favourites(String is_favourites) {
        this.is_favourites = is_favourites;
    }

}
