package heme.mx.com.arrow.Variables;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import java.util.HashMap;
import java.util.List;

import heme.mx.com.arrow.DataBase.Catalogo.UsuariosDO;

/**
 * Created by LuisFernando on 13/07/2017.
 */

public class ArrowC {
    public static final String DATA_BASE_EXTENTION=".db";
    public static final String DATA_BASE_NAME="com.hackaton" + DATA_BASE_EXTENTION;
    public static final int DATA_BASE_VERSION = 1;
    public static final String DATA_BASE_SECURITY="¡AgagwrtPYiDUeyKEYDFppp35++7q%Ay6MhFokDhit¿vLQ?(abFYhHp";
    public static final String ExeptionResultSeverPass="error_clave_incorrecta";
    public static final String ExeptionResultSeverNick="error_usuario_no_existe";
    public static UsuariosDO user;
    public static final String URL_REGISTRO="https://192.168.43.89:8443/bingo/app/registro";
    public static final String ApiKey="ADFtyuo1-23uYIO9d-h0389lsajncmYIUbbYU-Xr4";
    public static final String ApiWeb="WEgijds823-0u23-dmcOPmsmOOoOldsdm-asdpopYt0";

    public static List<String> respuestas;
    public static HashMap<Integer, String> mapeo;

    public static void Mensage(String s, Context context){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
        builder1.setTitle("Aviso");
        builder1.setMessage(s);
        builder1.setCancelable(true);
        builder1.setPositiveButton(
                "Aceptar",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
