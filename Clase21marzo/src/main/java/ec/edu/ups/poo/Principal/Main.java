package ec.edu.ups.poo.Principal;

import ec.edu.ups.poo.Clases.Familiar;
import ec.edu.ups.poo.Clases.Persona;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("comentario master");

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        GregorianCalendar nacimiento = new GregorianCalendar();

        System.out.println("Ingrese la cantidad de contactos que no son familiares que desea crear: ");
        int cantidad = scanner.nextInt();

        Persona[] personas = new Persona[cantidad];

        for(int i = 0; i < cantidad; i++){

            System.out.println("Ingrese los datos de la persona " + (i+1));
            personas[i] = main.solicitarDatos();
        }

        System.out.println("Ingrese la cantidad de contactos que son familiares que desea crear: ");
        int cantidad2 = scanner.nextInt();

        Familiar[] familiars = new Familiar[cantidad2];

        for(int i = 0; i < cantidad2; i++){

            System.out.println("Ingrese los datos de los famliares " + (i+1));
            personas[i] = main.solicitarDatos();
        }

        main.mostrarPersona(personas);

        Familiar familiar = new Familiar();
        familiar.setCedula("1720882685");
        familiar.setNombre("Familia Maria");
        familiar.setApellido("Familiar Encalada");
        familiar.setDireccion("Familiar Calle Manuel Vega");

        familiar.setParentesco("Prima");
        familiar.setTipoSangre("ARH+");
        nacimiento.set(2003,02,14);
        familiar.setFechaNacimiento(nacimiento);

    }

    public void mostrarPersona(Persona[] personas){

        for(int i = 0; i < personas.length; i++){
            System.out.println("Persona "+(i+1)+" : " + personas[i].getCedula() + " ; " +
                    personas[i].getNombre() + " ; " + personas[i].getApellido() + " ; " +
                    personas[i].getDireccion());
        }
    }

    public Persona solicitarDatos(){

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese la cedula: ");
        String cedula = scanner2.nextLine();
        System.out.println("Ingrese el nombre ");
        String nombre = scanner2.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner2.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = scanner2.nextLine();

        return new Persona(cedula, nombre, apellido, direccion);
    }

    public Persona solicitarDatosFamiliares(){

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese la cedula: ");
        String cedula = scanner2.nextLine();
        System.out.println("Ingrese el nombre ");
        String nombre = scanner2.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner2.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = scanner2.nextLine();

        return new Persona(cedula, nombre, apellido, direccion);
    }

}
