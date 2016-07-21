package geekbrains.java_1.lesson_4.animals_classes.home_work;

/**
 * Created by Ex13m on 21.07.2016.
 */
public class Workers {

    private String fullName , position, email, telephone,salary, age;

    Workers (){
        fullName="FullName";
        position="Position";
        email="email";
        telephone="telephone";
        salary="salary";
        age="age";
    }

    Workers (String fullName ,String position,String email,String telephone, String salary, String age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.telephone=telephone;
        this.salary=salary;
        this.age=age;

    }

    public void PrintinfoABOUTworkes(){
        System.out.println("FullName  " + fullName);
        System.out.println("Position  " + position);
        System.out.println("e-mail    " + email);
        System.out.println("Telephone " + telephone);
        System.out.println("Salary    " + salary);
        System.out.println("Age       " + age);

    }

    public String getFullName() {
        return fullName;
    }
}
