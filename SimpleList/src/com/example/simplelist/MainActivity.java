package com.example.simplelist;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res.getStringArray(R.array.countries)));
    }
    
    protected void onListItemClick(ListView l, View v,int position, long id)
    {
    	String message = l.getItemAtPosition(position).toString();
    	
    	Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
