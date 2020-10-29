package es.studium.tema02ejercicio06;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaCodec;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBoton;
    EditText texto;
    Pattern pattern= Pattern.matches();
    Matcher matcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoton = findViewById(R.id.boton);
        btnBoton.setOnClickListener(this);
        texto = findViewById(R.id.txtDireccion);
        texto.setOnClickListener(this);
    }
    public void onClick(View v) {
     if (texto.length() == 0) {
        Toast.makeText(MainActivity.this, R.string.MensajeError, Toast.LENGTH_SHORT).show();
    } else {
    matcher= pattern.matcher(texto.getText());
        if (matcher.matches()) {
            Toast.makeText(MainActivity.this, texto.getText(), Toast.LENGTH_SHORT).show();
            texto.setText("");
        } else {
            Toast.makeText(getApplicationContext(), R.string.validacionEmail, Toast.LENGTH_SHORT).show();
        }

    }
}
}