import java.net.PasswordAuthentication;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    //1
        int age = 2;
        System.out.print("Если возраст человека равен " + age + ", то ");
            if (age >= 18){
          System.out.println("он совершеннолетний.");
                System.out.println(" ");
            }
            else {
                System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
                System.out.println(" ");
            }

    //2
        int temp = 8;
            if(temp >= 5){
                System.out.println("Сегодня тепло, иди без шапки");
                System.out.println(" ");
            }
            else {
                System.out.println("Сегодня холодно, надень шапку");
                System.out.println(" ");
            }

    //3
        int speed = 60;
        System.out.print("Если скорость " + speed + ", то ");
        if(speed > 60){
            System.out.println("придется заплатить штраф.");
            System.out.println(" ");
        }
        else {
            System.out.println("можно ездить спокойно.");
            System.out.println(" ");
        }

    //4
        int ageForTask4 = 25;
        boolean isDayCareTime = ageForTask4 >= 2 && ageForTask4 <= 6;
        boolean isTimeForSchool = ageForTask4 >= 7 && ageForTask4 <= 18;
        boolean isUniversityTime = ageForTask4 > 18 && ageForTask4 <= 24;
        boolean itsTimeToFactory = ageForTask4 > 24;

        System.out.print("Есди возраст человека равен " + ageForTask4 + ", то ему нужно ходить ");
            if(isDayCareTime){
            System.out.println("в детский сад");
                System.out.println(" ");
            } else if (isTimeForSchool) {
                System.out.println("в школу");
                System.out.println(" ");
            } else if (isUniversityTime) {
                System.out.println("в универ");
                System.out.println(" ");
            } else if (itsTimeToFactory) {
                System.out.println("на завод к таким же работягам");
                System.out.println(" ");
            }

    //5
       boolean isThereAnyAdult = false;
       int ageOfChild = 15;
            if (ageOfChild < 5){
                System.out.println("Кататься нельзя");
                System.out.println(" ");
            }   else if (ageOfChild >= 5 && ageOfChild < 14 && isThereAnyAdult){
                System.out.println("Кататься можно");
                System.out.println(" ");
            }   else if(ageOfChild >= 14) {
                System.out.println("Кататься можно");
                System.out.println(" ");
            } else {
                System.out.println("Кататься нельзя");
                System.out.println(" ");
            }

    //6
       int passengers = 72;
       int passengerCapacity = 102;
       int seats = 60;
       int standing = passengerCapacity - seats;

       if(passengers >= 0) {
           if (passengers < seats && passengers >= 0) {
               System.out.println("Осталось " + (seats - passengers) + " сидячих мест.");
               System.out.println(" ");
           } else if (passengers >= seats && passengers < passengerCapacity) {
               System.out.println("Сидячих мест не сталось. Есть " + (passengerCapacity - passengers) + " стоячих мест.");
               System.out.println(" ");
           } else {
               System.out.println("Мест не осталось.");
               System.out.println(" ");
           }
       } else {
           System.out.println("Некорректное число пассажиров. Пассажиров не может быть меньше 0.");
           System.out.println(" ");
       }

    //7
        int one = 5;
        int two = -2;
        int three = 228;

        if(one > two && one > three){
            System.out.println(one + " - наибольшее из чисел");
            System.out.println(" ");
        } else if (two > one && two > three){
            System.out.println(two + " - наибольшее из чисел");
            System.out.println(" ");
        } else if (three > one && three > two){
            System.out.println(three + " - наибольшее из чисел");
            System.out.println(" ");
        }





    }
}