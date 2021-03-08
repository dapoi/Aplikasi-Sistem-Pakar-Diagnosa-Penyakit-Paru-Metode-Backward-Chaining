package com.daffacorps.yourhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvGetNamaPenyakit, tvshowNamaPenyakit;
    Button btnHasil;
    CheckBox cekDemam, cekBatuk, cekHidungTersumbat, cekHidungMeler, cekTenggorokanSakit,
            cekTengggorokanTidakNyaman, cekBersin, cekPernapasanTakNormal, cekMuntah, cekDiare,
            cekTubuhLemas, cekDahak, cekOtot, cekSinar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvGetNamaPenyakit           = (TextView) findViewById(R.id.textView2);
        tvshowNamaPenyakit          = (TextView) findViewById(R.id.textView4);
        btnHasil                    = (Button)   findViewById(R.id.btnHasil);
        cekDemam                    = (CheckBox) findViewById(R.id.checkBox1);
        cekBatuk                    = (CheckBox) findViewById(R.id.checkBox2);
        cekHidungTersumbat          = (CheckBox) findViewById(R.id.checkBox3);
        cekHidungMeler              = (CheckBox) findViewById(R.id.checkBox4);
        cekTenggorokanSakit         = (CheckBox) findViewById(R.id.checkBox5);
        cekTengggorokanTidakNyaman  = (CheckBox) findViewById(R.id.checkBox6);
        cekBersin                   = (CheckBox) findViewById(R.id.checkBox7);
        cekPernapasanTakNormal      = (CheckBox) findViewById(R.id.checkBox8);
        cekMuntah                   = (CheckBox) findViewById(R.id.checkBox9);
        cekDiare                    = (CheckBox) findViewById(R.id.checkBox10);
        cekTubuhLemas               = (CheckBox) findViewById(R.id.checkBox11);
        cekDahak                    = (CheckBox) findViewById(R.id.checkBox12);
        cekOtot                     = (CheckBox) findViewById(R.id.checkBox13);
        cekSinar                    = (CheckBox) findViewById(R.id.checkBox14);
        Intent intent = getIntent();
        String kalimat = intent.getStringExtra(MainActivity.Kirim_Nama);

        tvGetNamaPenyakit.setText(kalimat);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NamaPenyakitDiderita = "Penyakit yang Kemungkinan Anda Derita :";

                if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekPernapasanTakNormal.isChecked() && cekDahak.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekPernapasanTakNormal.isChecked() && cekTubuhLemas.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekPernapasanTakNormal.isChecked() && cekSinar.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekTubuhLemas.isChecked() && cekDahak.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekSinar.isChecked() && cekDahak.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekPernapasanTakNormal.isChecked() &&
                        cekDahak.isChecked() && cekTubuhLemas.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekPernapasanTakNormal.isChecked() &&
                        cekDahak.isChecked() && cekSinar.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekBatuk.isChecked() && cekPernapasanTakNormal.isChecked() &&
                        cekDahak.isChecked() && cekTubuhLemas.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekBatuk.isChecked() && cekPernapasanTakNormal.isChecked() &&
                        cekDahak.isChecked() && cekSinar.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekMuntah.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekDiare.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekOtot.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekMuntah.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekDiare.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekOtot.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekMuntah.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekDiare.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekOtot.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDemam.isChecked() && cekSinar.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekMuntah.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekDiare.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekOtot.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekSinar.isChecked() && cekBatuk.isChecked() &&
                        cekHidungMeler.isChecked() && cekBersin.isChecked()){
                    NamaPenyakitDiderita += "\n Influenza";
                }

                else if (cekBatuk.isChecked() && cekHidungTersumbat.isChecked() &&
                        cekBersin.isChecked() && cekTenggorokanSakit.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekBatuk.isChecked() && cekHidungTersumbat.isChecked() &&
                        cekBersin.isChecked() && cekTengggorokanTidakNyaman.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekBatuk.isChecked() && cekHidungTersumbat.isChecked() &&
                        cekTengggorokanTidakNyaman.isChecked() && cekTenggorokanSakit.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekBatuk.isChecked() && cekTengggorokanTidakNyaman.isChecked() &&
                        cekBersin.isChecked() && cekTenggorokanSakit.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekTengggorokanTidakNyaman.isChecked() && cekHidungTersumbat.isChecked() &&
                        cekBersin.isChecked() && cekTenggorokanSakit.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekDemam.isChecked() && cekBatuk.isChecked() &&
                        cekHidungTersumbat.isChecked() && cekHidungMeler.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else if (cekTenggorokanSakit.isChecked() && cekBatuk.isChecked() &&
                        cekHidungTersumbat.isChecked() && cekHidungMeler.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekTenggorokanSakit.isChecked() && cekTengggorokanTidakNyaman.isChecked()
                        &&
                        cekHidungTersumbat.isChecked() && cekHidungMeler.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekTenggorokanSakit.isChecked() && cekTengggorokanTidakNyaman.isChecked()
                        &&
                        cekBersin.isChecked() && cekHidungMeler.isChecked()){
                    NamaPenyakitDiderita += "\n Flu Ringan";
                }

                else if (cekTenggorokanSakit.isChecked() && cekTengggorokanTidakNyaman.isChecked()
                        &&
                        cekBersin.isChecked() && cekPernapasanTakNormal.isChecked()){
                    NamaPenyakitDiderita += "\n Covid 19 atau Flu Ringan";
                }

                else if (cekMuntah.isChecked() && cekTengggorokanTidakNyaman.isChecked()
                        &&
                        cekBersin.isChecked() && cekPernapasanTakNormal.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else if (cekMuntah.isChecked() && cekDiare.isChecked()
                        &&
                        cekBersin.isChecked() && cekPernapasanTakNormal.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else if (cekMuntah.isChecked() && cekDiare.isChecked()
                        &&
                        cekTubuhLemas.isChecked() && cekPernapasanTakNormal.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else if (cekMuntah.isChecked() && cekDiare.isChecked()
                        &&
                        cekTubuhLemas.isChecked() && cekDahak.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else if (cekOtot.isChecked() && cekDiare.isChecked()
                        &&
                        cekTubuhLemas.isChecked() && cekDahak.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else if (cekOtot.isChecked() && cekSinar.isChecked()
                        &&
                        cekTubuhLemas.isChecked() && cekDahak.isChecked()){
                    NamaPenyakitDiderita += "\n Covid-19 atau Influenza";
                }

                else {
                    NamaPenyakitDiderita += "\n Penyakit Anda Di Luar Penyakit Paru-paru";
                }

                tvshowNamaPenyakit.setText(""+NamaPenyakitDiderita);
            }
        });

    }
}