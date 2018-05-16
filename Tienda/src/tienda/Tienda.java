package tienda;


public class Tienda {

  //1) Datos básicos (Atributos)
    private String nombre;
    private String direccion;
    private int ruc;

    
    
    
    
    
    //Getterss y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }
    
    
}
