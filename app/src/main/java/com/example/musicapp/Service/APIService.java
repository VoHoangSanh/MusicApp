package com.example.musicapp.Service;

public class APIService {
    private static String base_url = "https://sanhvolala0509.000webhostapp.com/server/";

    public static Dataservice getService(){

        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
