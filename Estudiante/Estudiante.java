public class Estudiante {
    // Variables para el nombre, la edad y la calificación del estudiante
    private String name;
    private int age;
    private int score;

    // Constructor para inicializar el nombre, la edad y la calificación del estudiante
    public Estudiante(String name, int age, int score) {
        this.name = name;
        // Verificar si la edad es válida, si no, establecerla en 0
        if (age < 0) {
            System.out.println("¡Edad inválida! Se estableció en 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
        // Verificar si la calificación es válida, si no, establecerla en 0
        if (score < 0) {
            System.out.println("¡Calificación inválida! Se estableció en 0.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    // Método para obtener el nombre del estudiante
    public String getName() {
        return name;
    }

    // Método para establecer el nombre del estudiante
    public void setName(String name) {
        this.name = name;
    }

    // Método para obtener la edad del estudiante
    public int getAge() {
        return age;
    }

    // Método para establecer la edad del estudiante
    public void setAge(int age) {
        // Verificar si la edad es válida, si no, establecerla en 0
        if (age < 0) {
            System.out.println("¡Edad inválida! Se estableció en 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Método para obtener la calificación del estudiante
    public int getScore() {
        return score;
    }

    // Método para establecer la calificación del estudiante
    public void setScore(int score) {
        // Verificar si la calificación es válida, si no, establecerla en 0
        if (score < 0) {
            System.out.println("¡Calificación inválida! Se estableció en 0.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    // Método para imprimir los datos del estudiante
    public void imprimirDatos() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Calificación: " + score);
    }
}
