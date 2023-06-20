import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner( System.in);

        List< Asistente > asistentes = new ArrayList<Asistente>();

        //Cliente
        String rut;
        String nombre_cliente;
        String direccion;
        String comuna;
        int telefono;

        // Capacitación
        String dia , hora , lugar , duracion ;
        int cant_asistentes;

        //Asistente
        String nom_asistente;
        int edad;

        //Estadistica
        int menor_25, entre_25_y_35, mayor_35;
        menor_25=0;
        entre_25_y_35=0;
        mayor_35=0;

        //Creación de instancia Cliente

        Cliente cliente_creado = new Cliente();

        //Carga de datos a Cliente
        do {
            System.out.println("Ingrese RUT del Cliente: ");
            rut = leer.next();
        } while (rut.isEmpty());
        cliente_creado.setRut(rut);

        leer = new Scanner( System.in);
        do{

            System.out.println("Ingrese nombre de cliente: ");
            nombre_cliente=leer.nextLine();
        } while(nombre_cliente.isEmpty());
        cliente_creado.setNombre(nombre_cliente);

        do {
            System.out.println("Ingrese dirección del Cliente: ");
            direccion = leer.nextLine();
        } while (direccion.isEmpty());
        cliente_creado.setDireccion(direccion);

        do {
            System.out.println("Ingrese comuna del Cliente: ");
            comuna = leer.nextLine();
        } while (comuna.isEmpty());
        cliente_creado.setComuna(comuna);

        do {
            System.out.println("Ingrese numero de telefono del Cliente: +569");
            telefono = leer.nextInt();
        } while (telefono==0 || telefono>100000000);
        cliente_creado.setTelefono( telefono );

        // Creación de instancia Capacitación
        Capacitacion nueva_capacitacion = new Capacitacion();
        
        //Carga de datos a capacitación
        nueva_capacitacion.setRut_cliente(cliente_creado.getRut() );

        do {
            System.out.println("Día de la capacitación: ");
            dia = leer.next();
        }while( dia.isEmpty());

        nueva_capacitacion.setDia( dia );

        do{
        System.out.println("Hora: ");
        hora = leer.next();
        }while( hora.isEmpty());
        nueva_capacitacion.setHora( hora );

        leer = new Scanner( System.in);
        do{
        System.out.println("Lugar: ");
        lugar = leer.nextLine();
        }while( lugar.isEmpty());

        nueva_capacitacion.setLugar( lugar );
        do {
            System.out.println("Duración: ");
            duracion = leer.next();
        }while (duracion.isEmpty());
        nueva_capacitacion.setDuracion( duracion );

        do{
            System.out.println("Cantidad de Asistentes: ");
            cant_asistentes = leer.nextInt();
        }while( cant_asistentes <= 0);

        nueva_capacitacion.setCant_asistentes( cant_asistentes );

        //Ciclo de carga de los asistente

        for (int i = 0; i < cant_asistentes; i++) {
             Scanner read = new Scanner(System.in);
            System.out.println("Asistente " + Integer.toString(i + 1) + " :" );

            do{
                System.out.println("Nombre : ");
                nom_asistente = read.nextLine();
                System.out.println("Edad: ");
                edad = read.nextInt();
            }while(edad <=0 || nom_asistente.isEmpty() );

            Asistente nuevo_asistente = new Asistente( nom_asistente , edad );
            asistentes.add( nuevo_asistente );


        }

        System.out.println( cliente_creado.toString());
        System.out.println( nueva_capacitacion.toString());

        for (int i = 0; i < asistentes.size(); i++) {


            if (asistentes.get(i).getEdad() < 25) {
                menor_25++;
            } else if (asistentes.get(i).getEdad() >= 25 && asistentes.get(i).getEdad() <= 35) {
                entre_25_y_35++;
            } else {
                mayor_35++;
            }
        }
        System.out.println( "****** Estadísticas de los asistentes ***********");
        System.out.println("Menores de 25 años: " + menor_25);
        System.out.println("Entre 26 y 35 años: " + menor_25);
        System.out.println("Mayores de 35 años: " + menor_25);


    }
}
