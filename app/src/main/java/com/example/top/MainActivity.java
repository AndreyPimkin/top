package com.example.top;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*получаем элемент TextView
        TextView selection = findViewById(R.id.view); */
        ListView listTeams = findViewById(R.id.topTeamList);
        // получаем ресурс
        String[] listTeamResource = getResources().getStringArray(R.array.listTeam);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listTeamResource);
        listTeams.setAdapter(adapter);
        listTeams.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                // по позиции получаем выбранный элемент
                String selectedItem = listTeamResource[position];
                Intent intentinfo = new Intent(MainActivity.this, SecondActivity.class);
                intentinfo.putExtra("choice", selectedItem);
                startActivity(intentinfo);
            }
        });
    }



}