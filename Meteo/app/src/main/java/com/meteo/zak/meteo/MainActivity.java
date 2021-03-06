package com.meteo.zak.meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int _count = 0;
    private TextView showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();

    }

    public void countUp(View view) {
        _count++;
        if (showCount != null)
            showCount.setText(Integer.toString(_count));
    }
}
