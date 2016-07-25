package at.asy.campus02.tasbeha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChenushotActivity extends AppCompatActivity {

    protected TextView tv_chenushot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenushot);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/CS_Avva_Shenouda.ttf");
        tv_chenushot = (TextView) findViewById(R.id.tv_chenushot_coptic);
        tv_chenushot.setTypeface(type);
        tv_chenushot.setLineSpacing(0, 3);
    }
}
