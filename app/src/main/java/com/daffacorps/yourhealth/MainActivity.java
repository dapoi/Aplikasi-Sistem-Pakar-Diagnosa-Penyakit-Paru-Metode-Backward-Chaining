package com.daffacorps.yourhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView edtNamaPenyakit;
    Button btnIdentifikasi;
    String kalimat;

    public static final String Kirim_Nama = " ";

    String[]
    namaPenyakit = {"Covid-19", "Influenza", "Flu Ringan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNamaPenyakit = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        btnIdentifikasi = (Button) findViewById(R.id.button);

        final ArrayAdapter<String> adapternamapenyakit = new ArrayAdapter<String>(this,
                android.R.layout.select_dialog_item, namaPenyakit);
        edtNamaPenyakit.setThreshold(1);
        edtNamaPenyakit.setAdapter(adapternamapenyakit);

        edtNamaPenyakit.setText("");

        edtNamaPenyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setTitle("Nama Penyakit : ").
                        setAdapter(adapternamapenyakit, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                edtNamaPenyakit.setText(namaPenyakit[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });
        btnIdentifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kalimat = edtNamaPenyakit.getText().toString();

                if(kalimat.equals("") || kalimat == null){
                    showToastMessage("Nama penyakit belum anda masukkan");
                    edtNamaPenyakit.requestFocus();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra(Kirim_Nama, kalimat);
                    startActivity(intent);
                }
            }
        });
    }
    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}