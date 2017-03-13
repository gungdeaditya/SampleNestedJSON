package com.example.gungde.samplenestedjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gungde.samplenestedjson.api.ApiInterface;
import com.example.gungde.samplenestedjson.model.Contributor;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiInterface apiInterface = ApiInterface.retrofit.create(ApiInterface.class);
                final Call<List<Contributor>> call =
                        apiInterface.repoContributors(
                                "square",
                                "retrofit");

                call.enqueue(new Callback<List<Contributor>>() {
                    @Override
                    public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText(response.body().toString());
                    }
                    @Override
                    public void onFailure(Call<List<Contributor>> call, Throwable t) {
                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Something went wrong: " + t.getMessage());
                    }
                });
            }
        });
    }
}
