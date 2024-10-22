public class Titular {
    private int id;
    private String nombreApellido;
    private String correo;
    
    public Titular(int id, String nombreApellido, String correo) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Titular - ID: " + id + " - Nombre y apellido: " + nombreApellido + " - Correo: " + correo;
    }
}
