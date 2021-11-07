package ru.gb;

public class MainClass {

    public static void main(String[] args) {

            Cat cat = new Cat("Barsik", 15);
            Cat cat1 = new Cat("Murzik", 25);
            Cat cat2 = new Cat("Leopold", 20);
            Plate plate = new Plate(35);

            // Следущий массив и объект созданы для 5-го задания
            Plate plate1 = new Plate (32);
            Cat[] catList = new Cat[3];
            catList[0] = new Cat("Tom", 21);
            catList[1] = new Cat("Vasya", 10);
            catList[2] = new Cat("Kuzya", 17);

            for (int i = 0; i < catList.length; i++) {
                    catList[i].eat(plate1);
                    catList[i].printFullness();
                    plate1.info();
            }
            plate.info();
            cat.eat(plate);
            cat.printFullness(); // По условию задачи выводить в консоль информацию о сытости котов не нужно, сделано для проверки метода и наглядности
            plate.info();
            cat1.eat(plate);
            cat1.printFullness();
            plate.info();
            cat2.eat(plate);
            cat2.printFullness();
            plate.info();
            plate.increaseFood(150);
            plate.info();



    }

}
