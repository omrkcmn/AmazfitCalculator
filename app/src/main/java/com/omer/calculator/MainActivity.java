package com.omer.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, btnBol, btopla, bcikar, bcarp, bsonuc, btnClear, btnDelete;
    private TextView txtSayi;
    boolean topla, bol, carp, cikar;
    int val1, val2;
    float fval1, fval2;

    private void init()
    {
        btnDelete = findViewById(R.id.btnDelete);
        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        btopla = findViewById(R.id.btnTopla);
        bcikar = findViewById(R.id.btnCikar);
        bsonuc = findViewById(R.id.btnSonuc);
        bcarp = findViewById(R.id.btnCarp);
        btnClear = findViewById(R.id.btnClear);
        btnBol = findViewById(R.id.btnBol);
        txtSayi = findViewById(R.id.txtSayi);


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSayi.getText().length() > 0)
                {
                    String textString = txtSayi.getText().toString();
                    txtSayi.setText(textString.substring(0, textString.length() - 1));
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(null);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSayi.setText(txtSayi.getText() + "9");
            }
        });

        btopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSayi.getText().length() > 0)
                {
                    val1 = Math.round(Float.parseFloat(txtSayi.getText().toString()));
                    topla = true;
                    txtSayi.setText(null);
                }

            }
        });

        bcikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSayi.getText().length() > 0)
                {
                    val1 = Math.round(Float.parseFloat(txtSayi.getText().toString()));
                    cikar = true;
                    txtSayi.setText(null);
                }
            }
        });



        bcarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSayi.getText().length() > 0)
                {
                    val1 = Math.round(Float.parseFloat(txtSayi.getText().toString()));
                    carp = true;
                    txtSayi.setText(null);
                }
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSayi.getText().length() > 0)
                {
                    fval1 = Float.parseFloat(txtSayi.getText().toString());
                    bol = true;
                    txtSayi.setText(null);
                }
            }
        });
        bsonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSayi.getText().length() > 0)
                {
                    if(bol != true)
                    {
                        val2 = Integer.parseInt(txtSayi.getText() + "");
                    }else
                    {
                        fval2 = Float.parseFloat(txtSayi.getText() + "");
                        if(fval1 == 0)
                        {
                            Toast.makeText(MainActivity.this, "Hata!", Toast.LENGTH_SHORT).show();
                            bol = false;
                        }else
                        {
                            txtSayi.setText(fval1 / fval2 + "");
                            bol = false;
                        }

                    }
                    if(topla == true){
                        txtSayi.setText(val1 + val2 + "");
                        topla = false;
                    }if(cikar == true){
                    txtSayi.setText(val1 - val2 + "");
                    cikar = false;
                }if(carp == true){
                    txtSayi.setText(val1 * val2 + "");
                    carp = false;
                }
                }else
                {}

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void onBackPressed()
    {
        MainActivity.this.finish();
    }
}