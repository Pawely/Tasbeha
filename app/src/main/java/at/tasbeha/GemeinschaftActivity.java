package at.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class GemeinschaftActivity extends AppCompatActivity {

    protected TextView tv_gemeinschaft_c;
    protected TextView tv_gemeinschaft_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gemeinschaft);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_gemeinschaft_c = (TextView) findViewById(R.id.tv_gemeinschaft_coptic);
        tv_gemeinschaft_g = (TextView) findViewById(R.id.tv_gemeinschaft_german);
        tv_gemeinschaft_c.setTypeface(type);
        tv_gemeinschaft_c.setLineSpacing(0, (float) 2.5);
        tv_gemeinschaft_g.setLineSpacing(0, (float) 1.1);
    }
}
