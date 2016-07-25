package at.asy.campus02.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TensinoActivity extends AppCompatActivity {

    protected TextView tv_tensino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tensino);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_tensino = (TextView) findViewById(R.id.tv_tensino_coptic);
        tv_tensino.setTypeface(type);
        tv_tensino.setLineSpacing(0,3);
    }
}
