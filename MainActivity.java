package com.yahoo.example.tipcalapp;

import java.awt.font.NumericShaper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	public EditText etTipAmount; 
	public TextView tvTips;
	//Integer.valueOf(yourString);
	public int myinteger;
      //public int myinteger = Integer.valueOf(etTipAmount.getText().toString());


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etTipAmount = (EditText) findViewById(R.id.etTipAmount); 
		tvTips = (TextView) findViewById(R.id.tvTips); 
		//myinteger = Integer.valueOf(etTipAmount.getText().toString());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public <myinteger> void onTen(View v) {
		//passing a String value
		  //String fieldValue = etTipAmount.getText().toString(); 
		//converting the string into an integer for calculation and multiply by tip 10% button
		myinteger = (int) (Integer.valueOf(etTipAmount.getText().toString()) * .10);
		//fires when button is pressed. Name must match the button
		  //Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
		  //tvTips.setText(fieldValue);
		//change the text label - convert from integer to string
		tvTips.setText(Integer.toString(myinteger));

	}

	public void onFifteen(View v) {
		//passing a String value
		  //String fieldValue = etTipAmount.getText().toString(); 
		//converting the string into an integer for calculation and multiply by tip 10% button
		myinteger = (int) (Integer.valueOf(etTipAmount.getText().toString()) * .15);
		//fires when button is pressed. Name must match the button
		  //Toast.makeText(this, "15%", Toast.LENGTH_SHORT).show();
		  //tvTips.setText(fieldValue);
		//change the text label - convert from integer to string
		tvTips.setText(Integer.toString(myinteger));
	}

	public void onTwentyFive(View v) {
		//passing a String value
		  //String fieldValue = etTipAmount.getText().toString(); 
		//converting the string into an integer for calculation and multiply by tip 10% button
		myinteger = (int) (Integer.valueOf(etTipAmount.getText().toString()) * .25);
		//fires when button is pressed. Name must match the button
	      //Toast.makeText(this, "25%", Toast.LENGTH_SHORT).show();
		  //tvTips.setText(fieldValue);
		//change the text label - convert from integer to string
		tvTips.setText(Integer.toString(myinteger));
	}

}
