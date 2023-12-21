package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1 - step create dialog class object
        Dialog dialog = new Dialog(this);


        //2- step attached the layout
        dialog.setContentView(R.layout.dialog_custom_layout);

        //3- show dialog
        dialog.show();
    }
}