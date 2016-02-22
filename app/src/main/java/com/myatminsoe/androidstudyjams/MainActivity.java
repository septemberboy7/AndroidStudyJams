package com.myatminsoe.androidstudyjams;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String[] screens = {"Week 1, HW 1", "Week 1, HW 2", "Valentines Card", "Week 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, screens);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getBaseContext(), Homework1.class));
                        break;
                    case 1:
                        startActivity(new Intent(getBaseContext(), Homework2.class));
                        break;
                    case 2:
                        startActivity(new Intent(getBaseContext(), ValentineCard.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
