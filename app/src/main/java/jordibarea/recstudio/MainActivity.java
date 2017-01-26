package jordibarea.recstudio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    private EditText texto;
    private Button boton;
    private Controlador con = new Controlador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (con.usuarioPorCrear()){
            setContentView(R.layout.activity_main);
            inicializaActivityMain();
        }
        else{
            setContentView(R.layout.menu_principal);
            inicializaMenuPrincipal();
        }
    }

    private void inicializaActivityMain() {
        texto = (EditText) findViewById(R.id.textoNombreUsuario);
        boton = (Button) findViewById(R.id.botonAceptarNombre);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = texto.getText().toString();
                if (!str.equals("")){
                    con.añadirUsuario(str);
                    setContentView(R.layout.menu_principal);
                    inicializaMenuPrincipal();
                }
            }
        });
    }

    private void inicializaMenuPrincipal() {
        boton = (Button) findViewById(R.id.botonSeries);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //funcionalidad botonSeries
            }
        });

        boton = (Button) findViewById(R.id.botonPeliculas);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //funcionalidad botonPeliculas
            }
        });

        boton = (Button) findViewById(R.id.botonAmigos);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //funcionalidad botonAmigos
            }
        });

        boton = (Button) findViewById(R.id.botonCambiarNombre);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.menu_cambiar);
                inicializaMenuCambiar();
            }
        });

        boton = (Button) findViewById(R.id.botonContactarAdmin);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //funcionalidad botonContactarAdmin
            }
        });
    }
    private void inicializaMenuCambiar() {

        texto = (EditText) findViewById(R.id.textoCambio);

        boton = (Button) findViewById(R.id.botonAceptarCambio);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = texto.getText().toString();

                if (!str.equals("")){
                    con.modificarUsuario(str);
                    setContentView(R.layout.menu_principal);
                    inicializaMenuPrincipal();
                }
            }
        });

        boton = (Button) findViewById(R.id.botonCancelarCambio);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.menu_principal);
                inicializaMenuPrincipal();
            }
        });
    }
}