package app.leakcanarydemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView textView = (TextView) findViewById(R.id.test_text_view);

        new TestDataModel((Context) this);
    }
}