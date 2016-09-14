package id.sch.smktelkom_mlg.tugas01.xirpl5004.mahaatrain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText etdate;
    Spinner sberangkat;
    Spinner stujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
