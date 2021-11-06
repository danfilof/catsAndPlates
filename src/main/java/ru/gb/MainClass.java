package ru.gb;

public class MainClass {

    public static void main(String[] args) {

            Cat cat = new Cat("Barsik", 15);
            Cat cat1 = new Cat("Murzik", 25);
            Cat cat2 = new Cat("Leopold", 20);
            Plate plate = new Plate(35);
            plate.info();
            cat.eat(plate);
            cat.printFullness();
            plate.info();
            cat1.eat(plate);
            cat1.printFullness();
            plate.info();
            cat2.eat(plate);
            cat2.printFullness();
            plate.info();


    }

}
