package ejercicio_2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        archivos.put(nombre, contenido);
        System.out.println("Archivo guardado localmente: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return archivos.get(nombre);
    }
}