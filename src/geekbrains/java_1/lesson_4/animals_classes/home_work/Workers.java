package geekbrains.java_1.lesson_4.animals_classes.home_work;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ex13m on 21.07.2016.
 */
public class Workers {

    public static final Scanner sc = new Scanner(System.in);
    public String fullName , position, email, telephone;
    public int salary, age;

    Workers (){
        fullName="FullName";
        position="Position";
        email="email";
        telephone="telephone";
        salary=500;
        age=33;
    }

    Workers (String fullName ,String position,String email,String telephone, int salary, int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.telephone=telephone;
        this.salary=salary;
        this.age=age;

    }

    public void PrintinfoABOUTworkers(){
        System.out.println("FullName  " + fullName);
        System.out.println("Position  " + position);
        System.out.println("e-mail    " + email);
        System.out.println("Telephone " + telephone);
        System.out.println("Salary    " + salary);
        System.out.println("Age       " + age);

    }

    public String getFullName()  {return fullName;}
    public String getPosition()  {return position;}
    public String getEmail()     {return email;}
    public String getTelephone() {return telephone;}
    public int getSalary()       {return salary;}
    public int getAge()          {return age;}

    public void setFullName(String fullName) {
        System.out.println("Введите имя сотрудника: ");
        this.fullName = fullName;}
    public void setPosition(String position) {
        System.out.println("Введите должность: ");
        this.position = position;}
    public void setEmail(String email) {
        System.out.println("Введите имэйл: ");
        this.email = email;}
    public void setTelephone(String telephone) {
        System.out.println("Введите телефон: ");
        this.telephone = telephone;}
    public void setSalary(int salary) {
        System.out.println("Введите величину оклада : ");
        this.salary = salary;}
    public void setAge(int age) {
        System.out.println("Введите возраст: ");
        this.age = age;}

    public static String inputFullname (){
        System.out.println("Введите Имя и Фамилию сотрудника: ");
        return sc.nextLine() ;
        //sc.close();

        }
    public static String inputPosition (){
        System.out.println("Введите должность сотрудника: ");
        return sc.nextLine() ;
        //sc.close();
        }
    public static String inputEmail (){
        System.out.println("Введите email: ");
        return sc.nextLine() ;
        //sc.close();
        }
    public static String inputTelephone (){
        System.out.println("Введите телефон: ");
        return sc.nextLine() ;
        //sc.close();
        }
    public static int rndSalary ( ){
        Double r = Math.random()*500;
        return (int) Math.round(r)+ 500;

        //Random x =new Random(500);
        //return x.nextInt()+ 500 ;

        //System.out.println("Введите величину оклада: ");
        //return sc.nextInt();
        //sc.close();
        }
    public static int rndAge ( ) {
        Double r = Math.random()*40;
        return (int) Math.round(r)+ 20;
        //Random x =new Random(40);
        //return x.nextInt()+ 18 ;

        //System.out.println("Введите возраст: ");
        //return sc.nextInt();
        //sc.close();
        }

}








