
package logica;

public class ControlDeUsuario {
    
    private String Usuario;
    private int Contraseña;
    
    //Constructor Default

    public ControlDeUsuario() {
    }
    //Constructor Parametros

    public ControlDeUsuario(String Usuario, int Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    //Setter and Getter

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    // To String

    @Override
    public String toString() {
        return "ControlDeUsuario{" + "Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
    
}
