package YandexPraktikumTasks.JavaCore1.sprint_7.functional.task08;

import java.util.function.UnaryOperator;

class Person {
    private String name;
    private String favouriteSpice;

    public Person(String name, String favouriteSpice) {
        this.name = name;
        this.favouriteSpice = favouriteSpice;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteSpice() {
        return favouriteSpice;
    }

    public UnaryOperator<String> addFavouriteSpice() {
        return new Adder(this);
    }
}

class Adder implements UnaryOperator<String> {
    private String favouriteSpice;

    public Adder(Person person) {
        this.favouriteSpice = person.getFavouriteSpice();
    }

    @Override
    public String apply(String recipe) {
        return recipe + " " + favouriteSpice;
    }
}

public class Practicum {

    public static void main(String[] args) {
        Person petya = new Person("Петя", "паприка");

        String oldRecipe = "тесто томаты курица сыр";
        UnaryOperator<String> petyaAdder = petya.addFavouriteSpice();

        String newRecipe = petyaAdder.apply(oldRecipe);
        System.out.println(newRecipe);
    }
}