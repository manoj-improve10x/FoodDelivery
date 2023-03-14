package com.example.foodapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapplication.databinding.SoupsItemBinding;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemViewHolder> {
    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        SoupsItemBinding binding = SoupsItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        FoodItemViewHolder foodItemViewHolder = new FoodItemViewHolder(binding);
        return foodItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
