import java.util.Random;

class Password {
    private int longitud;
    private String contraseña;

    // Constructor sin parámetros que genera una contraseña con longitud predeterminada
    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    // Constructor que permite especificar la longitud de la contraseña
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Método que verifica si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) mayusculas++;
            else if (Character.isLowerCase(c)) minusculas++;
            else if (Character.isDigit(c)) numeros++;
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    // Método que genera una contraseña aleatoria
    public void generarPassword() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int tipo = rnd.nextInt(3);
            switch (tipo) {
                case 0: // Mayúscula
                    sb.append((char) (rnd.nextInt(26) + 'A'));
                    break;
                case 1: // Minúscula
                    sb.append((char) (rnd.nextInt(26) + 'a'));
                    break;
                case 2: // Número
                    sb.append((char) (rnd.nextInt(10) + '0'));
                    break;
            }
        }
        contraseña = sb.toString();
    }

    // Método getter para obtener la longitud de la contraseña
    public int getLongitud() {
        return longitud;
    }

    // Método setter para establecer la longitud de la contraseña
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword(); // Al cambiar la longitud, se genera una nueva contraseña
    }

    // Método getter para obtener la contraseña
    public String getContraseña() {
        return contraseña;
    }
}