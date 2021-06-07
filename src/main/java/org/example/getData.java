package org.example;
import java.text.NumberFormat;
import java.util.Scanner;
public class getData {
    Scanner g = new Scanner(System.in);
    public int gender(){
        System.out.println("Please enter a 1 if you are male or a 2 if you are female: ");
        String gender = g.next();
        int gen = 0;
        try {
            gen = Integer.parseInt(gender);
            if(gen > 2 || gen < 1)
            {
                System.out.println("Please enter a number less than 2 and greater than 0");
                System.exit(0);
            }
        }
        catch (NumberFormatException ex){
            System.out.println("This is not a number please try again");
            System.exit(0);
        }
        return gen;
    }
    public int getAlcoholData(){
        System.out.println("How many Ounces of alcohol did you have? ");
        String ounce = g.next();
        int oz = 0;
        try {
            oz = Integer.parseInt(ounce);
        }
        catch (NumberFormatException num){
            System.out.println("This is not a number please try again.");
            System.exit(0);
        }
        return oz;
    }
    public int getWeight(){
        System.out.println("What is your weight in pounds? ");
        String w = g.next();
        int weight = 0;
        try{
            weight = Integer.parseInt(w);
        }
        catch (NumberFormatException num){
            System.out.println("This is not a number please try again.");
            System.exit(0);
        }
        return weight;
    }
    public int hoursSinceDrink(){
        System.out.println("How many hours has it been since your last drink? ");
        String h = g.next();
        int hours = 0;
        try{
            hours = Integer.parseInt(h);
        }
        catch(NumberFormatException num){
            System.out.println("This is not a number please try again.");
            System.exit(0);
        }
        return hours;
    }
}
