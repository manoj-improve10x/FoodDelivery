package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapplication.databinding.ActivityFoodListBinding;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    public ArrayList<FoodItem> arrayList;
    public ActivityFoodListBinding binding;
    public FoodItemAdapter foodItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        setupData();
        setupFoodItem();
    }

    private void setupData() {
        arrayList = new ArrayList<>();
        FoodItem item1 = new FoodItem();
        item1.itemName = "Chicken Soup";
        item1.description = "tomato, chicken";
    }

    private void setupFoodItem() {
    }
}