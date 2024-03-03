package com.example.weatherapp;

import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.ViewHolder> {


    private Context context;
    private ArrayList<WeatherRVModal>weatherRVModalArrayList;

    public WeatherRVAdapter(Context context, ArrayList<WeatherRVModal>weatherRVModalArrayList){
        this.context=context;
        this.weatherRVModalArrayList=weatherRVModalArrayList;

    }
    @NonNull
    @Override
    public WeatherRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.ViewHolder holder, int position){

    }
    @Override
    public int getItemCount(){
       View view = LayoutInflater.from(context).inflate(R.layout.weather_rv_item,parent,attachToRoot:false);
    }
    public class  ViewHolder extends RecyclerView.ViewHolder{

        public ViewHOlder(@NonNull  View itemView) {
            super(itemView);
        }
    }


}
