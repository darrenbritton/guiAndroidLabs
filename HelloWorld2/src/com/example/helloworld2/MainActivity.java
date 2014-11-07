package com.example.helloworld2;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener, View.OnKeyListener {
	Button btn;
	
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_main);
		
		btn = (Button)findViewById(R.id.getTimeButton);
		btn.setOnClickListener(this);
		updateTime();
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

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		updateTime();
	}
	
	private void updateTime()
	{
		Button tempBtn = (Button)findViewById(R.id.timeButton);
		tempBtn.setText(new Date().toString());
		TextView tempTV = (TextView)findViewById(R.id.userDataLabel);
		EditText tempET = (EditText)findViewById(R.id.userTextField);
		tempTV.setText(tempET.getText());
		
		
	}

	@Override
	public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
		// TODO Auto-generated method stub
		updateTime();
		return false;
	}
}