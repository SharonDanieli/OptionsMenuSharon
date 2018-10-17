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

public class MainActivity extends AppCompatActivity {

    LinearLayout bg;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bg = (LinearLayout) findViewById(R.id.bg);
        buttonNext = (Button) findViewById(R.id.buttonNext);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menuRed){
            bg.setBackgroundColor(Color.RED);
        }
        if (id == R.id.menuYellow){
            bg.setBackgroundColor(Color.YELLOW);
        }
        if (id == R.id.menuGreen){
            bg.setBackgroundColor(Color.GREEN);
        }

        return super.onOptionsItemSelected(item);
    }
    public void openActivity2(View view) {
        Intent in = new Intent(this, Activity2.class);
        startActivity(in);
    }

}
