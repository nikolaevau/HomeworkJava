import Homework14.Box;
import Homework4.Car;
import Homework7.employee.Developer;
import Homework7.employee.Employee;
import Homework7.employee.Manager;
import Homework7.shape.Circle;
import Homework7.shape.Rectangle;
import Homework7.shape.Shape;
import Homework8.Guitar;
import Homework8.Music;
import Homework8.Piano;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Создание автомобилей");
//        Car car1 = new Car("Kia Sportage", 2020);
//        Car car2 = new Car("BMW X6", 2024);
//        Car car3 = new Car("Volkswagen TRoc", 2021);
//
//        System.out.println("makeBebe первоначальный");
//        car1.makeBebe();
//        car2.makeBebe();
//        car3.makeBebe();
//
//
////      Переопределение переменных
//        car1.setModel("Москвич 3");
//        car1.setYear(2023);
//
//        car2.setModel("Audi A7");
//        car2.setYear(2024);
//
//        System.out.println("makeBebe после переопределения переменных");
//        car1.makeBebe();
//        car2.makeBebe();
//        car3.makeBebe();
//    }
//}

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
//public static void main() {
//  Homework7.employee.Employee manager = new Manager("Иван", 500000);
//  Homework7.employee.Developer developer = new Developer("Александр", 100000);
//
//  manager.work();
//  developer.work();
//
//  //Shape
//    Shape circle = new Circle();
//    Shape rectangle = new Rectangle();
//
//    circle.draw();
//    rectangle.draw();

// Домашнее задание 8
//Guitar guitar = new Guitar();
//Piano piano = new Piano();
//guitar.play(Music.StringsCount.GUITAR.getCount());
//piano.play(Music.StringsCount.PIANO.getCount());
//
//}

//Домашнее задание 14
public class Main {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(25.0, 30.0, 21.0));
        boxes.add(new Box(35.0, 40.0, 30.0));
        boxes.add(new Box(15.0, 20.0, 10.0));
        boxes.add(new Box(45.0, 35.0, 25.0));

        List<Box> bigBoxes = new ArrayList<>();

        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()){
            Box box = iterator.next();
            if (box.getWidth()>30){
                bigBoxes.add(box);
                iterator.remove();
            }
        }

        System.out.println("Коробок с шириной меньше 30см - " + boxes.size() + " шт.");
        System.out.println("Коробок с шириной больше 30см - " + bigBoxes.size() + " шт.");

        System.out.println("Коробки с шириной меньше 30см: ");
        for (Box box : boxes) {
            System.out.println("  - " + box);
        }

        System.out.println("Коробки с шириной больше 30см: ");
        for (Box box : bigBoxes) {
            System.out.println("  - " + box);
        }

    }
}