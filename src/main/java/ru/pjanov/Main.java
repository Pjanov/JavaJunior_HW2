package ru.pjanov;

import java.lang.reflect.Method;

/*
- Создайте абстрактный класс "Animal" с полями "name" и "age".
- Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat")
  с уникальными полями и методами.
- Создайте массив объектов типа "Animal" и с использованием Reflection API
  выполните следующие действия:
  - Выведите на экран информацию о каждом объекте.
  - Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
*/

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Buddy", 3, "Golden Retriever"), new Cat("Whiskers", 5, true)};

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge());

            Class<? extends Animal> animalClass = animal.getClass();
            try {
                Method makeSoundMethod = animalClass.getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println("Метод makeSound() отсутствует у данного объекта");
            }
        }
    }
}
