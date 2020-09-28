package ec.edu.tecnologicoloja.listapplication.adapter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite  extends SQLiteOpenHelper {
    private  static  final String BdNOMBRE="sqlite.bd";
    private  static final int VERSION_BD=1;
    private static final String TABLA_SQL="CREATE TABLE SQLITE(NOMBRE TEXT ,IMAGEN TEXT)";

    public SQLite(Context context){
        super(context, BdNOMBRE,null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_SQL);
        sqLiteDatabase.execSQL(TABLA_SQL);
    }
    public  void  agregar(String Nombre,String Imagen){
        SQLiteDatabase BD=getWritableDatabase();
        if (BD!=null){
            BD.execSQL("INSERT INTO SQL VALUES('"+Nombre+"','"+Imagen+"')");
            BD.close();
        }
    }

}
