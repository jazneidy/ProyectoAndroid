package co.edu.uniquindio.android.electiva.androidfinal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.edu.uniquindio.android.electiva.androidfinal.R;


/**
 * @author jazneidy
 * Clase activiad Sugerencias
 * se encontraran  los metodos principales de la actividad
 */
public class Sugerencias extends AppCompatActivity {

    /**
     * Metodo Create
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugerencias);
        getSupportActionBar().hide();
    }

    /**
     * Metodo irAAtras
     * metodo el cual permite regresar a la pagina principal
     * @param savedInstanceState
     */
    public void irAAtras(View v){
        super.onBackPressed();
    }
}
