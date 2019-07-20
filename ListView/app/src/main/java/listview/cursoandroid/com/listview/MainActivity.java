package listview.cursoandroid.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaItens;
    private String [] itens = {
            "Angra dos Reis", "Caldas novas",
            "Campos do jordão", "Costa da suipe",
            "Ilheus", "Porto Seguro", "Rio de janeiro","Tiradentes",
            "Praga", "Santiago", "Zurique", "Caribe", "Buenos Aires",
            "Budapest", "Cancun", "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int codigoPosicao = i;
                String valorClicado = listaItens.getItemAtPosition(codigoPosicao).toString();

                Toast.makeText(getApplicationContext(), "Você clicou em "+valorClicado+"!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
