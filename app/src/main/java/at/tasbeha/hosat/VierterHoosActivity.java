package at.tasbeha.hosat;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class VierterHoosActivity extends AppCompatActivity {

        protected TextView tv_vierterHoos_c;
        protected TextView tv_vierterHoos_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vierter_hoos);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_vierterHoos_c = (TextView) findViewById(R.id.tv_vierterHoos_coptic);
        tv_vierterHoos_g = (TextView) findViewById(R.id.tv_vierterHoos_german);
        tv_vierterHoos_c.setTypeface(type);
        tv_vierterHoos_c.setLineSpacing(0, (float) 2.5);
        tv_vierterHoos_g.setLineSpacing(0, (float) 1.2);
    }
}
