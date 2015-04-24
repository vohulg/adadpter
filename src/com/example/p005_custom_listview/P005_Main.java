package com.example.p005_custom_listview;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class P005_Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005__main);
        
        ListView list = (ListView)findViewById(R.id.lvMain);
        list.setClickable(true);
        //list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        
        final List<POJO> listOfPhone = new ArrayList<POJO>();
        POJO p1 = new POJO("jon", "12345", "jon@mail.com");
        POJO p2 = new POJO("jon2", "76984746", "jo2n@mail.com");
        POJO p3 = new POJO("jon3", "6747", "jon3@mail.com");
        
        listOfPhone.add(p1);
        listOfPhone.add(p2);
        listOfPhone.add(p3);
        
        CustomAdapter adapter = new  CustomAdapter(this, listOfPhone);
        
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long index) {
                System.out.println("sadsfsf");
                showToast(listOfPhone.get(position).getName());
            }
        });
        
        list.setAdapter(adapter);
        
    }
    
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


   
}

