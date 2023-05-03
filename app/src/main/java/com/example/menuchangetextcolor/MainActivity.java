package com.example.menuchangetextcolor;

import static android.graphics.Color.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolb);
        textView=findViewById(R.id.textView);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        if(item_id==R.id.blue)
        {
            textView.setBackgroundColor(getResources().getColor(R.color.blue));
            return true;
        }
        else if(item_id==R.id.green)
        {
            textView.setBackgroundColor(getResources().getColor(R.color.green));
            return true;
        }
        else
        {
            Toast.makeText(this, "Noting Selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}