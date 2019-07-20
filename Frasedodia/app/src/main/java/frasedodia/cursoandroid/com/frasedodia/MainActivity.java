package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button butaoNovaFrase;

    private String[] frases = {
            "Se você traçar metas absurdamente e falhar, seu fracasso muito melhor que o sucesso de todos",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        butaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        butaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
