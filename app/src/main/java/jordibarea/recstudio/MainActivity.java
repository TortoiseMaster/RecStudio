package jordibarea.recstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.botonAceptarNombre);
        EditText textnom =  (EditText) findViewById(R.id.textoNombreUsuario);
        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (textnom.)
            }
        });
    }
}