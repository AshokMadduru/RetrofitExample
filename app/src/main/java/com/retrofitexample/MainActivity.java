package com.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://hubint.smartron.com:8081/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/
        ProductsInterface productsInterface = SetUpRetrofit.createService(ProductsInterface.class);
        Call<Products> p = productsInterface.getProductListResponse("ACCESSORY");
        p.enqueue(new Callback<Products>() {
            @Override
            public void onResponse(Call<Products> call, Response<Products> response) {
                Log.d("reponse",response.body().getData().getProductsList().toString());
            }

            @Override
            public void onFailure(Call<Products> call, Throwable t) {
                Log.d("response","failed");
            }
        });


    }
}
