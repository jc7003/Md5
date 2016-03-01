package com.owen.md5test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText)findViewById(R.id.edit_text);
    }

    public void OnEnCode(View view){
        Md5Encode md5 = new Md5Encode();
        ((TextView)findViewById(R.id.textView)).setText(md5.encode(mEditText.getText().toString().trim()));
    }
}
