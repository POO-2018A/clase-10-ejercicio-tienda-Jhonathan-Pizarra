package tienda;

public class Productos {
    
    //1) Datos básicos (Atributos)
    private String marca;
    private int codigo; //El código debe ser único
    private String[] tipo;
    private double precio;
    
    
    //2) Metodos setter y getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
       
        this.codigo = codigo;
      
       
       
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    private boolean validarCodigo(int codigo){
    
        
        
        return false;
      
        
    }
    
    
    
    
}
