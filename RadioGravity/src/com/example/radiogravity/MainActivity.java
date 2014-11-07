package com.example.radiogravity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RadioGroup orientation = (RadioGroup) findViewById(R.id.orientation);
        RadioGroup gravity = (RadioGroup) findViewById(R.id.gravity);
        
        orientation.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId)
			{
				// TODO Auto-generated method stub
				switch(checkedId)
				{
				case R.id.horizontal:
					group.setOrientation(RadioGroup.VERTICAL);
					break;
				case R.id.vertical:
					group.setOrientation(RadioGroup.HORIZONTAL);
					break;
				}
				
			}
        });
        
        gravity.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId)
			{
				// TODO Auto-generated method stub
				switch(checkedId)
				{
				case R.id.left:
					group.setGravity(Gravity.LEFT);
					break;
				case R.id.center:
					group.setGravity(Gravity.CENTER);
					break;
				case R.id.right:
					group.setGravity(Gravity.RIGHT);
					break;
				}
				
			}
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
