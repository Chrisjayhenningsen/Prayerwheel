package net.newworldenterprises.prayerwheel;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void sendprayers(View view){
        EditText prayinput;
        prayinput = (EditText)findViewById(R.id.editPrayer);
        String userprayer = prayinput.getText().toString();
        //String prayer = findViewById(R.id.editPrayer).toString();

        EditText cypherInput;
        cypherInput = (EditText)findViewById(R.id.editrepetions);
        int praynum = Integer.parseInt(cypherInput.getText().toString());

        int i = 0;
        TextView show_prayer =(TextView) findViewById(R.id.prayerreturn);

        while (i<praynum){
            show_prayer.setText(userprayer.toString());
            i=i+1;
        };


    }


}
