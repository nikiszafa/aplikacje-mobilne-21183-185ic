package com.hfad.mymessenger;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        //Tworzymy nowy intent aby przejsc do innego activity
        //Pierwszy parametr - od kogo
        //Drugi parametr - do kogo ma trafic intent
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        //Mozemy przekazac informacje do activity do ktorego wysylamy intent.
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);

        //startActivity aby przeslac do androida i przejsc do innego activity
        startActivity(intent);



    }
}