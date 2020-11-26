import  models.*;
public class Main {

    public static void main(String[] args) {

        Duck bob = new Duck("Bob", "Gray", 5);
        Elephant igor = new Elephant("Igor", 500, 2);
        Goose tom = new Goose("Tom", "Black", true);

        System.out.println(bob.toString());
        bob.showInformation();
        bob.swim();

        System.out.println(igor.toString());
        igor.showInformation();

        System.out.println(tom.toString());
        tom.showInformation();
        tom.swim();

    }
}



