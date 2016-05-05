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

public class Main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    public void irANoticias(View v){
        Intent intent = new Intent(this, Noticias.class);
        startActivity(intent);
    }
    public void goToUrl(View v){
        Uri uri = Uri.parse("https://www.uniquindio.edu.co/");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public  void changeLanguageUS(View v){
        setLocale("en");
    }

    public  void changeLanguageES(View v){
        setLocale("es");
    }

    public void setLocale(String lang) {

        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
       if(!conf.locale.getLanguage().equals(lang)) {
           Locale myLocale = new Locale(lang);
           conf.locale = myLocale;
           res.updateConfiguration(conf, dm);
           Intent refresh = new Intent(this, Main.class);
           startActivity(refresh);
           finish();
       }

    }
}
