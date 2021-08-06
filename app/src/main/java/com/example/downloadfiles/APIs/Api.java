package com.example.downloadfiles.APIs;


import com.example.downloadfiles.Model.FakeResponse;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("profile/address/add")
    Call<FakeResponse> AddAddressAPI(


    );

}

