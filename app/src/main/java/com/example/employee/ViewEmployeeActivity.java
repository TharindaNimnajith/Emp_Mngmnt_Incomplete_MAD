package com.example.employee;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ViewEmployeeActivity extends AppCompatActivity {

    ListView lissd;
    List list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_employee);

        //lissd=findViewById(R.id.sds);


        //DBhelper sds=new DBhelre(get);
        //list= sds.readAll();

        list.get(0).toString();

        ArrayAdapter<String> dsf = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        lissd.setAdapter(dsf);

        lissd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent=new Intent(getApplicationContext(),MovieOver.class);
                //intent.putExtra("movieName",sdsd);
                //startActivity(intent);
            }
        });

    }
}
