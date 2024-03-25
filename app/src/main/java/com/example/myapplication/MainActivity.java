package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private EditText pName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            eName=findViewById(R.id.ename);
            pName=findViewById(R.id.pname);

            return insets;
        });
    }


    public void btmsubmitonclick(View view) {
        if(eName.getText().toString().equals("ali@gmail.com")&&pName.getText().toString().equals("monmonmon3434"))
        Toast.makeText(this,"sucess loging in",Toast.LENGTH_SHORT).show();
        else{
            Toast.makeText(this,"Wrong password or email",Toast.LENGTH_SHORT).show();

        }
                    }
}