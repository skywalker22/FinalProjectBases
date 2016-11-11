package com.jacksonmix.android.aca.afinal;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mixja on 11/10/16.
 */
public class CallActivity extends AppCompatActivity {



    /*
    mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    mAdapter = new MoviesAdapter(this);
    mRecyclerView.setAdapter(mAdapter);
    List<Movie> movies = new ArrayList<>();

    for (int i = 0; i < 26; i++) {
        movies.add(new Movie());
    }
    mAdapter.setMovieList(movies);

    Retrofit restAdapter = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://api.themoviedb.org/")
            .build();

    MoviesApiService apiService = restAdapter.create(MoviesApiService.class);

    Call<Movie.MovieResult> call = apiService.getPopularMovies();
    call.enqueue(new Callback<Movie.MovieResult>() {
        @Override
        public void onResponse(Call<Movie.MovieResult> call, Response<Movie.MovieResult> response) {
            mAdapter.setMovieList(response.body().getResults());
        }

        @Override
        public void onFailure(Call<Movie.MovieResult> call, Throwable t) {
            t.printStackTrace();
        }
    });


}

/*
// // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
import java.net.URI;
        import org.apache.http.HttpEntity;
        import org.apache.http.HttpResponse;
        import org.apache.http.client.HttpClient;
        import org.apache.http.client.methods.HttpGet;
        import org.apache.http.client.utils.URIBuilder;
        import org.apache.http.impl.client.HttpClients;
        import org.apache.http.util.EntityUtils;

public class JavaSample
{
    public static void main(String[] args)
    {
        HttpClient httpclient = HttpClients.createDefault();

        try
        {
            URIBuilder builder = new URIBuilder("https://api.fantasydata.net/mlb/v2/{format}/teams");


            URI uri = builder.build();
            HttpGet request = new HttpGet(uri);
            request.setHeader("Ocp-Apim-Subscription-Key", "{subscription key}");


            // Request body
            StringEntity reqEntity = new StringEntity("{body}");
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null)
            {
                System.out.println(EntityUtils.toString(entity));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}