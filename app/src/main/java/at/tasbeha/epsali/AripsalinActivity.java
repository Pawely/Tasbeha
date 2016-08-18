package at.tasbeha.epsali;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class AripsalinActivity extends AppCompatActivity {

    protected TextView tv_aripsalin_c;
    protected TextView tv_aripsalin_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aripsalin);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_aripsalin_c = (TextView) findViewById(R.id.tv_aripsalin_coptic);
        tv_aripsalin_g = (TextView) findViewById(R.id.tv_aripsalin_german);
        tv_aripsalin_c.setTypeface(type);
        tv_aripsalin_c.setLineSpacing(0, (float) 2.5);
        tv_aripsalin_g.setLineSpacing(0, (float) 1.1);
    }
}
