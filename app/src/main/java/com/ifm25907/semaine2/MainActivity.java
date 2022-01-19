package com.ifm25907.semaine2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");
    }

    public void changer_activite(View view){
        Intent i = new Intent(MainActivity.this, ActiviteSeconde.class);
        startActivity(i);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i( TAG, "onRestoreInstanceState"       );

        final EditText editText = findViewById(R.id.editText);
        CharSequence  userText = savedInstanceState.getCharSequence("saveText");
        editText.setText(userText);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i( TAG, "onSaveInstanceState");

        final EditText editText = findViewById(R.id.editText);
        CharSequence userText = editText.getText();
        outState.putCharSequence("saveText", userText);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i( TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i( TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i( TAG, "onResume");
    }
}