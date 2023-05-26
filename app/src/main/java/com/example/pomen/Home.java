package com.example.pomen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Home extends AppCompatActivity {

        ImageButton openActivity;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            openActivity = (ImageButton) findViewById(R.id.imageButton2);
        }

        public void openActivity2(View view) {
            Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);
        }
}
