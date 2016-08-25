package at.tasbeha.theotokiat;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class EinleitungTheotokiaActivity extends AppCompatActivity {

    protected TextView tv_einleitungTheotokia_c;
    protected TextView tv_einleitungTheotokia_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einleitung_theotokia);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_einleitungTheotokia_c = (TextView) findViewById(R.id.tv_einleitungTheotokia_coptic);
        tv_einleitungTheotokia_g = (TextView) findViewById(R.id.tv_einleitungTheotokia_german);
        tv_einleitungTheotokia_c.setTypeface(type);
        tv_einleitungTheotokia_c.setLineSpacing(0, (float) 2.5);
        tv_einleitungTheotokia_g.setLineSpacing(0, (float) 1.2);
    }
}
