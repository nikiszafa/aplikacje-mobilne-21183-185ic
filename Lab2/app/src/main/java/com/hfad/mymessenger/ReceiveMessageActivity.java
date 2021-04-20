package com.hfad.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        //Pobieramy intent ktory rozpoczal tą aktywnosc
        Intent intent = getIntent();

        //Pobieramy informacje przeslane razem z intent
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText);

    }

    public void onActionSendSms(View view){
        //Tworzymy nowy intent, ktory przekaze informacje do zewnetrznych aktywnosci wysylajacych wiadomosci
        Intent intent1 = new Intent(Intent.ACTION_SEND);
        intent1.setType("text/plain");
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        intent1.putExtra(Intent.EXTRA_TEXT,messageText);

        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent1, chooserTitle);
        startActivity(chosenIntent);

    }

    public void onActionSendEmail(View view){
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        EditText emailSubjectView = (EditText)findViewById(R.id.emailSubject);
        String subject = emailSubjectView.getText().toString();

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_TEXT, messageText);
        email.putExtra(Intent.EXTRA_SUBJECT,subject);
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email,"Wybierz pocztę Email..."));
    }
}