package com.example.arrayadapterapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] subjects = {"Java", "Python", "Android", "Database", "Networking"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        // Create ArrayAdapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, subjects);

        // Set adapter to ListView
        listView.setAdapter(adapter);

        // Toast when item is clicked
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,
                    "You selected: " + subjects[position],
                    Toast.LENGTH_SHORT).show();
        });
    }
}