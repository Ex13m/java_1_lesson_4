package geekbrains.java_1.lesson_4.animals_classes.home_work;

import java.util.Scanner;

/**
 * Created by Ex13m on 21.07.2016.
 */
public class MainClass {

    static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        /*fullName="FullName";
        position="Position";
        email="email";
        telephone="telephone";
        salary="salary";
        age="age";*/
        /*Workers[] wks3 = new Workers[5];
        for (int i = 0; i <wks3.length ; i++) {
            wks3[i]=sc.nextLine();*/


        Workers wks = new Workers();
        wks.PrintinfoABOUTworkes();
        Workers wks_1 = new Workers("Vsja Ivanov", "loader", "sadVasja@gmai.com", "+4206035646", "500$", "33");

        //    wks_1.position="грузчик" ; - не работает ибо поле приватное
        wks_1.PrintinfoABOUTworkes();


        System.out.println(wks_1.getFullName());
       }



}
