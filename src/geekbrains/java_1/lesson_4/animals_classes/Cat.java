package geekbrains.java_1.lesson_4.animals_classes;

public class Cat {

    private String name;
    private String color;
    private int age;

    private static int cats_count;

    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        cats_count++;
    }

    public Cat(String name){
        this.name = name;
        color = "Gray";
        age = 5;
        cats_count++;
    }

    public static int getCatsCount(){ return cats_count; }

    public void printInfo(){ System.out.println("Cat name: " + name + " color: " + color + " age: " + age); }

    public int getAge(){ return age; }

    public void setAge(int age){
        if(age<0 || age>25) System.out.println("Некорректный возраст = " + age); else this.age = age;
    }

    public String getColor(){ return color; }
}
