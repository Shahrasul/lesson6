package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lesson6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);
        actions();

    }

    private void actions() {
        math = new Math();
        binding.btnAddition.setOnClickListener(view -> {
            int result = math.addition(Integer.valueOf(binding.firstNum.getText().toString()),
                    Integer.valueOf(binding.secondNum.getText().toString()));
            binding.tvResult.setText(String.valueOf(result));
        });
        binding.btnSubtraction.setOnClickListener(view -> {
            int result = math.subtraction(Integer.valueOf(binding.firstNum.getText().toString()),
                    Integer.valueOf(binding.secondNum.getText().toString()));
            binding.tvResult.setText(String.valueOf(result));
        });
        binding.btnMultiply.setOnClickListener(view -> {
            int result = math.multiply(Integer.valueOf(binding.firstNum.getText().toString()),
                    Integer.valueOf(binding.secondNum.getText().toString()));
            binding.tvResult.setText(String.valueOf(result));
        });
        binding.btnDivision.setOnClickListener(view -> {
            int result = math.division(Integer.valueOf(binding.firstNum.getText().toString()),
                    Integer.valueOf(binding.secondNum.getText().toString()));
            binding.tvResult.setText(String.valueOf(result));
        });
    }
}