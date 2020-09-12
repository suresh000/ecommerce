package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

public class Design {

    @SerializedName("design_id")
    private String design_id;

    @SerializedName("name")
    private String name;

    @SerializedName("image")
    private String image;

    public String getDesign_id() {
        return design_id;
    }

    public void setDesign_id(String design_id) {
        this.design_id = design_id;
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
