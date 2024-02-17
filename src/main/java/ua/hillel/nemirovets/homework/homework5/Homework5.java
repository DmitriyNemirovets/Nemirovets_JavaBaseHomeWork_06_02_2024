package ua.hillel.nemirovets.homework.homework5;

public class Homework5 {
    public static void main(String[] args) {
        int liWarrior = 13;
        int liBowman = 24;
        int liRider = 46;
        int countLiWarrior = 860;
        int liGeneralAttack  = (liWarrior + liBowman + liRider) * countLiWarrior;

        int minWarrior = 9;
        int minBowman = 15;
        int minRider = 12;
        int countMinWarrior =  (int) (countLiWarrior* 1.5);
        int minGeneralAttack = (minWarrior + minBowman + minRider) *  countMinWarrior;

        System.out.println("General Attack Li = " + liGeneralAttack);
        System.out.println("General Attack Min = " +minGeneralAttack);
    }
}
