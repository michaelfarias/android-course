package idadedecachorro.cursoandroid.com.idadedecachorrro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixaIdadeId);
        botaoIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);


        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String textoDigitado = caixaTexto.getText().toString();

                if(!textoDigitado.isEmpty()){
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int valorResultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro em idade humanos é: " + valorResultadoFinal + " anos");
                }

                else resultadoIdade.setText("Nenhum número digitado!");
            }
        });

    }
}
