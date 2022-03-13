package com.example.recyclerviewsearch;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("getongoingorder")
    Call<OngoingOrderResponse> getallOngoingOrder(@Field("id") String id);
}
