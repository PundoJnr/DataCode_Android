package com.example.poline.data_code;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Barcode extends AppCompatActivity {
    private static final int RESULT_LOAD_IMAGE = 1;
    private static final int MY_PERMISSION_STORAGE = 1;

    TextView textView;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
    }
}
