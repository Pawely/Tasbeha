package at.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class TenuehEnthokActivity extends AppCompatActivity {

    protected TextView tv_tenuehEnthok_c;
    protected TextView tv_tenuehEnthok_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenueh_enthok);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_tenuehEnthok_c = (TextView) findViewById(R.id.tv_tenuehEnthok_coptic);
        tv_tenuehEnthok_g = (TextView) findViewById(R.id.tv_tenuehEnthok_german);
        tv_tenuehEnthok_c.setTypeface(type);
        tv_tenuehEnthok_c.setLineSpacing(0, (float) 2.5);
        tv_tenuehEnthok_g.setLineSpacing(0, (float) 1.1);
    }
}
