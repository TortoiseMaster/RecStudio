package jordibarea.recstudio;

/**
 * Created by Usuario on 26/01/2017.
 */

public class Usuario {
    private String nombreUsuario;
    private int ID;

    public Usuario(String nombreUsuario, int ID) {
        this.ID = ID;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", ID=" + ID +
                '}';
    }
}
