package com.example.zak.twoactivites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.zak.twoactivites.extra.REPLY";
    private EditText reply;
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(msg);
        Log.d(LOG_TAG,"------");
        Log.d(LOG_TAG,"onCreate");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    public void returnReply(View view) {
        reply = findViewById(R.id.editText_Second);
        String rep = reply.getText().toString();
        Intent replyIntent = getIntent();
        replyIntent.putExtra(EXTRA_REPLY, rep);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second activity");
        finish();
    }
}
