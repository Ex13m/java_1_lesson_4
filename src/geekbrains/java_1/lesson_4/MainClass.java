package geekbrains.java_1.lesson_4;

import geekbrains.java_1.lesson_4.animals_classes.Cat;

public class MainClass {

    public static void main(String[] args) {

        //Создаём несколько экземпляров класса Cat
        Cat cat_1 = new Cat("Barsik", "White", 3);
        Cat cat_2 = new Cat("Murzik", "Black", 1);
        Cat cat_3 = new Cat("Vaska");

        //Используем нестатические методы для работы с полями объекта

        //Используем геттеры и сеттеры как посредники для взаимодействия с полями объекта
        cat_1.setAge(20);
        System.out.println("Возраст cat_1 = " + cat_1.getAge());
        System.out.println("Цвет cat_1 = " + cat_1.getColor());

        cat_1.printInfo();
        cat_2.printInfo();
        cat_3.printInfo();

        //Пример создания массива объектов
        Cat[] cats = new Cat[4];
        for (int i = 0; i < cats.length; i++) cats[i] = new Cat("Кот " + (i + 1));

        //Пример работы с массивом объектов
        for (int i = 0; i < cats.length; i++) cats[i].printInfo();

        //Используем статический метод класса, для взаимодействия со статическими полями класса
        int cats_count = Cat.getCatsCount();
        System.out.println("Количество созданных котов = " + cats_count);
    }
}
