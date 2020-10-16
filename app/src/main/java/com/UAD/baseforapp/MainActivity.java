package com.UAD.baseforapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.*;
import android.support.v7.app.*;
import android.graphics.*;
public class MainActivity extends ActionBarActivity
{  

private Toolbar app_bar;

@Override 
protected void onCreate(Bundle savedInstanceState) {  super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		app_bar=(Toolbar) findViewById(R.id.app_bar);
	setSupportActionBar(app_bar);
	app_bar.setTitleTextColor(Color.WHITE);
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

if(item.getItemId()==R.id.about){
	
	startActivity(new  Intent(this, About.class));
}
	return true;
	}
		
		
}
