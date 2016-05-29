package co.edu.uniquindio.android.electiva.androidfinal.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by jazneidy on 28/05/2016.
 */
public class ConexionUtils {

    private static final String WIFI_TYPE_NAME = "wifi";
    private static final String MOBILE_TYPE_NAME = "mobile";

    /**
     * Metodo para saber si se tiene conexion a internet
     * por medio de datos o wifi
     * @param context
     * @return
     */
    public static boolean hasInternet(Context a) {
        boolean hasConnectedWifi = false;
        boolean hasConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) a.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase(WIFI_TYPE_NAME))
                if (ni.isConnected())
                    hasConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase(MOBILE_TYPE_NAME))
                if (ni.isConnected())
                    hasConnectedMobile = true;
        }
        return hasConnectedWifi || hasConnectedMobile;
    }
}
