package heme.mx.com.arrow.DataBase.Controler;

import android.provider.BaseColumns;

/**
 * Created by LuisFernando on 15/05/2017.
 */

public class Colums implements BaseColumns {
    private static final String CREATE="CREATE TABLE IF NOT EXISTS ";
    public static final String SEQ="seq";
    public static final String NAME="name";
    public static final String COLUMN_VERSION="version";

    /*TABLA CONTACTO*/
    public static final String TABLE_CONTACTO="contacto";
    public static final String COLUMN_USUARIO="usuario";
    public static final String COLUMN_TELEFONO="telefono";
    public static final String COLUMN_EMAIL="email";
    public static final String CREATE_INDEX_CONTACTO_ID=
            "CREATE INDEX index_"+
                    TABLE_CONTACTO+
                    "_id ON "+
                    TABLE_CONTACTO+
                    " (_id ASC);";
    public static final String CREATE_TABLE_CONTACTO=
            CREATE + TABLE_CONTACTO +
                    "(" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_USUARIO + " TEXT NOT NULL," +
                    COLUMN_TELEFONO + " TEXT NOT NULL UNIQUE," +
                    COLUMN_EMAIL + " TEXT NOT NULL UNIQUE)" ;
    /*TABLA CONTINGENTE*/
    public static final String TABLE_CONTINGENTE="contingente";
    public static final String COLUMN_UNIDAD_MEDIDA="unidad_medida";
    public static final String COLUMN_UNIDAD_MEDIDA_VALOR="unidad_medida_valor";
    public static final String COLUMN_NOMBRE="nombre";
    public static final String COLUMN_DESCRIPCION="descripcion";
    public static final String COLUMN_ACCIONES="acciones";
    public static final String CREATE_INDEX_CONTINGENTE_ID=
            "CREATE INDEX index_"+
                    TABLE_CONTINGENTE+
                    "_id ON "+
                    TABLE_CONTINGENTE+
                    " (_id ASC);";
    public static final String CREATE_TABLE_CONTINGENTE=
            CREATE + TABLE_CONTINGENTE +
                    "(" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_UNIDAD_MEDIDA + " TEXT NOT NULL," +
                    COLUMN_UNIDAD_MEDIDA_VALOR + " INTEGER NOT NULL," +
                    COLUMN_NOMBRE + " TEXT NOT NULL," +
                    COLUMN_DESCRIPCION + " TEXT NOT NULL," +
                    COLUMN_ACCIONES + " TEXT NOT NULL)" ;
    /*TABLA GRUPOS*/
    public static final String TABLE_GRUPOS="grupos";
    public static final String COLUMN_ID_SECCION="id_seccion";
    public static final String COLUMN_ID_CONTACTO="id_contacto";
    public static final String CREATE_INDEX_GRUPOS_ID=
            "CREATE INDEX index_"+
                    TABLE_GRUPOS+
                    "_id ON "+
                    TABLE_GRUPOS+
                    " (_id ASC);";
    public static final String CREATE_TABLE_GRUPOS=
            CREATE + TABLE_GRUPOS +
                    "(" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_ID_SECCION + " INTEGER NOT NULL," +
                    COLUMN_ID_CONTACTO + " INTEGER NOT NULL)" ;
    /*TABLA REGISTRO*/
    public static final String TABLE_REGISTRO="registro";
    public static final String COLUMN_ID_CONTINGENCIA="id_seccion";
    public static final String COLUMN_ID_GRUPOS="id_contacto";
    public static final String COLUMN_FECHA="fecha";
    public static final String COLUMN_INFORMADO="informado";
    public static final String CREATE_INDEX_REGISTRO_ID=
            "CREATE INDEX index_"+
                    TABLE_REGISTRO+
                    "_id ON "+
                    TABLE_REGISTRO+
                    " (_id ASC);";
    public static final String CREATE_TABLE_REGISTRO=
            CREATE + TABLE_REGISTRO +
                    "(" +
                    _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    COLUMN_ID_CONTINGENCIA + " INTEGER NOT NULL," +
                    COLUMN_ID_GRUPOS + " INTEGER NOT NULL," +
                    COLUMN_FECHA + " DATE NOT NULL," +
                    COLUMN_INFORMADO + " BOOLEAN NOT NULL)" ;

    /*TABLA SECCIONES*/
    public static final String TABLE_SECCIONES="secciones";
    public static final String CREATE_INDEX_SECCIONES_ID=
            "CREATE INDEX index_"+
                    TABLE_SECCIONES+
                    "_id ON "+
                    TABLE_SECCIONES+
                    " (_id ASC);";
    public static final String CREATE_TABLE_SECCIONES=
            CREATE + TABLE_SECCIONES +
                    "(" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_NOMBRE + " TEXT NOT NULL," +
                    COLUMN_DESCRIPCION + " BOOLEAN NOT NULL)" ;
}
