package com.jacksonmix.android.aca.afinal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mixja on 11/10/16.
 */
public class CallActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private PlayerAdapter mPlayerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        mPlayerAdapter = new PlayerAdapter(this);
        mRecyclerView.setAdapter(mPlayerAdapter);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .addHeader("Ocp-Apim-Subscription-Key", "8a6828f9644f43b7ac30c4aa54b311e9")
                        .build();
                return chain.proceed(request);
            }
        });
        builder.addInterceptor(logging);

        OkHttpClient client = builder.build();

        Retrofit restAdapter = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl("https://api.fantasydata.net/")
                .build();

        FantasyDataCall apiService = restAdapter.create(FantasyDataCall.class);

        Call<List<Player>> call = apiService.getPlayerBio();
        call.enqueue(new Callback<List<Player>>() {
            @Override
            public void onResponse(Call<List<Player>> call, retrofit2.Response<List<Player>> response) {
                Log.i("Player data: ", response.body().toString());
                mPlayerAdapter.setPlayerList(response.body());

            }

            @Override
            public void onFailure(Call<List<Player>> call, Throwable t) {
                Log.i("Error: ", t.toString());
            }
        });

    }
}

