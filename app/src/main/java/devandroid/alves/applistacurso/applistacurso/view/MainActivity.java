package devandroid.alves.applistacurso.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.alves.applistacurso.R;
import devandroid.alves.applistacurso.applistacurso.model.Curso;
import devandroid.alves.applistacurso.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

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

        String dadosPessoa;
        String dadosOutraPessoa;

        pessoa = new Pessoa();
        outraPessoa = new Pessoa();

        // Atribuir conteudo, conteúdo dados, valores para o objeto
        // conforme seu modelo template
        pessoa.setPrimeiroNome("Jefferson");
        pessoa.setSobreNome("Alves");
        pessoa.setCursoDesejado("Android");
        pessoa.setNumeroTelefone("11-93215-8866");


        outraPessoa.setPrimeiroNome("Daiany");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Kotilin");
        outraPessoa.setNumeroTelefone("11-93215-0000");



        dadosPessoa = " Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobresnome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getNumeroTelefone();

        dadosOutraPessoa = " Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de contato: ";
        dadosOutraPessoa += outraPessoa.getNumeroTelefone();

        // estanciando as classes e editText e button
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

        Log.i("POOAndroid", pessoa.toString());
        Log.i("POOAndroid", outraPessoa.toString());



    }
}