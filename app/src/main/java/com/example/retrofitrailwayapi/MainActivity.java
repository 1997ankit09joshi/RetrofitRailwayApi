package com.example.retrofitrailwayapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    String s1, s2;
    EditText editText, editText1;
    TextView textView1, textView2;
    RecyclerView recyclerView;
    Adapter adapter;
    Button btn, btn1;
    ArrayList<RouteModel> routeList = new ArrayList<>();
    ArrayList<RouteModel.Route_> route_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.edit);
        textView2 = findViewById(R.id.edit1);
        editText = findViewById(R.id.edit3);
        editText1 = findViewById(R.id.bt);
        btn = findViewById(R.id.ok);
        btn1 = findViewById(R.id.route);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    public void ok(View view) {

        s1 = editText.getText().toString();
        Api api = ClassApi.api().create(Api.class);
        api.getList(s1).enqueue(new Callback<TrainNameNoModel>() {
            @Override
            public void onResponse(Call<TrainNameNoModel> call, Response<TrainNameNoModel> response) {
                if (response.body().getResponseCode() == 200) {
                    Toast.makeText(MainActivity.this, "Successfully ", Toast.LENGTH_LONG).show();
                    textView1.setText(response.body().getTrain().getName());
                    textView2.setText(response.body().getTrain().getNumber());
                }
                else
                    Toast.makeText(MainActivity.this, "No Record Found", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<TrainNameNoModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No Internet Connection ", Toast.LENGTH_LONG).show();

            }
        });


    }


    public void route(View view) {

        s2 = textView2.getText().toString();
        int i = Integer.valueOf(s2);
        Api api = ClassApi.api().create(Api.class);
        api.getRoute(i).enqueue(new Callback<RouteModel>() {
            @Override
            public void onResponse(Call<RouteModel> call, Response<RouteModel> response) {
                //recyclerView.setAdapter(null);
                RouteModel.Station station = new RouteModel.Station();
                int s = response.body().getRoute().size();
                Toast.makeText(MainActivity.this, "You Will Get Result", Toast.LENGTH_LONG).show();
                if(response.body().getResponseCode()==200)
                {

                    for (int i = 0; i < s; i++) {
                        RouteModel routeModel = new RouteModel();
                        RouteModel.Route_ route_ = new RouteModel.Route_();
                        route_.setStation(response.body().getRoute().get(i).getStation());
                        route_list.add(route_);
                        routeModel.setRoute(route_list);
                        routeList.add(routeModel);
                    }
                    adapter = new Adapter(route_list,getApplicationContext());
                    recyclerView.setAdapter(adapter);


                }
                else
                    Toast.makeText(MainActivity.this, "Wrong Input", Toast.LENGTH_LONG).show();


            }

            @Override
            public void onFailure(Call<RouteModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Connection Error", Toast.LENGTH_LONG).show();

            }
        });


    }
}
