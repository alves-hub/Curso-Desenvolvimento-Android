package devandroid.alves.applistacurso.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

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
    Pessoa outraPessoa;
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

        pessoa = new Pessoa();
        outraPessoa = new Pessoa();
        controller = new PessoaController();
        controller.toString();


        // Atribuir conteudo, conteúdo dados, valores para o objeto
        pessoa.setPrimeiroNome("Jefferson");
        pessoa.setSobreNome("Alves");
        pessoa.setCursoDesejado("Android");
        pessoa.setNumeroTelefone("11-93215-8866");

        outraPessoa.setPrimeiroNome("Daiany");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Kotilin");
        outraPessoa.setNumeroTelefone("11-93215-0000");



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
        Log.i("POOAndroid", outraPessoa.toString());
    }
}