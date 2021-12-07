package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
      Button button;
      RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        relativeLayout = findViewById(R.id.rellayout);
    }

    public void changeBackground( View view){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);
        popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.white:
                        relativeLayout.setBackgroundColor(Color.WHITE);
                        break;
                        case R.id.Red:
                        relativeLayout.setBackgroundColor(Color.RED);
                        break;
                        case R.id.Yellow:
                        relativeLayout.setBackgroundColor(Color.YELLOW);
                        break;
                        case R.id.Green:
                        relativeLayout.setBackgroundColor(Color.GREEN);
                        break;case R.id.Blue:
                        relativeLayout.setBackgroundColor(Color.BLUE);
                        break;

                }
                return  true;
            }
        });
        popupMenu.show();
    }
}