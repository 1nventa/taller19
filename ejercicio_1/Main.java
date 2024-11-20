package ejercicio_1;

public class Main {
    public static void main(String[] args) {
      
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);
        System.out.println("Autenticación Local: " + gestorLocal.autenticarUsuario("usuario", "contraseña"));

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);
        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticarUsuario("oauth_usuario", "oauth_contraseña"));
    }
}