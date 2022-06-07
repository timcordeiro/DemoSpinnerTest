package sg.edu.rp.c346.id21011275.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        tvDisplay = findViewById(R.id.textView);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                switch (position){
                    case 0:
                        tvDisplay.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        tvDisplay.setText("Spinner Item, No Selected");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}