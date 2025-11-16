import Homework4.Car;
import Homework7.employee.Developer;
import Homework7.employee.Employee;
import Homework7.employee.Manager;
import Homework7.shape.Circle;
import Homework7.shape.Rectangle;
import Homework7.shape.Shape;

import java.awt.*;

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

//Домашнее задание 6. Массивы и строки

//public static void main(String[] args) {
//    String[] stringsArray = {"привет", "ПОКА", "гипербола"};
//
//    System.out.println(stringsArray[0].toUpperCase());
//    System.out.println(stringsArray[1].toLowerCase());
//
//    String hyperbola = stringsArray[2];
//    StringBuilder change = new StringBuilder(hyperbola);
//    change.setCharAt(1, 'О');
//    change.insert(3, ' ');
//    System.out.println((change));
//}

//Домашнее задание 7
//Employee
public static void main() {
  Homework7.employee.Employee manager = new Manager("Иван", 500000);
  Homework7.employee.Developer developer = new Developer("Александр", 100000);

  manager.work();
  developer.work();

  //Shape
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();

    circle.draw();
    rectangle.draw();

}