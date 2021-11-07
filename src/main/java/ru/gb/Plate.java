package ru.gb;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
        if (food <0) {
            System.out.println("В тарелке недостаточно еды"); // If выполняет ту же функцию, что и констукция с if в методе eat с классе Cat. Прописана конструкция исключительно по условию задания
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void increaseFood(int m) {
        food += m;
    }

}
