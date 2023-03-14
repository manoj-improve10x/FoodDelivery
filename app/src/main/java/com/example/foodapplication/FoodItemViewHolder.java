package com.example.foodapplication;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapplication.databinding.SoupsItemBinding;

public class FoodItemViewHolder extends RecyclerView.ViewHolder {

    SoupsItemBinding binding;

    public FoodItemViewHolder(SoupsItemBinding soupsItemBinding) {
        super(soupsItemBinding.getRoot());
        binding = soupsItemBinding;
    }
}
