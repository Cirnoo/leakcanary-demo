package app.leakcanarydemo;

import android.content.Context;
import android.widget.TextView;

public class TestDataModel {

    private static TestDataModel sInstance;
    private TextView mRetainedTextView;

    private static Context sContext;
    public static TestDataModel getInstance() {
        if (sInstance == null) {
            sInstance = new TestDataModel();
        }
        return sInstance;
    }

    TestDataModel(){
    }

    TestDataModel(Context context){
        sContext = context;
    }
    public void setRetainedTextView(TextView textView) {
        mRetainedTextView = textView;
    }
}