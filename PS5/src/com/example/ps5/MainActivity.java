package com.example.ps5;

import pckge1.CalcFutureValue;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void CalcFV(View view)
	{
		EditText editText1 = (EditText) findViewById(R.id.editText1);
		EditText editText2 = (EditText) findViewById(R.id.editText2);
		EditText editText3 = (EditText) findViewById(R.id.editText3);
		String invest = editText1.getText().toString();
		String yrs = editText2.getText().toString();
		String IRate = editText3.getText().toString();
		double inv = Double.parseDouble(invest);
		int years = Integer.parseInt(yrs);
		double IR = Double.parseDouble(IRate);
		CalcFutureValue FV = new CalcFutureValue();
		double total = CalcFutureValue.FutureValue(inv, years, IR);
		String TFV = "Your Future Value is" + total;
		
		
		
		
	}
}
