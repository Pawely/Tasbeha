package at.tasbeha.lobsch;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class ChenushotActivity extends AppCompatActivity {

    protected TextView tv_chenushot_c;
    protected TextView tv_chenushot_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenushot);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_chenushot_c = (TextView) findViewById(R.id.tv_chenushot_coptic);
        tv_chenushot_g = (TextView) findViewById(R.id.tv_chenushot_german);
        tv_chenushot_c.setTypeface(type);
        tv_chenushot_c.setLineSpacing(0, (float) 2.5);
        tv_chenushot_g.setLineSpacing(0, (float) 1.1);
    }
}
