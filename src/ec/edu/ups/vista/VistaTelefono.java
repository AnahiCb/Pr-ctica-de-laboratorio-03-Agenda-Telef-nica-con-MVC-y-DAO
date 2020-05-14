/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Anahi
 */
public class VistaTelefono {
    private Scanner leer;

    public VistaTelefono() {
        leer=new Scanner(System.in);
    }
    public Telefono registrarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese codigo ");
        int id=leer.nextInt();
        System.out.println("Ingrese numero");
        String numero=leer.next();
        System.out.println("Ingrese tipo:"+ "celular / convencional");
        String tipo=leer.next();
        System.out.println("Ingrese operadora");
        String operadora=leer.next();
        return  new Telefono (id,numero,tipo,operadora);
    
    }
    public Telefono actualizarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese codigo del telefono a actualizar ");
        int cod =leer.nextInt();
        System.out.println("Ingrese nuevo numero");
        String numero=leer.next();
        System.out.println("Ingrese nuevo tipo:"
                + "celular / convencional");
        String tipo=leer.next();
        System.out.println("Ingrese  nueva operadora");
        String operadora=leer.next();
        return  new Telefono (cod,numero,tipo,operadora);
    
    }
    public Telefono eliminarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese el id del telefono a eliminar");
        int cod = leer.nextInt();
        return new Telefono (cod,null,null,null);
    }
    public int buscarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese id del telefono");
          int cod = leer.nextInt();
        return cod;
    }
    public void verTelefono(Telefono telefono){
        System.out.println("Datos del telefono :"+telefono);
    
    }
    public void validarRegistro(Telefono telefono){
         
     if (telefono==null){
        
         System.out.println("No existe registro de telefono para este usuario");
     }
     
       
     }
    public void verTelefonos(List <Telefono> telefonos){
        for(Telefono telefono : telefonos) {
            System.out.println("Datos : " + telefono);
        }
        
    }
}
