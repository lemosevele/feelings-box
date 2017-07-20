package com.ufrpe.feelingsbox.gui;
/*
 * Tela de Login
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ufrpe.feelingsbox.R;

public class ActLogin extends AppCompatActivity {

    //Declarando os Elementos da Tela(activity)
    private EditText edtLogin, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);

        //Encontrando Elemento da Tela(activity)
        edtLogin = (EditText)findViewById(R.id.edtLogin);
        edtSenha = (EditText)findViewById(R.id.edtSenha);

    }

    public void cadastrarUsuario(View view){
        //Trocando para a Tela de Cadastro
        Intent it = new Intent(ActLogin.this, ActSignUp.class);
        startActivity(it);
    }

}
