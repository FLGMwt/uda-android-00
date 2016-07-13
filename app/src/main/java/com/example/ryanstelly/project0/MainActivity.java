package com.example.ryanstelly.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateProject(View view) {
        Button button = (Button)view;
        String buttonText = button.getText().toString().toLowerCase();
        String toastText = String.format(getString(R.string.project_toast_format), buttonText);
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}