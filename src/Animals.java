abstract public class Animals {
    String name;

    abstract void showInformation();
}

interface Swimmable {
    void swim();
}

class Duck extends Animals implements Swimmable {
    private String featherColoring;
    private int age;

    Duck(String name, String featherColoring, int age) {
        this.name = name;
        this.featherColoring = featherColoring;
        this.age = age;
    }

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

class Elephant extends Animals {
    private int weight;
    private int growth;

    Elephant(String name, int weight, int growth) {
        this.name = name;
        this.growth = growth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Elephant: " + this.name;
    }

    @Override
    public void showInformation() {
        System.out.println("Hello, I'm an elephant");
        System.out.println("Weight: " + this.weight);
        System.out.println("Growth: " + this.growth);
        System.out.println();
    }
}

class Goose extends Animals implements Swimmable {
    String featherColoring;
    boolean gooseHandsome;

    Goose(String name, String featherColoring, boolean gooseHandsome) {
        this.name = name;
        this.featherColoring = featherColoring;
        this.gooseHandsome = gooseHandsome;
    }

    @Override
    public String toString() {
        return "Goose: " + this.name;
    }

    @Override
    public void showInformation() {
        System.out.println("Привет, уточка, я гусь, хорошо ебусь");
        System.out.println("Feather Coloring: " + featherColoring);
        System.out.println("Is the goose handsome? " + gooseHandsome);
    }

    public void swim() {
        System.out.println("I am a goose and I can swim");
        System.out.println();
    }
}
