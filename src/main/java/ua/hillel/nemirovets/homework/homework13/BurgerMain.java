package ua.hillel.nemirovets.homework.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burgerRegular = new Burger("Roll", "Meat", "Cheese", "Green", "Mayonnaise");
        burgerRegular.burgerRegular();
        System.out.println();

        Burger burgerDiet = new Burger("Roll", "Meat", "Cheese", "Green");
        burgerDiet.burgerDiet();
        System.out.println();

        Burger burgerDoubleMeat = new Burger("Roll", "Meat", "Cheese", "Green", "Mayonnaise", true);
        burgerDoubleMeat.burgerDoubleMeat();
    }
}
