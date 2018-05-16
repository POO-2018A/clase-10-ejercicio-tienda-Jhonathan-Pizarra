package tienda;
import java.util.*;

public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        //**** Datos de la Tienda ****
        Tienda store = new Tienda();
        
        //Escribir el nombre de la tienda:
        String nombreTienda;
        System.out.print("¿Cómo se llama la Tienda?: ");
        nombreTienda = entrada.next();
        //Colocarle ese nombre a la tienda:
        store.setNombre(nombreTienda);
        
        //Escribir la dirección
        String direccionTienda;
        System.out.print("¿Cuál es la dirección?: ");
        direccionTienda = entrada.next();
        store.setDireccion(direccionTienda);
        
        //Escribir el Ruc
        int rucTienda;
        System.out.print("Ingrese el RUC: ");
        rucTienda = entrada.nextInt();
        store.setRuc(rucTienda);
        
        System.out.println("");
        
   
         boolean terminar = false;
        //Contador para saber el tamaño de mi arreglo y usarlo en los diferentes case
        int contador = 0;
         Productos product = new Productos();
       
        do{
        //****MENU DE OPCIONES ****
        System.out.println("### MENU DE OPCIONES ###");
        System.out.println("1) Ingresar un nuevo producto");
        System.out.println("2) Vizualizar lista de productos");
        System.out.println("3) Salir");
        System.out.print("Escoga una opcion: ");
        int opcion = 0;
        opcion = entrada.nextInt();
        System.out.println("");
        
           
        
        switch(opcion){
            case 1:
                //Ingresar un numevo producto
                    //**** Datos del Producto ****
            //Escribir el nombre de la marca del producto:
          
           String nombreMarca;
           System.out.print("Marca del producto: ");
           nombreMarca = entrada.next();
           //Colocarle esa marca al producto:
           product.setMarca(nombreMarca);

           //Escribir el tipo de producto
           //¿Cuántos porducots?
           System.out.print("¿Cuántos producots vas a registrar?: ");
           int numeroProductos = entrada.nextInt();
           String[] tipoProducto = new String[numeroProductos]; //Estoy diciendo que va a recibir n productos que el usuario ingrese
    
           for(int i=0; i<tipoProducto.length; i++){
           //Ingresamos un producto en cada item del arreglo 
               System.out.print("Ingrese el producto: ");
               tipoProducto[i]= entrada.next();
               product.setTipo(tipoProducto);
                    //Escribir el codigo del producto
               //Cada item tendrá su numero unico
             
              int codigoUnico;
              System.out.print("Código único: ");
              codigoUnico = entrada.nextInt();
              product.setCodigo(codigoUnico);//Aquí hay que hacer una validación*
              
              
                //Escribir el precio
              double precioProducto;
              System.out.print("¿Cuánto cuenta?: ");
              precioProducto = entrada.nextDouble();
              product.setPrecio(precioProducto);
              
               System.out.println("");
              contador++;
              
           }
       
            System.out.println("Prodcutors ingresados con éxito!...");
            System.out.println("");
            terminar = false;
    
        
                break;
                
            case 2:
                //Vizualizar productos ingresados
               
                
                if(contador == 0){
                    System.out.println("Parece que no ha ingresado ningún producto todavía...");
                    System.out.println("");
                }else{
                    System.out.println("LISTA DE PRODUCTOS: ");
                   
                for(int i=0; i<contador; i++){
                   
                    System.out.println("...Información del producto ("+(i+1)+") ...");
                    System.out.println("Marca: "+product.getMarca());
                    System.out.println("Código #: "+product.getCodigo());
                    System.out.println("Producto: "+product.getTipo()[i]);
                    System.out.println("Precio: $"+product.getPrecio());
                    
                    System.out.println("");
                    
                    }
                
                }
                
            terminar = false;
            
                break;
            
            case 3:
                //Salir
                System.out.println("FACTURA#");
                System.out.println("DATOS DE LA TIENDA: ");
                System.out.println("Nombre: "+store.getNombre());
                System.out.println("Dirección: "+store.getDireccion());
                System.out.println("RUC: "+store.getRuc());
                System.out.println("DATOS DEL PRODUCTO: ");
                if(contador ==0 ){
                    System.out.println("No hay productos registrados...");
                }else{
                System.out.println("Marca: "+product.getMarca());
                System.out.println("Código #: "+product.getCodigo());
                for(int i=0; i<contador; i++){
                System.out.println("Producto: "+product.getTipo()[i]);
                }
                System.out.println("Precio: $"+product.getPrecio());
                System.out.println("");
                System.out.println("Gracias por visitarnos! ");
                }
                
                
                
                
                
                
                terminar = true;
                break;
                
            default:
                //¿Desea volver a intentarlo? S o N
                
                System.out.println("Opción no válida...");
                System.out.print("¿Deseas volver a intentarlo?  Si -> [1]; No ->[0]: ");
                int oportunidadNueva = 0;
                oportunidadNueva = entrada.nextInt();
                if(oportunidadNueva == 1){
                terminar = false;
                }else if(oportunidadNueva == 0){
                terminar = true;
                }else{
                    System.out.println("Opción no valida...");
                    System.out.println("Vuelva a intentarlo");
                    System.out.println("");
                    terminar = false;
                }
                
                
                break;    
        }
        
        }while(terminar!=true);
        
        
    }
    
}
