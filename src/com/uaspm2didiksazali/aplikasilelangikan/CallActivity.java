package com.uaspm2didiksazali.aplikasilelangikan;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CallActivity extends Activity{

	ImageButton btnPhoneCall, btnPhoneLog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_call);
		
		btnPhoneCall = (ImageButton)findViewById(R.id.btnPhoneCall);
		btnPhoneLog = (ImageButton)findViewById(R.id.btnPhoneLog);
		
		btnPhoneCall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), PhoneCallActivity.class);
				startActivity(intent);
			}
		});
		
		btnPhoneLog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), PhoneLogActivity.class);
				startActivity(intent);
			}
		});
	}
}
