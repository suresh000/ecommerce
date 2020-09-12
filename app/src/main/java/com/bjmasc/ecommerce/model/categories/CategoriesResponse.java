package com.bjmasc.ecommerce.model.categories;

import com.bjmasc.ecommerce.util.JsonKeys;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesResponse {

    @SerializedName(JsonKeys.KEY_CATEGORIES)
    private List<Category> categories;

    @SerializedName(JsonKeys.KEY_BANNER_IMAGE)
    private String bannerImage;

    @SerializedName(JsonKeys.KEY_STATUS)
    private String status;

    @SerializedName(JsonKeys.KEY_MESSAGE)
    private String message;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
