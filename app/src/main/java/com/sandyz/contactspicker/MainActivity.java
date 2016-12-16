package com.sandyz.contactspicker;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final int Pick_Contact = 1;

    Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.btn1);
        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn1) {

            Intent choose = new Intent(Intent.ACTION_PICK,Uri.parse("content://contacts"));
            choose.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);

            startActivityForResult(choose, Pick_Contact);









        }

    }
}
