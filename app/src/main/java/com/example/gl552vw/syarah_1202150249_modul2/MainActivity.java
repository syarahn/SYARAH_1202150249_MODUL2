package com.example.gl552vw.syarah_1202150249_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton DineIn, TakeAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DineIn = findViewById(R.id.RadioDine);
        TakeAway = findViewById(R.id.RadioTake);

        Toast.makeText(this, "SYARAH_1202150249", Toast.LENGTH_LONG).show();
    }

    public void btn_pesan(View view) {
        if (DineIn.isChecked()){
            Intent intent = new Intent(this, DineInActivity.class);
            startActivity(intent);
        }else if (TakeAway.isChecked()){
            Intent intent = new Intent(this, TakeAwayActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Silahkan pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }

    }
}
