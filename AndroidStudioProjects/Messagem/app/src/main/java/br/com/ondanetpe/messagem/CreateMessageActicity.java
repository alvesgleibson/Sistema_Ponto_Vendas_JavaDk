package br.com.ondanetpe.messagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class CreateMessageActicity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){

        EditText mensagenEnviar = (EditText)findViewById(R.id.message);
        String mens = mensagenEnviar.getText().toString();

       Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra("message",mens);
        startActivity(intent);



    }
}
