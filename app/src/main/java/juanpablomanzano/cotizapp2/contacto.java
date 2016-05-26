package juanpablomanzano.cotizapp2;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class contacto extends AppCompatActivity {

    SwipeRefreshLayout sfiMiIndicadorRefresh;
    ListView lstMiLista;
    Adapter adaptador; //Auxiliar par manejar nuestros datos string y pasarlos a lstMiLista


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        agregarFab();

        //Proceso para mi SwipeRefresh
        sfiMiIndicadorRefresh = (SwipeRefreshLayout) findViewById(R.id.sfiMiIndicadorRefresh); //No instanceamos el objeto ya que existe declarado ennuestro xml
        lstMiLista = (ListView) findViewById(R.id.lstMiLista);

        String[] ejecutivos = getResources().getStringArray(R.array.ejecutivos);
        lstMiLista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ejecutivos));

        sfiMiIndicadorRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refrescandoContenido();
            }
        });
    }
    public void refrescandoContenido(){

        String[] ejecutivos = getResources().getStringArray(R.array.ejecutivos);
        lstMiLista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ejecutivos));
        sfiMiIndicadorRefresh.setRefreshing(false);
    }

    public void agregarFab(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMifab);
        miFAB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Toast.makeText(getBaseContext(), getResources().getString(R.string.add_favorite), Toast.LENGTH_SHORT).show();
                Snackbar.make(v, getResources().getString(R.string.add_favorite), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.texto_accion), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("SNACKBAR", "Click en Snackbar");
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                        .show();
            }
        });
    }


    public void llamar (View v){}
}

