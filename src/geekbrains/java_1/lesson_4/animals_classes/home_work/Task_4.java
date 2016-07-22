package geekbrains.java_1.lesson_4.animals_classes.home_work;

public class Task_4 {

    public static void main(String[] args) {

        //Workers workers1 =new Workers();
        Workers workers[] = new Workers[5];
        for (int i = 0; i < workers.length; i++) {
            // workers[i]=new Workers(workers1.setFullName(),workers1.setPosition(),workers1.setEmail(),workers1.setTelephone(),workers1.setSalary(),
            // workers1.setAge()) ;
            workers[i] = new Workers(Workers.inputFullname(), Workers.inputPosition(), Workers.inputEmail(), Workers.inputTelephone(),
                    Workers.rndSalary(), Workers.rndAge());
            System.out.println("Будет получать        : " + workers[i].getSalary());
            System.out.println("Будет ему столько лет : " + workers[i].getAge());
            System.out.println();
        }
        int y = 0;
        for (int i = 0; i < workers.length; i++) {

            if (workers[i].getAge() > 40) {
                y = y+1;
                workers[i].PrintinfoABOUTworkers();
            }
        }
            System.out.println();

            if (y > 0) System.out.println("У вас " + y + " работников старше 40 лет. ");
            else System.out.println("У вас нет работников старше 40 лет.");

    }
}









