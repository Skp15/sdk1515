package com.example.toastapplicatin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static java.sql.Types.TIME;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  onToast(View view){
      Toast toast=  Toast.makeText(this,"Toast Message",Toast.LENGTH_LONG);
        Button btn= new Button(this);
        btn.setText("YOUR STUDY TIME IS STARTED");
        btn.setTextColor(getResources().getColor(R.color.crimson));
        btn.setBackgroundColor(getResources().getColor(R.color.aquamarine));
        toast.setView(btn);
        toast.show();
    }
}
