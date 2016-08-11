package at.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class ErsterHoosActivity extends AppCompatActivity {

    protected TextView tv_ersterHoos_c;
    protected TextView tv_ersterHoos_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erster_hoos);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_ersterHoos_c = (TextView) findViewById(R.id.tv_ersterHoos_coptic);
        tv_ersterHoos_g = (TextView) findViewById(R.id.tv_ersterHoos_german);
        tv_ersterHoos_c.setTypeface(type);
        tv_ersterHoos_c.setLineSpacing(0, (float) 2.5);
        tv_ersterHoos_g.setLineSpacing(0, (float) 1.1);
    }
}
