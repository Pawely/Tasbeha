package at.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class ZweiterHoosActivity extends AppCompatActivity {

    protected TextView tv_zweiterHoos_c;
    protected TextView tv_zweiterHoos_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zweiter_hoos);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_zweiterHoos_c = (TextView) findViewById(R.id.tv_zweiterHoos_coptic);
        tv_zweiterHoos_g = (TextView) findViewById(R.id.tv_zweiterHoos_german);
        tv_zweiterHoos_c.setTypeface(type);
        tv_zweiterHoos_c.setLineSpacing(0, (float) 2.5);
        tv_zweiterHoos_g.setLineSpacing(0, (float) 1.1);
    }
}
