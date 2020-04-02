package com.uaspm2didiksazali.aplikasilelangikan;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends Activity{
	
	ImageButton btnCall, btnMessage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		btnCall = (ImageButton)findViewById(R.id.btnCall);
		btnMessage = (ImageButton)findViewById(R.id.btnMessage);
		
		btnCall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), CallActivity.class);
				startActivity(intent);
			}
		});
		
		btnMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), MessageActivity.class);
				startActivity(intent);
			}
		});
	}
}
