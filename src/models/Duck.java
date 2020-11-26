package models;;
import logics.Swimmable;

public class Duck extends Animals implements Swimmable {
    private String featherColoring;
    private int age;

    public Duck(String name, String featherColoring, int age) {
        this.name = name;
        this.featherColoring = featherColoring;
        this.age = age;
    }

    public String getFeatherColoring(){
        return featherColoring;
    }

    public int getAge(){return age;}

    @Override
    public String toString() {
        return "Duck: " + this.name;
    }

    @Override
    public void showInformation() {
        System.out.println("Hello, I'm a duck");
        System.out.println("Feather Coloring: " + featherColoring);
        System.out.println("Age: " + age);

    }

    public void swim() {
        System.out.println("I am a duck and I can swim");
        System.out.println();
    }
}
