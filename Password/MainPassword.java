public class MainPassword {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();
        System.out.print("Ingrese el número de contraseñas a generar: ");
        int tamañoArray = scanner.nextInt();

        Password[] passwords = new Password[tamañoArray];
        boolean[] esFuerteArray = new boolean[tamañoArray];

        // Generar y evaluar cada contraseña
        for (int i = 0; i < tamañoArray; i++) {
            passwords[i] = new Password(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        // Imprimir las contraseñas generadas y si son consideradas "fuertes" o no
        System.out.println("Contraseñas generadas:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + passwords[i].getContraseña() + " (" + (esFuerteArray[i] ? "Fuerte" : "Débil") + ")");
        }
    }
}