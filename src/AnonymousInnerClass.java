// sem nome
// serve para instanciar somente um objeto

// definir e instanciar o objeto de uma só vez

// pode estender uma outra classe ou implementar uma interface

public class AnonymousInnerClass {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();

        // se eu quero só um, que é o scooby doo
        // classe anonima, aqui é uma subclasse
        Dog scooby = new Dog() {
            @Override
            void bark() {
                System.out.println("Oi, Salsicha.");
            }
        };
        scooby.bark();

    }

}

class Dog {

    void bark() {
        System.out.println("au au au");
    }

}