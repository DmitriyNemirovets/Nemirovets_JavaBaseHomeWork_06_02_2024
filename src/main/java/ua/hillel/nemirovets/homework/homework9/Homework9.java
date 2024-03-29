package ua.hillel.nemirovets.homework.homework9;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int [] team1 = new int[25];
        int [] team2 = new int [25];

        double sumTeam1 = 0.0;
        double sumTeam2 = 0.0;

        int minAge = 18;
        int maxAge = 40;

        for (int i = 0; i < team1.length; i++) {
            int resultTeam1Age = (int) Math.floor(Math.random() * (maxAge - minAge + 1) + minAge);
            team1[i] = resultTeam1Age;
            sumTeam1 += team1[i];
        }
        for (int i = 0; i < team2.length; i++) {
            int resultTeam2Age = (int) Math.floor(Math.random() * (maxAge - minAge + 1) + minAge);
            team2[i] = resultTeam2Age;
            sumTeam2 += team2[i];
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        System.out.println("Average age of players One Team = " + sumTeam1 / team1.length);
        System.out.println("Average age of players Two Team = " + sumTeam2 / team2.length);

    }
}
