package com.example.gl552vw.syarah_1202150249_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class TakeAwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        Toast.makeText(this,"Take Away", Toast.LENGTH_LONG).show();
    }

    public void btn_menuTake(View view) {
        Intent intent = new Intent(this,Menu1Activity.class);
        startActivity(intent);
    }
}
