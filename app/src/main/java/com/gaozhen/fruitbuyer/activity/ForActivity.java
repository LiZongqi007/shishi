package com.gaozhen.fruitbuyer.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;

public class ForActivity extends Activity {

    private TextView mMeili;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for);

        init();
    }

    private void init() {
        mMeili=(TextView)findViewById(R.id.meili);
    }
}
