package com.retrofitexample;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by admin1 on 13/5/16.
 */
public interface ProductsInterface {
    @GET("/api/products")
    @Headers({"authorization: 12345678deviceId", "clientType: android_phone"})
    Call<Products> getProductListResponse(@Query("productType") String productType);
}
