package at.tasbeha.lobsch;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import at.asy.campus02.tasbeha.R;

public class MarenuonhActivity extends AppCompatActivity {

    protected TextView tv_marenuonh_c;
    protected TextView tv_marenuonh_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marenuonh);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_marenuonh_c = (TextView) findViewById(R.id.tv_marenuonh_coptic);
        tv_marenuonh_g = (TextView) findViewById(R.id.tv_marenuonh_german);
        tv_marenuonh_c.setTypeface(type);
        tv_marenuonh_c.setLineSpacing(0, (float) 2.5);
        tv_marenuonh_g.setLineSpacing(0, (float) 1.1);
    }
}
