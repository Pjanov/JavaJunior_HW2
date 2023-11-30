package ru.pjanov;

public class Cat extends Animal {
    private boolean isPlayful;

    public Cat(String name, int age, boolean isPlayful) {
        super(name, age);
        this.isPlayful = isPlayful;
    }

    public boolean isPlayful() {
        return isPlayful;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
