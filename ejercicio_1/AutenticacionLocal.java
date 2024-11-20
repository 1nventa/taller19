package ejercicio_1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        
        return "usuario".equals(usuario) && "contraseña".equals(contraseña);
    }
}