package juanpablomanzano.cotizapp2;

import android.content.Intent;
import android.nfc.Tag;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static android.util.Log.v;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "test";
    //Prueba



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Create");

    }

    public void iniciarCotizapp(View v){
        Intent intent = new Intent(getApplication(), MenuPrincipal.class);
        startActivity(intent);

    }


}
