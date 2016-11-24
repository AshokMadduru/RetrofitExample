package com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin1 on 13/5/16.
 */
public class ProductList {
    @SerializedName("products_list")
    @Expose
    private List<ProductListBean> productsList = new ArrayList<ProductListBean>();
    @SerializedName("total")
    @Expose
    private String total;

    /**
     *
     * @return The productsList
     */
    public List<ProductListBean> getProductsList() {
        return productsList;
    }

    /**
     *
     * @param productsList
     *            The products_list
     */
    public void setProductsList(List<ProductListBean> productsList) {
        this.productsList = productsList;
    }

    /**
     *
     * @return The total
     */
    public String getTotal() {
        return total;
    }

    /**
     *
     * @param total
     *            The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

}
