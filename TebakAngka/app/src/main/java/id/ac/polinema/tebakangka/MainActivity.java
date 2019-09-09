package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

		private int angka;
		private EditText angkaInput;
		private Button guess;
		private Button reset;
		private int angkaTebakan;
		Random random = new Random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initRandomNumber();
		reset = findViewById(R.id.reset_button);
		reset.setEnabled(false);
	}

	private void initRandomNumber() {
		angka = random.nextInt(100) + 1;
	}

	public void handleGuess(View view) {
		angkaInput = findViewById(R.id.number_input);
		angkaTebakan = Integer.parseInt(String.valueOf(angkaInput.getText()));
		if (angkaTebakan == angka) {
			Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
			guess = findViewById(R.id.guess_button);
			guess.setEnabled(false);
			reset.setEnabled(true);
		} else if (angkaTebakan > angka) {
			Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
		} else if (angkaTebakan < angka) {
			Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
		}
	}


	public void handleReset(View view) {
		setContentView(R.layout.activity_main);
		initRandomNumber();
	}
}
