package com.rkr.listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ListView listViewStates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the array of states
        String[] states = {
                "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa",
                "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala",
                "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland",
                "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
                "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };

        // Find the ListView in the layout
        listViewStates = findViewById(R.id.listViewStates);

        // Create an ArrayAdapter
        var adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, states);

        // Set the adapter to the ListView
        listViewStates.setAdapter(adapter);

        // Set an item click listener for the ListView
        listViewStates.setOnItemClickListener((parent, view, position, id) -> {
            // Get the clicked item
            var selectedState = (String) parent.getItemAtPosition(position);
            // Show a toast message with the selected item as a new change
            Toast.makeText(MainActivity.this, "Clicked: " + selectedState, Toast.LENGTH_SHORT).show();
        });
    }
}