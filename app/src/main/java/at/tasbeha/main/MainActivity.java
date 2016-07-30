package at.tasbeha.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Locale;

import at.tasbeha.hosat.ZweiterHoosActivity;
import at.tasbeha.lobsch.ChenushotActivity;
import at.tasbeha.hosat.ErsterHoosActivity;
import at.asy.campus02.tasbeha.R;
import at.tasbeha.TennafActivity;
import at.tasbeha.TensinoActivity;
import at.tasbeha.lobsch.MarenuonhActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    protected Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        Configuration config = getBaseContext().getResources().getConfiguration();

        String lang = settings.getString("LANG", "");
        if (! "".equals(lang) && ! config.locale.getLanguage().equals(lang)) {
            locale = new Locale(lang);
            Locale.setDefault(locale);
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        }

    }

    //OnClick Eventhandlers

    public void mitternachtslobgesang(View view) {
        //validate input
        Intent mitternachtslobgesang = new Intent(this, TensinoActivity.class);
        startActivity(mitternachtslobgesang);
    }

    public void auferstehungshymnus(View view) {
        //validate input
        Intent auferstehungshymnus = new Intent(this, TennafActivity.class);
        startActivity(auferstehungshymnus);
    }

    public void ersterHoos(View view) {
        //validate input
        Intent ersterHoos = new Intent(this, ErsterHoosActivity.class);
        startActivity(ersterHoos);
    }

    public void chenushot(View view) {
        //validate input
        Intent chenushot = new Intent(this, ChenushotActivity.class);
        startActivity(chenushot);
    }

    public void zweiterHoos(View view) {
        //validate input
        Intent zweiterHoos = new Intent(this, ZweiterHoosActivity.class);
        startActivity(zweiterHoos);
    }

    public void marenuonh(View view) {
        //validate input
        Intent marenuonh = new Intent(this, MarenuonhActivity.class);
        startActivity(marenuonh);
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
        /*if (id == R.id.action_settings) {
            Intent settings = new Intent(this, EinstellungenActivity.class);
            startActivity(settings);
            return true;
        }*/

        switch (id) {
            case R.id.action_change_language:
                showChangeLangDialog();
                return true;

            /*case R.id.action_change_textSize:
                showChangeTextSizeDialog();
                return true;

            case R.id.action_settings:
                Intent settings = new Intent(this, EinstellungenActivity.class);
                startActivity(settings);
                return true;*/

            default:
                return super.onOptionsItemSelected(item);
        }
        //return true;
    }

    public void showChangeLangDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.language_dialog, null);
        dialogBuilder.setView(dialogView);

        final Spinner spinner1 = (Spinner) dialogView.findViewById(R.id.spinner1);

        dialogBuilder.setTitle(getResources().getString(R.string.lang_dialog_title));
        dialogBuilder.setMessage(getResources().getString(R.string.lang_dialog_message));
        dialogBuilder.setPositiveButton(R.string.btn_change, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                int langpos = spinner1.getSelectedItemPosition();
                switch (langpos) {
                    case 0: //German
                        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("LANG", "de").commit();
                        setLangRecreate("de");
                        return;
                    case 1: //Arabic
                        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("LANG", "ar").commit();
                        setLangRecreate("ar");
                        return;
                    default: //By default set to german
                        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("LANG", "de").commit();
                        setLangRecreate("de");
                }
            }
        });
        dialogBuilder.setNegativeButton(R.string.btn_cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }

    public void setLangRecreate(String langval) {
        Configuration config = getBaseContext().getResources().getConfiguration();
        locale = new Locale(langval);
        Locale.setDefault(locale);
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }

    /*private void showChangeTextSizeDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.textsize_dialog, null);
        dialogBuilder.setView(dialogView);

        final Spinner spinner2 = (Spinner) dialogView.findViewById(R.id.spinner2);

        dialogBuilder.setTitle(getResources().getString(R.string.tSize_dialog_title));
        dialogBuilder.setMessage(getResources().getString(R.string.tSize_dialog_message));
        dialogBuilder.setPositiveButton(R.string.btn_change, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                int tSizepos = spinner2.getSelectedItemPosition();
                tv = (TextView) findViewById(R.id.tv_tensino_german);
                switch(tSizepos) {
                    case 0:
                        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.fontSizeSmall));
                        return;
                    case 1:
                        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.fontSizeMedium));
                        return;
                    case 3:
                        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.fontSizeLarge));
                        return;
                    default:
                        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.fontSizeMedium));
                }
            }
        });
        dialogBuilder.setNegativeButton(R.string.btn_cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }*/

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://at.asy.campus02.tasbeha/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://at.asy.campus02.tasbeha/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
