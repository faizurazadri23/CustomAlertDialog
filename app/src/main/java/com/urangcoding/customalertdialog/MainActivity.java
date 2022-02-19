package com.urangcoding.customalertdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btn_show;
    private ShowAlertDialog showAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn_show = findViewById(R.id.show_custom_alert_dialog);

       showAlertDialog = new ShowAlertDialog(MainActivity.this);

       btn_show.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               showAlertDialog.startLoadingDialog();
           }
       });
    }
}