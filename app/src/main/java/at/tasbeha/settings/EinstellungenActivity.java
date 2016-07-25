package at.tasbeha.settings;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import at.asy.campus02.tasbeha.R;

public class EinstellungenActivity extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einstellungen);
    }
}
