package matt.fuelconsumption;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Matt on 7/5/13.
 */
public class dbHelper extends SQLiteOpenHelper {

    static final String dbName="FuelConsumption";
    static final String consumptionTable="Consumption";
    static final String colID="ID";
    static final String colKm="Kilometers";
    static final String colL="Litres";
    static final String colKmL="KilometersPerLitre";
    static final String colLkm="LitresPer100Kilometers";
    static final String colDate = "DateAdded";

    public dbHelper(Context context){
        super(context,dbName,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create all the tables that will be needed
        db.execSQL("CREATE TABLE " + consumptionTable + " (" + colID + " INTEGER PRIMARY KEY , " + colKm + "INTEGER NOT NULL , " + colL + " INTEGER NOT NULL , " +
                colKmL + " INTEGER , " + colLkm + " INTEGER , " + colDate + " DATETIME NOT NULL " + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //reverse of the table create
        db.execSQL("DROP TABLE IF EXISTS " + consumptionTable);
    }
}
