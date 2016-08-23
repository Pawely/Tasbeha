package at.tasbeha.epsali;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class ErsteSonntagsEpsaliActivity extends AppCompatActivity {

    protected TextView tv_ersteSoEpsali_c;
    protected TextView tv_ersteSoEpsali_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erste_sonntags_psali);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_ersteSoEpsali_c = (TextView) findViewById(R.id.tv_ersteSoEpsali_coptic);
        tv_ersteSoEpsali_g = (TextView) findViewById(R.id.tv_ersteSoEpsali_german);
        tv_ersteSoEpsali_c.setTypeface(type);
        tv_ersteSoEpsali_c.setLineSpacing(0, (float) 2.5);
        tv_ersteSoEpsali_g.setLineSpacing(0, (float) 1.2);
    }
}
