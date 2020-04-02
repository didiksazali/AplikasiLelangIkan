package com.uaspm2didiksazali.aplikasilelangikan;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WriteMessageActivity extends Activity{

	Button btnSendMessage;
	EditText edtNoMessage, edtInputMessage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_writemessage);
		
		edtNoMessage = (EditText)findViewById(R.id.edtNoMessage);
		edtInputMessage = (EditText)findViewById(R.id.edtInputMessage);
		btnSendMessage = (Button)findViewById(R.id.btnSendMessage);
		
		btnSendMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String nomor = edtNoMessage.getText().toString();
				String pesan = edtInputMessage.getText().toString();
				
				try {
					SmsManager smsManager = SmsManager.getDefault();
					smsManager.sendTextMessage(nomor, null, pesan, null, null);
					edtNoMessage.setText("");
					edtInputMessage.setText("");
					Toast.makeText(getApplicationContext(), "SMS terkirim",
								Toast.LENGTH_LONG).show();
				  } catch (Exception e) {
					Toast.makeText(getApplicationContext(),
						"SMS faild, please try again later!",
						Toast.LENGTH_LONG).show();
					e.printStackTrace();
				  }
			}
		});
	}
}
