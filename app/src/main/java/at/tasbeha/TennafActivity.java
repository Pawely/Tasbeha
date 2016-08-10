package at.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class TennafActivity extends AppCompatActivity {

    protected TextView tv_tennaf_c;
    protected TextView tv_tennaf_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennaf);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_tennaf_c = (TextView) findViewById(R.id.tv_tennaf_coptic);
        tv_tennaf_g = (TextView) findViewById(R.id.tv_tennaf_german);
        tv_tennaf_c.setTypeface(type);
        tv_tennaf_c.setLineSpacing(0, (float) 2.5);
        tv_tennaf_g.setLineSpacing(0, (float) 1.1);
    }
}
