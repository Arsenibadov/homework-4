import javax.xml.transform.SourceLocator;

// Задача № 1
public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println ( " Если возраст человека равен " + age + " то он совершеннолетний" );
        } else if (age < 18) {
            System.out.println ( "Если возраст человека меньше " + age + " то несовершеннолетний нужно подождать " );
        }

        //Задача № 2
        int air = 19;
        if (air >= 5) {
            System.out.println ( "На улице тепло можно идти без шапки, температура выше 5 " );
        } else if (air < 5) {
            System.out.println ( "На улице холодно нужно надеть шапку температура выше 5 " );
        }

        //Задача № 3
        int speed = 40;
        if (speed <= 60) {
            System.out.println ( "можно ездить спокойно" );
        } else if (speed > 60) {
            System.out.println ( " придется заплатить штраф " );
        }

        //Задача № 4
        int age4 = 3;
        int age5 = 15;
        int age6 = 23;
        if (age4 >= 2) {
            System.out.println ( "Если возраст человека равен " + age4 + " то ему нужно ходить в детский сад" );
        } else if (age4 < 6) {
            System.out.println ( "Если возраст человека равен " + age4 + " то ему нужно ходить в детский сад" );
        }
        if (age4 >= 7) {
            System.out.println ( "Если возраст человека равен " + age5 + " то ему нужно ходить в школу" );
        } else if (age5 < 17) {
            System.out.println ( "Если возраст человека равен " + age5 + " то ему нужно ходить в школу" );
        }
        if (age5 >= 18) {
            System.out.println ( "Если возраст человека равен  " + age6 + " то ему нужно ходить в университет" );
        } else if (age6 < 24) {
            System.out.println ( "Если возраст человека равен " + age6 + " то ему нужно ходить в университет" );
        }

        //Задание №5
        int age7 = 13;
        if (age7 <= 5) {
            System.out.println ( " Если возраст ребенка равен " + age7 + " то ему нельзя кататься на аттракционе" );
        } else if (age7 > 5 && age7 < 14) {
            System.out.println ( "Если возраст ребенка равен " + age7 + " то ему  можно кататься на аттракционе в сопровождении взрослого" );
        } else if (age7 > 14) {
            System.out.println ( "Если возраст ребенка равен " + age7 + " то ему можно кататься на аттракционе без сопровождения взрослого" );
        }

        //Задание № 6
        int capacityOfOneCar = 102;
        int capacitySeating = 60;
        int seatsInTheCar = 56;
        if (seatsInTheCar >= 102) {
            System.out.println ( " В вагоне мест нет" );
        } else if (seatsInTheCar < 102) {
            System.out.println ( "В вагоне места есть " );
        }
        System.out.println ( capacityOfOneCar - capacitySeating + " сидячих мест в вагоне " );

        //Задание №7
        int one = 60;
        int two = 400;
        int three = 120;
        if (one >= two && one >= three) {
            System.out.println ( "Самое большое число " + one );
        } else if (two >= one && two >= three) {
            System.out.println ( "Самое большое  число " + two );
        } else System.out.println ( "Самое большое число " + three );
    }
}