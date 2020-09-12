package com.bjmasc.ecommerce.model.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeResponse {

    @SerializedName("slider_images")
    private List<SliderImage> slider_images;

    @SerializedName("offer_code_banner")
    private List<OfferCodeBanner> offer_code_banner;

    @SerializedName("designs")
    private List<Design> designs;

    @SerializedName("ranges")
    private List<Range> ranges;

    @SerializedName("banners")
    private List<Banner> banners;

    @SerializedName("just_arrived")
    private List<JustArrived> just_arrived;

    @SerializedName("favourite_search")
    private List<FavouriteSearch> favourite_search;

    @SerializedName("most_popular_viewed")
    private List<MostPopularViewed> most_popular_viewed;

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    public List<SliderImage> getSlider_images() {
        return slider_images;
    }

    public void setSlider_images(List<SliderImage> slider_images) {
        this.slider_images = slider_images;
    }

    public List<OfferCodeBanner> getOffer_code_banner() {
        return offer_code_banner;
    }

    public void setOffer_code_banner(List<OfferCodeBanner> offer_code_banner) {
        this.offer_code_banner = offer_code_banner;
    }

    public List<Design> getDesigns() {
        return designs;
    }

    public void setDesigns(List<Design> designs) {
        this.designs = designs;
    }

    public List<Range> getRanges() {
        return ranges;
    }

    public void setRanges(List<Range> ranges) {
        this.ranges = ranges;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public List<JustArrived> getJust_arrived() {
        return just_arrived;
    }

    public void setJust_arrived(List<JustArrived> just_arrived) {
        this.just_arrived = just_arrived;
    }

    public List<FavouriteSearch> getFavourite_search() {
        return favourite_search;
    }

    public void setFavourite_search(List<FavouriteSearch> favourite_search) {
        this.favourite_search = favourite_search;
    }

    public List<MostPopularViewed> getMost_popular_viewed() {
        return most_popular_viewed;
    }

    public void setMost_popular_viewed(List<MostPopularViewed> most_popular_viewed) {
        this.most_popular_viewed = most_popular_viewed;
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
