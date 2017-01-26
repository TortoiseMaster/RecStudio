package jordibarea.recstudio;

/**
 * Created by TortoiseMaster on 26/01/2017.
 */

public class Controlador {

    private Usuario usuario;
    private int id = 0;

    public Controlador() {
    }

    public void añadirUsuario(String str) {
        usuario = new Usuario(str,id);
        id++;

    }

    public boolean usuarioPorCrear() {
        return usuario == null;
    }

    public void modificarUsuario(String str) {
        usuario.setNombreUsuario(str);

    }
}
