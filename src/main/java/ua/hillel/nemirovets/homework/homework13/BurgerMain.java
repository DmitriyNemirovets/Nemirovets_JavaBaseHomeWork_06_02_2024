package ua.hillel.nemirovets.homework.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burgerRegular = new Burger("Roll", "Meat", "Cheese", "Green", "Mayonnaise");
        System.out.println();

        Burger burgerDiet = new Burger("Roll", "Meat", "Cheese", "Green");
        System.out.println();

        Burger burgerDoubleMeat = new Burger("Roll", "Meat", "Cheese", "Green", "Mayonnaise", true);
    }
}
