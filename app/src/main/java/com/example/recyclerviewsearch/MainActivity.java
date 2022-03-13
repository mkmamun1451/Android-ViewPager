package com.example.recyclerviewsearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiInterface apiInterface;
    private List<OngoingOrderData> list;
    private RecyclerView recyclerView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = AppConfig.getRetrofit(this).create(ApiInterface.class);
        list = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        editText = findViewById(R.id.srchEt);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        apiInterface.getallOngoingOrder("166").enqueue(new Callback<OngoingOrderResponse>() {
            @Override
            public void onResponse(Call<OngoingOrderResponse> call, Response<OngoingOrderResponse> response) {
                if (response.isSuccessful()){
                    list = response.body().getData();
                    recyclerView.setAdapter(new OngoingOrderAdapter(MainActivity.this,list));
                }
            }

            @Override
            public void onFailure(Call<OngoingOrderResponse> call, Throwable t) {

            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                List<OngoingOrderData> searchList = new ArrayList<>();





                String searchValue = editable.toString();

                if (searchValue!=null || searchValue.equals("")){
                    for (int s = 0; s< list.size(); s++){
                        if (list.get(s).getOrderid().contains(searchValue)){
                            searchList.add(list.get(s));
                        }
                    }
                    recyclerView.setAdapter(new OngoingOrderAdapter(MainActivity.this,
                            searchList));
                }else{
                    recyclerView.setAdapter(new OngoingOrderAdapter(MainActivity.this,
                            list));
                }
            }
        });
    }
}