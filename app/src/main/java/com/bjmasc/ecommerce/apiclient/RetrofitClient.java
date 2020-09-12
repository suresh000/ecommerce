package com.bjmasc.ecommerce.apiclient;

import com.bjmasc.ecommerce.BuildConfig;
import com.bjmasc.ecommerce.util.helper.LogHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public final class RetrofitClient {

    private static final String BASE_URL = BuildConfig.BASE_URL;
    private static final String REQUEST_HEADER_TAG = "<<<< RequestHeader >>>>";

    private static final RetrofitClient ourInstance = new RetrofitClient();
    private Retrofit retrofit;

    public static RetrofitClient getInstance() {
        return ourInstance;
    }

    private RetrofitClient() {
    }

    public void refreshRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .serializeNulls()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClient().build())
                .build();
    }

    public Retrofit getRetrofit() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .serializeNulls()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(httpClient().build())
                    .build();
        }

        return retrofit;
    }

    public ApiInterface getClient() {
        return getRetrofit().create(ApiInterface.class);
    }

    private OkHttpClient.Builder httpClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        if (BuildConfig.IS_PROD) {
            logging.setLevel(HttpLoggingInterceptor.Level.NONE);
        } else {
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        }
        // add logging as last interceptor
        httpClient.addInterceptor(logging);
        httpClient.connectTimeout(20, TimeUnit.SECONDS);
        httpClient.readTimeout(20, TimeUnit.SECONDS);
        httpClient.writeTimeout(20, TimeUnit.SECONDS);


        httpClient.addInterceptor(chain -> {
            Request original = chain.request();

            // BaseRequest customization: add request headers
            Request.Builder requestBuilder = original.newBuilder();

            Request request = requestBuilder.build();
            LogHelper.v(REQUEST_HEADER_TAG, request.body() + "");
            return chain.proceed(request);
        });
        return httpClient;
    }

    /**
     * Callback interface for delivering parsed responses.
     */
    public interface Listener<T, U> {

        void onResponse(T response);

        void onError(U error);
    }
}
