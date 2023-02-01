import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        System.out.println(" Задача 1 ");
    int age = 18;
    if (age>= 18){
        System.out.println(" Если возраст человека равен " + age + " ,то он совершеннолетний");
    } if (age< 18) {
        System.out.println(" Oн не достиг совершеннолетия,нужно немного подождать");
    }

         task2();
    }
    public static void task2(){
        System.out.println(" Задача 2 ");
        int temperature = 6;
        if (temperature< 5) {
            System.out.println(" На улице " + temperature + " градуса, нужно надеть шапку ");
        }if (temperature> 5) {
            System.out.println(" Можно идти без шапки ");
        }
        task3();
    }
    public static void task3(){
        System.out.println(" Задача 3 ");
    int speed = 50;
        if (speed >=60) {
            System.out.println(" Если скорость " + speed + " км/ч, то придется заплатить штраф ");
        }else {
            System.out.println(" Можно ездить спокойно ");
        }
        task4();
    }
    public static void task4(){
        System.out.println(" Задача 4 ");
    int age = 20;
    if (age >=2 && age <6){
        System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в детский сад ");
    } if (age >=7 && age <=18)  {
        System.out.println( " Если возраст человека равен " + age + " , то ему нужно ходить в школу ");
    } if (age >18 && age <= 24)  {
            System.out.println( " Если возраст человека равен " + age + " , то ему нужно ходить в университет ");
    } else {
            System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить на работу ");
        }
        task5();
    }
    public static void task5(){
        System.out.println(" Задача 5 ");
    int age= 15;
    if (age <5) {
        System.out.println(" Если возраст ребенка равен " + age + " , то он не может кататься на аттракционе ");
    } if (age >=5 && age <14)  {
        System.out.println(" Если возраст ребенка равен " + age
                + " , то он может кататься только в сопровождении взрослого ");
    } else {
            System.out.println(" Если взрослого нет, то кататься нельзя ");
    }if (age >14) {
            System.out.println(" Если возраст ребенка равен " + age
                    + " , то он может кататься без сопровождения взрослого ");
        }
        task6();
    }
    public static void task6() {
        System.out.println(" Задача 6 ");
        int trainCapacity = 102;
        int seating = 60;
    if ( trainCapacity <=102 ) {
        System.out.println(" Если в вагон село " + trainCapacity + " человек, то есть сидячее или стоячее место");
    } else {
        System.out.println( " Вагон уже полностью забит");
    }
        task7();
    }
    public static void task7() {
        System.out.println(" Задача 7 ");
        int one=6;
        int two=10;
        int three=15;
        if (one > two )
       if ( one>three){
           System.out.println(" Максимальное число -" + one);
} else {
           System.out.println(" Максимальное число -" + three);       }
        if ( two > one )
            if (two>= three){
                System.out.println(" Максимальное число -" + two);
            } else {
                System.out.println(" Максимальное число -" + three);       }
        if (  one >three )
            if (three> one){
                System.out.println(" Максимальное число -" +  one);
            } else {
                System.out.println(" Максимальное число -" + three);       }
}
}