package com.ifm25907.semaine2;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class ActiviteSeconde extends AppCompatActivity {

        private static final String TAG = "ActiviteSeconde";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activite_seconde);

            Log.i(TAG, "onCreate");

        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.i(TAG, "onStart");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i(TAG, "onStop");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i(TAG, "onDestroy");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.i(TAG, "onPause");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i(TAG, "onResume");
        }

        @Override
        protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);
            Log.i(TAG, "onRestoreInstanceState");


        }

        @Override
        protected void onSaveInstanceState(@NonNull Bundle outState) {
            super.onSaveInstanceState(outState);
            Log.i(TAG, "onSaveInstanceState");

        }
}
