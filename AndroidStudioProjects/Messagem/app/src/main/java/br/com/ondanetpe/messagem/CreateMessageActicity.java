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

        /*pegar o valor de EditTexto(O que o usuario Digitou) e colocar em uma variavel do mesmo objeto que foi
        *declarado no para obter o valor do cliente e fazer o Cast
        */
        EditText receberVariavelEditText = (EditText) findViewById(R.id.messageTesteUsuario);

        //Add uma String para pegar o valor do usuario
        String recebeValorDaMensagem = receberVariavelEditText.getText().toString();


        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, recebeValorDaMensagem);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, recebeValorDaMensagem);

        startActivity(intent);


    }




}
