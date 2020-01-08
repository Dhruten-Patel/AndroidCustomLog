package myservice.dhrutenpatel.example.com.errorutils;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OpenNewToasTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_new_toas_t);
        Toast.makeText(this, "Hey there", Toast.LENGTH_SHORT).show();
    }
}
