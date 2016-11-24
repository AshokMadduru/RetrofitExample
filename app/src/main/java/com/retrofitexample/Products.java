package com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin1 on 13/5/16.
 */
public class Products {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private ProductList data;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response_code")
    @Expose
    private Integer responseCode;

    /**
     *
     * @return The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     *            The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     *
     * @return The data
     */
    public ProductList getData() {
        return data;
    }

    /**
     *
     * @param data
     *            The data
     */
    public void setData(ProductList data) {
        this.data = data;
    }

    /**
     *
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     *            The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return The responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     *
     * @param responseCode
     *            The response_code
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }
}
