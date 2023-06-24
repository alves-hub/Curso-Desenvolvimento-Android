package devandroid.alves.applistacurso.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import devandroid.alves.applistacurso.R;
import devandroid.alves.applistacurso.applistacurso.controller.PessoaController;
import devandroid.alves.applistacurso.applistacurso.model.Curso;
import devandroid.alves.applistacurso.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;
    Pessoa pessoa;
    EditText editTextPrimeiroNome;
    EditText editTextSobrenome;
    EditText editTextNomeCursoDesejado;
    EditText editTextTelefoneDeContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        controller = new PessoaController(MainActivity.this);
        controller.toString();
        pessoa = new Pessoa();
        controller.buscar(pessoa);

        // associando class editText e button ao MainActivity.java
        editTextPrimeiroNome = findViewById(R.id.editTextPrimeiroNome);
        editTextSobrenome = findViewById(R.id.editTextSobrenome);
        editTextNomeCursoDesejado = findViewById(R.id.editTextNomeCursoDesejado);
        editTextTelefoneDeContato = findViewById(R.id.editTextTelefoneDeContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnSalvar = findViewById(R.id.btnSalvar);

        // inserindo valor na tela do app
        editTextPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editTextSobrenome.setText(pessoa.getSobreNome());
        editTextNomeCursoDesejado.setText(pessoa.getCursoDesejado());
        editTextTelefoneDeContato.setText(pessoa.getNumeroTelefone());

        // acao dos botoes das telas
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPrimeiroNome.setText("");
                editTextSobrenome.setText("");
                editTextNomeCursoDesejado.setText("");
                editTextTelefoneDeContato.setText("");

                controller.limpar();
            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Volte Sempre!", Toast.LENGTH_LONG).show();
                finish();

            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(editTextPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editTextSobrenome.getText().toString());
                pessoa.setCursoDesejado(editTextNomeCursoDesejado.getText().toString());
                pessoa.setNumeroTelefone(editTextTelefoneDeContato.getText().toString());
                Toast.makeText(MainActivity.this, "Cadastro Realizado!" + pessoa.toString(), Toast.LENGTH_LONG).show();

                controller.Salvar(pessoa);
            }
        });

        Log.i("POOAndroid", pessoa.toString());
    }
}