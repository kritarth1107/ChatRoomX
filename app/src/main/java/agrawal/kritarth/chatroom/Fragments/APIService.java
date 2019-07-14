package agrawal.kritarth.chatroom.Fragments;


import agrawal.kritarth.chatroom.Notifications.MyResponse;
import agrawal.kritarth.chatroom.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAxE28wYw:APA91bFuY2kyPCGOWx01YQ6UE86f-7OeYiA0yE_P3WFCN5mMhfW6ryrL15JODI4FqY45_yLcBrkwtvjdsLm6AJcd7EubWzEBzqZQNulpj2Q8pQh6Ts_noVXMPSa2aCQXVbXH4HbiagGT"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}