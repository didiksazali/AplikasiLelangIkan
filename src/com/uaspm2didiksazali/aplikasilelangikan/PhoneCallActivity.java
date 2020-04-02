package com.uaspm2didiksazali.aplikasilelangikan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneCallActivity extends Activity{

	EditText edtPhoneCall;
	Button btnCall;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phonecall);
		
		btnCall = (Button)findViewById(R.id.btnCall);
		edtPhoneCall = (EditText)findViewById(R.id.edtPhoneCall);
		
		btnCall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_CALL);
				String nomor = edtPhoneCall.getText().toString();
				if (nomor.trim().isEmpty()) {
					intent.setData(Uri.parse("tel:082170002021"));
					startActivity(intent);
				}
				else {
				intent.setData(Uri.parse("tel:"+nomor));
				startActivity(intent);
				}
			}
		});
	}
}
