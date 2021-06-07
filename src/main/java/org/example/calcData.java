package org.example;

public class calcData extends getData{
    public double calcAlcoholLevel(double alcohol, double weight, double ratio, int hours){
        double alcoholLevel = (alcohol * 5.14 / weight * ratio) - (0.15 * hours);
        return alcoholLevel;
    }
    public double calcGender(int a){
        double b = 0;
        if(a == 1){
            b = 0.73;
        }
        else if(a == 2){
            b= 0.66;
        }
        return b;
    }
    public void checkIfSafe(double alcoholLevel){
        if(alcoholLevel > 0.08)
        {
            System.out.println("Your BAC is " + alcoholLevel + "\n" + "It is not legal for you to drive.");
        }
        else
        {
            System.out.println("Your BAC is " + alcoholLevel + "\n" + "It is legal for you to drive.");
        }
    }
}
