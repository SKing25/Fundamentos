package Biblioteca;

public class Editorial {
    private String codigo;
    private String nombre;
    private Pais pais;

    public Editorial(String codigo, String nombre, Pais pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
