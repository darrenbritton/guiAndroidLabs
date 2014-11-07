package com.example.customlist;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	@SuppressLint("ViewHolder")
	public class ImageTextListAdapter  extends ArrayAdapter<String>
	{
		Context context;
		String[] values;
		int textViewResourceId;
		
		public ImageTextListAdapter(Context context,int resource,int textViewResourceId,String[] values)
		{
			super(context,resource,textViewResourceId,values);
			this.textViewResourceId = textViewResourceId;
			this.context = context;
			this.values = values;
		}

		@SuppressLint("ViewHolder")
		@Override
		public View getView(int position,  View view, ViewGroup parent) {
		    
			LayoutInflater inflater=getLayoutInflater();
			inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			 View row=inflater.inflate(R.layout.row, parent, false);
		        View rowView = inflater.inflate(R.layout.row, parent, false);
		        TextView textView = (TextView) rowView.findViewById(textViewResourceId);
		        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		        textView.setText(values[position]);
		        String s = values[position];
		        if (!s.contains("Ireland")) {
			          imageView.setImageResource(android.R.drawable.arrow_down_float);
		        }

		        return rowView;
		}

	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        setListAdapter(new ImageTextListAdapter(this,R.layout.row,R.id.country,res.getStringArray(R.array.countries)));
    }
    
    protected void onListItemClick(ListView l, View v,int position, long id)
    {
    	String message = l.getItemAtPosition(position).toString();
    	
    	Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
