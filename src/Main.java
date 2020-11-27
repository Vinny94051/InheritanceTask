import  models.*;
import logics.SwimmableHelper;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Animals> animals = new ArrayList<>();
        ArrayList<Animals> swimmableAnimals = new ArrayList<>();

        animals.add(new Goose("Tom", "Black", true));
        animals.add(new Goose("Max", "White", true));
        animals.add(new Goose("Bob", "Black", false));

        animals.add(new Elephant("Igor", 1000, 2));
        animals.add(new Elephant("Kate", 500, 1));
        animals.add(new Elephant("Alex", 700, 1));

        animals.add(new Duck("Roma", "Black", 5));
        animals.add(new Duck("Dimas", "Brown", 4));
        animals.add(new Duck("Nikolai", "Black", 6));

        for (Animals animal:animals) {
            if(SwimmableHelper.checkSwimmableImplementation(animal)){
                swimmableAnimals.add(animal);
            }
        }

        for (Animals animal:swimmableAnimals) {
            System.out.println(animal.toString());
        }
    }
}



