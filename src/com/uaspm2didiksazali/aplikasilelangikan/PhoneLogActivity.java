package com.uaspm2didiksazali.aplikasilelangikan;

import java.util.Date;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.CallLog;
import android.widget.TextView;

public class PhoneLogActivity extends Activity{

	TextView textView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phonelog);
		
		textView = (TextView) findViewById(R.id.textview_call);
		StringBuffer sb = new StringBuffer();
		  Cursor managedCursor = managedQuery(CallLog.Calls.CONTENT_URI, null,
		    null, null, null);
		  int number = managedCursor.getColumnIndex(CallLog.Calls.NUMBER);
		  int type = managedCursor.getColumnIndex(CallLog.Calls.TYPE);
		  int date = managedCursor.getColumnIndex(CallLog.Calls.DATE);
		  int duration = managedCursor.getColumnIndex(CallLog.Calls.DURATION);
		  sb.append("Call Log :");
		  while (managedCursor.moveToNext()) {
		   String phNumber = managedCursor.getString(number);
		   String callType = managedCursor.getString(type);
		   String callDate = managedCursor.getString(date);
		   Date callDayTime = new Date(Long.valueOf(callDate));
		   String callDuration = managedCursor.getString(duration);
		   String dir = null;
		   int dircode = Integer.parseInt(callType);
		   switch (dircode) {
		   case CallLog.Calls.OUTGOING_TYPE:
		    dir = "Keluar";
		    break;

		   case CallLog.Calls.INCOMING_TYPE:
		    dir = "Masuk";
		    break;

		   case CallLog.Calls.MISSED_TYPE:
		    dir = "Tidak Terjawab";
		    break;
		   }
		   sb.append("\nNo Telepon: " + phNumber + " \nJenis Panggilan: "
		     + dir + " \nWaktu Panggilan: " + callDayTime
		     + " \nLama panggilan (detik): " + callDuration);
		   sb.append("\n-------------------------------------------------");
		  }
		  //managedCursor.close();
		  textView.setText(sb);
		 }
	}

