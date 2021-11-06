package ru.gb;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness; // Дефолтное значение boolean - false, следовательно, по условию задачи, все созданные коты голодны.


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate p) {
        if (appetite > p.getFood()) {
            System.out.println("В тарелке недостаточно еды для кота " + name + ".");
            return fullness = false;
        } else {
            p.decreaseFood(appetite);
            return fullness = true;
        }
    }
    public void printFullness () {
        if (fullness) {
            System.out.println("Кот " + name + " теперь сыт.");
        } else {
            System.out.println("Кот " + name + " остается голоден.");
        }
    }
}
