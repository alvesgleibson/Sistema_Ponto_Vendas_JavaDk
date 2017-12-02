package br.com.ondanetpe.messagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final  String EXTRA_MESSAGE = "messagem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView pegarMensagemView = (TextView) findViewById(R.id.recebeValorDaPrimeira);

        pegarMensagemView.setText(messageText);


    }
}
