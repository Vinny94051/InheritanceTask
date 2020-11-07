
public class Elephant extends Animals {
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

