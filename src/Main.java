import java.time.LocalDate;

public class Main {

    public static void checksYear(int year) { // объявление метода для проверки является ли год високосным
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){ // условный оператор для проверки
            System.out.println(year + " год является високосным."); //вывод в консоль
        } else{
            System.out.println(year + " год не является високосным.");//вывод в консоль
        }
    }

    public static void checkClientDevice(int os, int clientDeviceYear) { // объявление метода для проверки устройства клиента
        if (os == 0 && clientDeviceYear < 2015) { //условия для проверки по заданию
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if ((os == 1 && clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обыную версию приложения для Android по ссылке");
        }
    }

    public static int numberOfDayToDelivery(int deliveryDistance) { // объявление метода для проверки расстояния до клиента и определения количества дней для доставки
        int days = 0; //объявление переменной для учета количества дней
        if (deliveryDistance <= 20) { //условный оператор для проверки расстояния до клиента
            days++; // 1 день на доставку
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) { //условный оператор для проверки расстояния до клиента
            days+=2; // 2 дня на доставку
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) { //условный оператор для проверки расстояния до клиента
            days += 3; // 3 дня на доставку
        } else  { //условный оператор для проверки расстояния до клиента
            return 0; // возвращаем ноль при превышении возможного расстояния доставки
        }
        return days;
    }

    public static void printDeliveryDistance(int days) { //метод для вывода в консоль
        if (days == 0) { // проверка условия для вывода информации о невозможности доставки
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear(); //переменная для хранения текущего года
        int os = 1; // переменная для хранения данных об ОС по заданию
        int deliveryDistance = 95; // переменная для хранения данных о расстоянии до клиента
        checksYear(currentYear); //вызов метода проверки является ли год високосным
        checkClientDevice(os, currentYear); //вызов метода устройства клиента
        printDeliveryDistance(numberOfDayToDelivery(deliveryDistance)); //вызов метода вывода информации о деталях доставки с передачей в качестве параметра метода для проверки расстояния до клиента и определения количества дней для доставки
    }
}