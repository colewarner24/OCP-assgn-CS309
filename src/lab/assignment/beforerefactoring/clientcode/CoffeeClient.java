package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;


public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new CoffeeMaker();
        starbuzz.prepareAmericanoCoffee();

        System.out.println("********************");

        starbuzz.prepareCapuccinoCoffee();

    }

}
