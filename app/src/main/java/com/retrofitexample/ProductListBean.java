package com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by admin1 on 13/5/16.
 */
public class ProductListBean {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sku_code")
    @Expose
    private String skuCode;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("package_name")
    @Expose
    private String packageName;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("is_featured")
    @Expose
    private String isFeatured;
    @SerializedName("product_price_id")
    @Expose
    private String productPriceId;
    @SerializedName("actual_price")
    @Expose
    private String actualPrice;
    @SerializedName("selling_price")
    @Expose
    private String sellingPrice;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("discount_type")
    @Expose
    private String discountType;
    @SerializedName("is_tax_explicit")
    @Expose
    private String isTaxExplicit;
    @SerializedName("cashback_id")
    @Expose
    private String cashbackId;
    @SerializedName("cashback_type")
    @Expose
    private String cashbackType;
    @SerializedName("cashback_value")
    @Expose
    private String cashbackValue;
    @SerializedName("is_available")
    @Expose
    private String isAvailable;
    @SerializedName("average_rating")
    @Expose
    private String averageRating;
    @SerializedName("units_consumed")
    @Expose
    private String unitsConsumed;

    /**
     *
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *            The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *            The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *            The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return The skuCode
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     *
     * @param skuCode
     *            The sku_code
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     *
     * @return The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     *            The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     *
     * @return The categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     *
     * @param categoryId
     *            The category_id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     *
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *            The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return The packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     *
     * @param packageName
     *            The package_name
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     *
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     *            The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     *            The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return The isFeatured
     */
    public String getIsFeatured() {
        return isFeatured;
    }

    /**
     *
     * @param isFeatured
     *            The is_featured
     */
    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     *
     * @return The productPriceId
     */
    public String getProductPriceId() {
        return productPriceId;
    }

    /**
     *
     * @param productPriceId
     *            The product_price_id
     */
    public void setProductPriceId(String productPriceId) {
        this.productPriceId = productPriceId;
    }

    /**
     *
     * @return The actualPrice
     */
    public String getActualPrice() {
        return actualPrice;
    }

    /**
     *
     * @param actualPrice
     *            The actual_price
     */
    public void setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     *
     * @return The sellingPrice
     */
    public String getSellingPrice() {
        return sellingPrice;
    }

    /**
     *
     * @param sellingPrice
     *            The selling_price
     */
    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     *
     * @return The currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     *
     * @param currencyCode
     *            The currency_code
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     *
     * @return The discount
     */
    public String getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     *            The discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /**
     *
     * @return The discountType
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     *
     * @param discountType
     *            The discount_type
     */
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    /**
     *
     * @return The isTaxExplicit
     */
    public String getIsTaxExplicit() {
        return isTaxExplicit;
    }

    /**
     *
     * @param isTaxExplicit
     *            The is_tax_explicit
     */
    public void setIsTaxExplicit(String isTaxExplicit) {
        this.isTaxExplicit = isTaxExplicit;
    }

    /**
     *
     * @return The cashbackId
     */
    public String getCashbackId() {
        return cashbackId;
    }

    /**
     *
     * @param cashbackId
     *            The cashback_id
     */
    public void setCashbackId(String cashbackId) {
        this.cashbackId = cashbackId;
    }

    /**
     *
     * @return The cashbackType
     */
    public String getCashbackType() {
        return cashbackType;
    }

    /**
     *
     * @param cashbackType
     *            The cashback_type
     */
    public void setCashbackType(String cashbackType) {
        this.cashbackType = cashbackType;
    }

    /**
     *
     * @return The cashbackValue
     */
    public String getCashbackValue() {
        return cashbackValue;
    }

    /**
     *
     * @param cashbackValue
     *            The cashback_value
     */
    public void setCashbackValue(String cashbackValue) {
        this.cashbackValue = cashbackValue;
    }

    /**
     *
     * @return The isAvailable
     */
    public String getIsAvailable() {
        return isAvailable;
    }

    /**
     *
     * @param isAvailable
     *            The is_available
     */
    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     *
     * @return The averageRating
     */
    public String getAverageRating() {
        return averageRating;
    }

    /**
     *
     * @param averageRating
     *            The average_rating
     */
    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    /**
     *
     * @return The unitsConsumed
     */
    public String getUnitsConsumed() {
        return unitsConsumed;
    }

    /**
     *
     * @param unitsConsumed
     *            The units_consumed
     */
    public void setUnitsConsumed(String unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

}
