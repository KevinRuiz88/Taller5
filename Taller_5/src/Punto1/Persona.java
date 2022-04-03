
package Punto1;

public class Persona {
    public String person;
    public String nombre;
    public String apellido;
    public int dia;
    public int mes; 
    public int año;
    public int edad;
    public String direccion1;
    public String direccion2;
    
     public Persona(String person, String nombre, String apellido, int dia, int mes,int año, int edad, String direccion1, String direccion2){
        this.person = person;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.edad = edad;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        
     }
     
     public void MostData(){
        System.out.println(">>>>Datos Personales<<<<");
         System.out.println("Persona "+person);
        System.out.println("Nobre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Fecha de nacimiento: "+dia+"/"+mes+"/"+año);
        System.out.println("Tiene "+edad+" años");
        System.out.println("Direccion del dominicilio "+direccion1);
        System.out.println("Direccion del trabajo "+direccion2+"\n");
     }
}