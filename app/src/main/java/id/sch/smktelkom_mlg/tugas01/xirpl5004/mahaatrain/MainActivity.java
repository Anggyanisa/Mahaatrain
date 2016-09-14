package id.sch.smktelkom_mlg.tugas01.xirpl5004.mahaatrain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText etdate;
    Spinner sberangkat;
    Spinner spinner2;
    Button bok;
    TextView tvhasil;
    TextView tvhasil2;
    CheckBox ind, west, kra, mid;
    RadioButton eco, ecopre, buss, first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnama = (EditText) findViewById(R.id.etnama);
        etdate = (EditText) findViewById(R.id.etdate);
        sberangkat = (Spinner) findViewById(R.id.sberangkat);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        ind = (CheckBox) findViewById(R.id.ind);
        west = (CheckBox) findViewById(R.id.west);
        kra = (CheckBox) findViewById(R.id.kra);
        mid = (CheckBox) findViewById(R.id.mid);
        eco = (RadioButton) findViewById(R.id.eco);
        ecopre = (RadioButton) findViewById(R.id.ecopre);
        buss = (RadioButton) findViewById(R.id.buss);
        first = (RadioButton) findViewById(R.id.first);
        bok = (Button) findViewById(R.id.bok);
        tvhasil = (TextView) findViewById(R.id.tvhasil1);
        tvhasil2 = (TextView) findViewById(R.id.tvhasil2);
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });

    }
}
