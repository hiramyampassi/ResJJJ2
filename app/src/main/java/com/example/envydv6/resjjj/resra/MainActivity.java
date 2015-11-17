package com.example.envydv6.resjjj.resra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wikitude.architect.ArchitectView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private Button puntoInteres;
    private TextView logcat;

    private Button imagenOtro;

    public static final String EXTRAS_KEY_ACTIVITY_ARCHITECT_WORLD_URL = "activityArchitectWorldUrl";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // ensure to clean cache when it is no longer required
        MainActivity.deleteDirectoryContent(ArchitectView.getCacheDirectoryAbsoluteFilePath(this));

        puntoInteres = (Button) findViewById(R.id.btnPuntoInteres);
        logcat = (TextView) findViewById(R.id.tvLogcat);

        //IMAGEN TARJET
        imagenOtro = (Button) findViewById(R.id.btnImagen);

        puntoInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i=new Intent(v.getContext(), ActivityRA.class);
                i.putExtra(EXTRAS_KEY_ACTIVITY_ARCHITECT_WORLD_URL, "samples" + File.separator + "4_Point$Of$Interest_1_Poi$At$Location" + File.separator + "index.html");
                startActivity(i);
            }
        });

        //IMAGEN TARJET
        imagenOtro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ActivityRA.class);
                i.putExtra(EXTRAS_KEY_ACTIVITY_ARCHITECT_WORLD_URL, "samples" + File.separator + "1_Client$Recognition_1_Image$On$Target" + File.separator + "index.html");
                startActivity(i);
            }
        });
    }


    private static void deleteDirectoryContent(final String path) {
        try {
            final File dir = new File (path);
            if (dir.exists() && dir.isDirectory()) {
                final String[] children = dir.list();
                for (int i = 0; i < children.length; i++) {
                    new File(dir, children[i]).delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


