package id.ac.polinema.androidlifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity {
    private EditText nameInput;
    private TextView outputText;
    public void handleSubmit(View view) {
        String name = nameInput.getText().toString();
        outputText.setText("Hello " + name);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        nameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);
    }
}
