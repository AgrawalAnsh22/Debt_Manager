package com.example.ansh.debt_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class Main2Activity extends AppCompatActivity {

    EditText Name,Amount,Note;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name = (EditText)findViewById(R.id.borrowName);
        Amount= findViewById(R.id.borrowAmount);
        Note = (EditText)findViewById(R.id.borrowNote);
    }

    public void cancelbtn(View view) {
        finish();
    }

    public void savebtn(View view) {


    }


}
