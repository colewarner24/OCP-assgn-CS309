package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CoffeeMaker;


public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();


    }

}
