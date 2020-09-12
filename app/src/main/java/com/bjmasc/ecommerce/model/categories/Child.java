package com.bjmasc.ecommerce.model.categories;

import com.bjmasc.ecommerce.util.JsonKeys;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName(JsonKeys.KEY_CATEGORY_ID)
    private String categoryId;

    @SerializedName(JsonKeys.KEY_CATEGORY_NAME)
    private String categoryName;

    @SerializedName(JsonKeys.KEY_PARENT_ID)
    private String parentId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
