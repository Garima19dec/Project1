package com.example.barbozza.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.barbozza.R;

public class Mail extends AppCompatActivity {

    private EditText mEditTextTo, mEditTextSubject, mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);


        mEditTextTo = (EditText)findViewById(R.id.edit_text_to);
        mEditTextSubject = (EditText)findViewById(R.id.edit_text_subject);
        mEditTextMessage = (EditText)findViewById(R.id.edit_text_message);

        Button send = findViewById(R.id.button_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });

    }

    private void sendMail() {
        String recipientList = mEditTextTo.getText().toString();
        String[] recipients = recipientList.split(",");


        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);


        intent.setType("messsage/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email  Client"));

    }
}
