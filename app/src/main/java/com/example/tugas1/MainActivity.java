package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama, nim, prodi;
    Button kirim;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama=(EditText)findViewById(R.id.editNama);
        nim=(EditText)findViewById(R.id.editNim);
        prodi=(EditText)findViewById(R.id.editProdi);
        kirim=(Button)findViewById(R.id.kirim);
        view=(TextView)findViewById(R.id.textView);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nama.length() > 0 && nim.length() > 0 && prodi.length() > 0) {
                    Toast.makeText(getApplicationContext(), nama.getText().toString() + " - " + nim.getText().toString() + " - " +
                            prodi.getText().toString(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon isi semua field", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}