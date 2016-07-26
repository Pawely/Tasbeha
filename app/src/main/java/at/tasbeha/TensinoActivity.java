package at.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class TensinoActivity extends AppCompatActivity {

    protected TextView tv_tensino_c;
    protected TextView tv_tensino_g;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tensino);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_tensino_c = (TextView) findViewById(R.id.tv_tensino_coptic);
        tv_tensino_g = (TextView) findViewById(R.id.tv_tensino_german);
        tv_tensino_c.setTypeface(type);
        tv_tensino_c.setLineSpacing(0, (float) 2.5);
        tv_tensino_g.setLineSpacing(0, (float) 1.1);
    }
}
