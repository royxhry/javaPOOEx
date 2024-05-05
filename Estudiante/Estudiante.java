public class Estudiante {
    private String name;
    private int age;
    private int score;

    public Estudiante(String name, int age, int score) {
        this.name = name;
        if (age < 0) {
            System.out.println("Edad inválida.");
            this.age = 0;
        } else {
            this.age = age;
        }
        if (score < 0) {
            System.out.println("Calificación inválida.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Edad inválida.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) {
            System.out.println("Calificación inválida.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Calificación: " + score);
    }
}