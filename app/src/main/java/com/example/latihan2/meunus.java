package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.latihan2.databinding.ActivityMainConstraintBinding;
import com.example.latihan2.databinding.ActivityMeunusBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class meunus extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    ActivityMeunusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        bottomNavigationView.findViewById(R.id.bottomNavigationView);
        super.onCreate(savedInstanceState);
        binding = ActivityMeunusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setOnItemReselectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.home) {
                replaceFragment(new HomeFragment());
            } else if (itemId == R.id.profile) {
                replaceFragment(new ProfileFragment());
            } else if (itemId == R.id.settings) {
                replaceFragment(new SettingsFragment());
            }


        });
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }
}