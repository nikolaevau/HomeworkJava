import Homework4.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создание автомобилей");
        Car car1 = new Car("Kia Sportage", 2020);
        Car car2 = new Car("BMW X6", 2024);
        Car car3 = new Car("Volkswagen TRoc", 2021);

        System.out.println("makeBebe первоначальный");
        car1.makeBebe();
        car2.makeBebe();
        car3.makeBebe();


//      Переопределение переменных
        car1.setModel("Москвич 3");
        car1.setYear(2023);

        car2.setModel("Audi A7");
        car2.setYear(2024);

        System.out.println("makeBebe после переопределения переменных");
        car1.makeBebe();
        car2.makeBebe();
        car3.makeBebe();
    }
}