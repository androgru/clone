package com.UAD.baseforapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.*;
import android.support.v7.app.*;
public class About extends ActionBarActivity
{  

	private Toolbar app_bar;

	@Override 
	protected void onCreate(Bundle savedInstanceState) {  super.onCreate(savedInstanceState);
		setContentView(R.layout.about_toolbar);
		app_bar=(Toolbar) findViewById(R.id.app_bar);
		setSupportActionBar(app_bar);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu aaa)
	{

		MenuInflater  mimenu= getMenuInflater();
		mimenu.inflate(R.menu.my_menu,aaa);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{

		if(item.getItemId()==android.R.id.home){

			startActivity(new  Intent(this, MainActivity.class));
		}
		return true;
	}


	
}
