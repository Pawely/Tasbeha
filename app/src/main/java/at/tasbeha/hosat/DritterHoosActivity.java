package at.tasbeha.hosat;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class DritterHoosActivity extends AppCompatActivity {

    protected TextView tv_dritterHoos_c;
    protected TextView tv_dritterHoos_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dritter_hoos);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_dritterHoos_c = (TextView) findViewById(R.id.tv_dritterHoos_coptic);
        tv_dritterHoos_g = (TextView) findViewById(R.id.tv_dritterHoos_german);
        tv_dritterHoos_c.setTypeface(type);
        tv_dritterHoos_c.setLineSpacing(0, (float) 2.5);
        tv_dritterHoos_g.setLineSpacing(0, (float) 1.1);
    }
}
