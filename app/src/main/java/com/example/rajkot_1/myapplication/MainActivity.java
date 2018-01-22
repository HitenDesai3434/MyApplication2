package com.example.rajkot_1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_activate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("com.gears42.surelock.COMMUNICATOR");
                intent.putExtra("command","activate");

//                intent.putExtra("sender", context.getPackageName()); // optional

                intent.putExtra("activation_code","909686");
                intent.putExtra("password", "0000");
                sendBroadcast(intent);
            }
        });

        findViewById(R.id.btn_de_activate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("com.gears42.surelock.COMMUNICATOR");

                intent.putExtra("command","deactivate");

//                intent.putExtra("sender", context.getPackageName()); // optional

                intent.putExtra("password", "0000");

                sendBroadcast(intent);
            }
        });

        findViewById(R.id.btn_add_app).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("com.gears42.surelock.COMMUNICATOR");

                intent.putExtra("command","add_application");

                intent.putExtra("sender",MainActivity.this.getPackageName());

                intent.putExtra("password","0000");

                intent.putExtra("package_name","com.example.rajkot_1.myapplication");

//                intent.putExtra("label",applicationLabel); // optional

//                intent.putExtra("icon",applicationIcon); // optional

//                intent.putExtra("app_password",applicationPassword); // optional

//                intent.putExtra("hide_icon",True/False); // optional

//                intent.putExtra("launch_at_startup",True/False); // optional

//                intent.putExtra("restart_app_on_relaunch",True/False); // optional

//                intent.putExtra("clear_app_data",True/False); // optional

//                intent.putExtra("idle_timeout",value); // optional

                sendBroadcast(intent);
            }
        });

        findViewById(R.id.btn_remove_app).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("com.gears42.surelock.COMMUNICATOR");

                intent.putExtra("command","remove_application");

                intent.putExtra("sender",MainActivity.this.getPackageName());

                intent.putExtra("password","0000");

                intent.putExtra("package_name","com.example.rajkot_1.myapplication");

                sendBroadcast(intent);
            }
        });

        findViewById(R.id.btn_change_pass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent("com.gears42.surelock.COMMUNICATOR");

                intent.putExtra("command","change_password");

                intent.putExtra("sender", MainActivity.this.getPackageName()); // optional

                intent.putExtra("password", "0000");

                intent.putExtra("new_password", "1111");

                sendBroadcast(intent);
            }
        });
    }
}
