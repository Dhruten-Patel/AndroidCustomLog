package myservice.dhrutenpatel.example.com.errorutils;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class openSimpleLibraryActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnExitLibrary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_simple_library_activity);
        initUi();
        btnOnClickListener();
        Toast.makeText(this, "This is the page of Library", Toast.LENGTH_SHORT).show();
    }

    private void btnOnClickListener() {
    btnExitLibrary.setOnClickListener(this);
    }

    private void initUi() {

        btnExitLibrary=findViewById(R.id.btn_close_library_activity);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_close_library_activity) {
            Toast.makeText(this, "Quiting Library activity ", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
