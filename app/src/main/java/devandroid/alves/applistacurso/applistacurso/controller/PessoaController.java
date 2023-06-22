package devandroid.alves.applistacurso.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.alves.applistacurso.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC Controller","Controller iniciado...");
        return super.toString();
    }

    public void Salvar(Pessoa pessoa){

        Log.d("MVC Controller","Controller iniciado..."+ pessoa.toString());
    }
}
