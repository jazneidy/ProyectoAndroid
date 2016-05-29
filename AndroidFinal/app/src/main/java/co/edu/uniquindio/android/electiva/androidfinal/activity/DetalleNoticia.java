package co.edu.uniquindio.android.electiva.androidfinal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.FacebookSdk;

import co.edu.uniquindio.android.electiva.androidfinal.R;

public class DetalleNoticia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_detalle_noticia);
    }
}
