package at.tasbeha.epsali;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class ZweiteSonntagsEpsaliActivity extends AppCompatActivity {

    protected TextView tv_zweiteSoEpsali_c;
    protected TextView tv_zweiteSoEpsali_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zweite_sonntags_epsali);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_zweiteSoEpsali_c = (TextView) findViewById(R.id.tv_zweiteSoEpsali_coptic);
        tv_zweiteSoEpsali_g = (TextView) findViewById(R.id.tv_zweiteSoEpsali_german);
        tv_zweiteSoEpsali_c.setTypeface(type);
        tv_zweiteSoEpsali_c.setLineSpacing(0, (float) 2.5);
        tv_zweiteSoEpsali_g.setLineSpacing(0, (float) 1.2);
    }
}
