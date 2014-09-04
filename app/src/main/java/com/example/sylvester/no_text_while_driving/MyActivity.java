package com.example.sylvester.no_text_while_driving;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.telephony.SmsManager;

public class MyActivity extends Activity {

    private Button submitButton;
    private EditText safetyMessageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        submitButton =(Button)findViewById(R.id.submit_button);
        safetyMessageEditText=(EditText)findViewById(R.id.safety_message_edit_text);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onSubmitButtonClick(View view) {

    String safetyMessage = String.valueOf(safetyMessageEditText.getText());

        String theResponse = safetyMessage;

        Toast.makeText(this,theResponse,Toast.LENGTH_LONG).show();

    }



    
}
