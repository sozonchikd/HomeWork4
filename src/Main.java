public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Задание 1.1");
        int age = 23;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил");
        }

        System.out.println("Задание 1.2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Человек может отправляться в университет");
        }
        if (age >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        if (age < 7) {
            System.out.println("Очень мал");
        }

        System.out.println("Задание 1.3");
        int sitPassengers = 55;
        int standPassengers = 23;
        int wagonCapacity = 102;
        int sitPlaces = 60;
        int standPlaces = wagonCapacity - sitPlaces;
        if (sitPassengers + standPassengers > wagonCapacity) {
            System.out.println("Вагон переполнен");
        }
        if (sitPassengers < sitPlaces) {
            System.out.println("Есть еще " + (sitPlaces - sitPassengers) + " сидячих мест");
        }
        if (standPassengers < standPlaces ) {
            System.out.println("Есть еще " + (standPlaces - standPassengers) + " стоячих мест");
        }


    }
}