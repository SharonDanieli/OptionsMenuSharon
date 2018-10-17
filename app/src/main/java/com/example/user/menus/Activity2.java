package com.example.user.menus;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    LinearLayout bg2;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        bg2 = findViewById(R.id.bg2);
        buttonBack = findViewById(R.id.buttonBack);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 150, "BLUE");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        String st = item.getTitle().toString();

        if (id == R.id.menuRed){
            bg2.setBackgroundColor(Color.RED);
            // Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
        }

        if (st.equals("BLUE")){
            bg2.setBackgroundColor(Color.BLUE);

        }
        if (id == R.id.menuYellow){
            bg2.setBackgroundColor(Color.YELLOW);
            // Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.menuGreen){
           bg2.setBackgroundColor(Color.GREEN);
            // Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void backToMainActivity(View view) {
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
