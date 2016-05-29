package co.edu.uniquindio.android.electiva.androidfinal.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import co.edu.uniquindio.android.electiva.androidfinal.R;
import co.edu.uniquindio.android.electiva.androidfinal.utils.ConexionUtils;

/**
 * @author jazneidy
 * Esta es la actividad Conexion.
 * Se crearan los metodos principales de la Actividad.
 */
public class Conexion extends AppCompatActivity {

    /**
     * Metodo create
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion);

        ImageView imageReload = (ImageView) findViewById(R.id.imageReloadConnection);
        imageReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(ConexionUtils.hasInternet(Conexion.this)){
                 Intent i = new Intent(Conexion.this, Main.class);
                 Conexion.this.startActivity(i);
                 Conexion.this.finish();
             }
            }
        });
    }
}
