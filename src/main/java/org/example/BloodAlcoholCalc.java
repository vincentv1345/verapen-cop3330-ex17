package org.example;

/**
 * Hello world!
 *
 */
public class BloodAlcoholCalc
{
    public static void main( String[] args )
    {
        calcData d = new calcData();
        int gender = d.gender();
        int alcoholData = d.getAlcoholData();
        int getWeight = d.getWeight();
        int getHours = d.hoursSinceDrink();
        double calcGenderRatio = d.calcGender(gender);
        double calcAlchLevel = d.calcAlcoholLevel(alcoholData, getWeight, calcGenderRatio, getHours);
        d.checkIfSafe(calcAlchLevel);
    }
}
