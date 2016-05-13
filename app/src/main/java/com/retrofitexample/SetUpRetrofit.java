package com.retrofitexample;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin1 on 13/5/16.
 */
public class SetUpRetrofit {
    public static <S> S createService(Class<S> sClass){
        Retrofit.Builder retrofit = new Retrofit.Builder();
        retrofit.baseUrl("http://hubint.smartron.com:8081/")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit adapter = retrofit.build();
        return adapter.create(sClass);
    }
}
