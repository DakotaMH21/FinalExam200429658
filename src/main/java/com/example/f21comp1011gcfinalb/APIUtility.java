package com.example.f21comp1011gcfinalb;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class APIUtility {
    public static Dealership getFromJsonFile()
    {
        Gson gson = new Gson();
        Dealership response = null;

        try(
                FileReader fileReader = new FileReader("carData.json");
                JsonReader jsonReader = new JsonReader(fileReader)
                )
        {
            response = gson.fromJson(jsonReader, Dealership.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return response;
    }
}
