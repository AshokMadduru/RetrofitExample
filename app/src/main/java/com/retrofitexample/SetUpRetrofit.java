package com.retrofitexample;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin1 on 13/5/16.
 */
public class SetUpRetrofit {
    public static <S> S createService(Class<S> sClass){


        // Define the interceptor, add authentication headers
        Interceptor interceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .addHeader("authorization", "12345678deviceId")
                        .addHeader("clientType","android_phone")
                        .method(chain.request().method(),chain.request().body())
                        .build();
                return chain.proceed(newRequest);
            }
        };

        // Add the interceptor to OkHttpClient
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(interceptor);
        OkHttpClient client = builder.build();

        Retrofit.Builder retrofit = new Retrofit.Builder();
        retrofit.baseUrl("http://hubint.smartron.com:8081/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client);
        Retrofit adapter = retrofit.build();
        return adapter.create(sClass);
    }
}
