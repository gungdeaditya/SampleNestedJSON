package com.example.gungde.samplenestedjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gungde.samplenestedjson.api.ApiInterface;
import com.example.gungde.samplenestedjson.model.Contributor;
import com.example.gungde.samplenestedjson.model.geo.GeoExample;
import com.example.gungde.samplenestedjson.model.geo.Route;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiInterface apiInterface = ApiInterface.retrofit2.create(ApiInterface.class);
                Call<GeoExample> call =
                        apiInterface.getMapsDetail(
                        "Code Margonda",
                        "Gunadarma",
                        "AIzaSyAbt9kqHrUWay5oBh66AWF7TV45DV_CDoM");
                call.enqueue(new Callback<GeoExample>() {
                    @Override
                    public void onResponse(Call<GeoExample> call, Response<GeoExample> response) {
                        TextView textView = (TextView) findViewById(R.id.textView);
                        Log.d("HASIL", response.body().getStatus());
                        textView.setText(response.body().getRoutes().get(0).getLegs().get(0).getEndAddress());
                    }
                    @Override
                    public void onFailure(Call<GeoExample> call, Throwable t) {
                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Something went wrong: " + t.getMessage());
                    }
                });
            }
        });

    }
}