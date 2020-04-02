package com.uaspm2didiksazali.aplikasilelangikan;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MessageActivity extends Activity{

	ImageButton btnWriteMessage, btnReadMessage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
		
		btnWriteMessage = (ImageButton)findViewById(R.id.btnWriteMessage);
		btnReadMessage = (ImageButton)findViewById(R.id.btnReadMessage);
		
		btnWriteMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), WriteMessageActivity.class);
				startActivity(intent);
			}
		});
		
		btnReadMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), ReadMessageActivity.class);
				startActivity(intent);
			}
		});
	}
}
