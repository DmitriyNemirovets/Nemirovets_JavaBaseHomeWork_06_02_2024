package ua.hillel.nemirovets.homework.homework13;

public class Burger {

    String roll;
    String meat;
    String cheese;
    String green;
    String mayonnaise;

    Burger(String roll, String meat, String cheese, String green, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        burgerRegular();
    }

    void burgerRegular() {
        System.out.println("BURGER REGULAR : ");
        System.out.println(" Roll : " + roll);
        System.out.println(" Meat : " + meat);
        System.out.println(" Cheese : " + cheese);
        System.out.println(" Green : " + green);
        System.out.println(" Mayonnaise : " + mayonnaise);
    }

    Burger(String roll, String meat, String cheese, String green) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        burgerDiet();
    }

    void burgerDiet() {
        System.out.println("BURGER DIET : ");
        System.out.println(" Roll : " + roll);
        System.out.println(" Meat : " + meat);
        System.out.println(" Cheese : " + cheese);
        System.out.println(" Green : " + green);
    }

    Burger(String roll, String meat, String cheese, String green, String mayonnaise, boolean doubleMeat) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        if (doubleMeat) {
            this.meat += "(double)";
        }
        burgerDoubleMeat();
    }

    void burgerDoubleMeat() {
        System.out.println("BURGER REGULAR : ");
        System.out.println(" Roll : " + roll);
        System.out.println(" Meat : " + meat);
        System.out.println(" Cheese : " + cheese);
        System.out.println(" Green : " + green);
        System.out.println(" Mayonnaise : " + mayonnaise);
    }
}
