package matt.fuelconsumption;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(View view)
    {
        EditText lites = (EditText) findViewById(R.id.liters);
        EditText kilomters = (EditText) findViewById(R.id.kilomtres);

        double lkm = Double.parseDouble(lites.getText().toString()) / Double.parseDouble(kilomters.getText().toString()) * 100;

        double kml = Double.parseDouble(kilomters.getText().toString()) / Double.parseDouble(lites.getText().toString());

        TextView txtkml = (TextView) findViewById(R.id.txtkml);
        TextView txtlkm = (TextView) findViewById(R.id.txtlkm);

        TextView Ekml = (TextView) findViewById(R.id.kml);
        TextView Elkm = (TextView) findViewById(R.id.lkm);

        Ekml.setText(Double.toString(kml));
        Elkm.setText(Double.toString(lkm));

        txtkml.setVisibility(View.VISIBLE);
        txtlkm.setVisibility(View.VISIBLE);
        Ekml.setVisibility(View.VISIBLE);
        Elkm.setVisibility(View.VISIBLE);

        //store the data in a db which need to be made
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
