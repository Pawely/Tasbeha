package at.asy.campus02.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ErsterHoosActivity extends AppCompatActivity {

    protected TextView tv_ersterHoos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erster_hoos);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_ersterHoos = (TextView) findViewById(R.id.tv_ersterHoos_coptic);
        tv_ersterHoos.setTypeface(type);
        tv_ersterHoos.setLineSpacing(0, 3);
    }
}
