package co.edu.uniquindio.android.electiva.androidfinal.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.Locale;

import co.edu.uniquindio.android.electiva.androidfinal.R;
import co.edu.uniquindio.android.electiva.androidfinal.utils.ConexionUtils;

/**
 * Actividad principal
 * aca se encontran relacionadas todas las otras actividades.
 */
public class Main extends AppCompatActivity {


    /**
     * Metodo  create
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!ConexionUtils.hasInternet(this)){
            Intent i = new Intent(this, Conexion.class);
            startActivity(i);
            this.finish();
        }
        getSupportActionBar().hide();
    }

    @Override
    protected void onResume() {
        if(!ConexionUtils.hasInternet(this)){
            Intent i = new Intent(this, Conexion.class);
            startActivity(i);
            this.finish();
        }
        super.onResume();
    }

    /**
     * Metodo ir a Noticias
     * metodo que redirecciona al layout noticias desde el layaout Main.
     * @param v
     */

    public void irANoticias(View v){
        Intent intent = new Intent(this, Noticias.class);
        startActivity(intent);
    }

    /**
     * Metodo ir a Sugerencias
     * metodo que redirecciona al layout Sugerencias desde el layaout Main.
     * @param v
     */
    public void irASugerencias(View v) {
        Intent intent = new Intent(this, Sugerencias.class);
        startActivity(intent);
    }
    /**
     * Metodo goToUrl
     * metodo  el cual  redirecciona a la pagina de la universidad del quindio
     * @param v
     */

    public void goToUrl(View v){
        Uri uri = Uri.parse("https://www.uniquindio.edu.co/");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    /**
     * Metodo changeLanguageUS
     * metodo que se encarga de la traduccion a ingles
     * @param v
     */
    public  void changeLanguageUS(View v){
        setLocale("en");
    }
    /**
     * Metodo changeLanguageES
     * metodo que se encarga de la traduccion a español
     * @param v
     */
    public  void changeLanguageES(View v){
        setLocale("es");
    }

    /**
     * Metodo  setLocale
     * metodo principal que realiza la internacionalizacion  idioma español o ingles
     * @param v
     */

    public void setLocale(String lang) {

        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
       //if(!conf.locale.getLanguage().equals(lang)) {
           Locale myLocale = new Locale(lang);
           conf.locale = myLocale;
           res.updateConfiguration(conf, dm);
           Intent refresh = new Intent(this, Main.class);
           startActivity(refresh);
           finish();
       //}

    }
}
