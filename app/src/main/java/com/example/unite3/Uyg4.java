package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg4);
        char karakter = 'a';
        int ascii = (int) karakter;
        System.out.println("Karakter: " + karakter);
        System.out.println("ASCII kodu: " + ascii);
    }
}