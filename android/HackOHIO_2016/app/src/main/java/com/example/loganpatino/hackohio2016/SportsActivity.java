package com.example.loganpatino.hackohio2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SportsActivity extends AppCompatActivity {

    private String[] sportsArray = { "Basketball", "Volleyball", "Baseball"};

    private ListView sportsListView;
    private ArrayAdapter arrayAdapter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        sportsListView = (ListView) findViewById(R.id.sports_list);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sportsArray);
        sportsListView.setAdapter(arrayAdapter);

        sportsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), LobbyActivity.class);
                intent.putExtra("title", sportsArray[position]);
                startActivity(intent);
            }
        });
    }
}

