package models;

import logics.Swimmable;

public class Goose extends Animals implements Swimmable {
    private String featherColoring;
    private boolean gooseHandsome;

    public Goose(String name, String featherColoring, boolean gooseHandsome) {
        this.name = name;
        this.featherColoring = featherColoring;
        this.gooseHandsome = gooseHandsome;
    }

    public String getFeatherColoring() {
        return featherColoring;
    }

    public boolean getGooseHandsome(){
        return gooseHandsome;
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
