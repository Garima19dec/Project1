package com.example.barbozza.Buyers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.barbozza.R;

public class profstatic extends AppCompatActivity {

    private LinearLayout L1,L2,L3,L4;
    private ImageView I1,I2,I3,I4,I5,I6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profstatic);

        I1 = (ImageView)findViewById(R.id.img1);
        I2 = (ImageView)findViewById(R.id.img2);
        I3 = (ImageView)findViewById(R.id.img3);
        I4 = (ImageView)findViewById(R.id.img4);
        I5 = (ImageView)findViewById(R.id.img5);
        I6 = (ImageView)findViewById(R.id.img6);

        L1 = (LinearLayout) findViewById(R.id.hal1);
        L2 = (LinearLayout) findViewById(R.id.hal2);
        L3 = (LinearLayout) findViewById(R.id.hal3);
        L4 = (LinearLayout) findViewById(R.id.hal4);

    }
}
