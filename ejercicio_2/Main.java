package ejercicio_2;

public class Main {
       
        public static void main(String[] args) {
        
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.guardar("archivo1.txt", "Contenido del archivo 1");
        System.out.println("Recuperado: " + gestorLocal.recuperar("archivo1.txt"));

        
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.guardar("archivo2.txt", "");
       }
        }