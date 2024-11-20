package ejercicio_1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        
        return "oauth_usuario".equals(usuario) && "oauth_contraseña".equals(contraseña);
    }
}