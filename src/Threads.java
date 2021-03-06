public class Threads {

    public static void main(String[] args) {

        //Ex. 1 - Threads

        // Java 7

        // criar uma classe que será usada uma só vez e que implementa uma interface
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, turma!");
            }
        }).run();

        // Java 8
        new Thread(() -> System.out.println("Hello, turma!")).run();

        // SAM: Single Abstract Method (interfaces com apenas um metodo abstrato)

    }
}
