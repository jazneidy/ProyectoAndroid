package co.edu.uniquindio.android.electiva.androidfinal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.edu.uniquindio.android.electiva.androidfinal.R;

/**
 * @author jazneidy
 *
 */
public class Noticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);
        getSupportActionBar().hide();
    }

    public void irAAtras(View v){
        super.onBackPressed();
    }
}
