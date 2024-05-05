public class MainPassword {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();
        System.out.print("Ingresa el numero de contraseñas: ");
        int tamañoArray = scanner.nextInt();

        Password[] passwords = new Password[tamañoArray];
        boolean[] esFuerteArray = new boolean[tamañoArray];

        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        System.out.println("Contraseñas generadas:");
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(passwords[i].getContraseña() + " " + esFuerteArray[i]);
        }
    }
}