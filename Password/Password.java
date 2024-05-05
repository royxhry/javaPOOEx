import java.util.Random;

class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) mayusculas++;
            else if (Character.isLowerCase(c)) minusculas++;
            else if (Character.isDigit(c)) numeros++;
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

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

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public String getContraseña() {
        return contraseña;
    }
}