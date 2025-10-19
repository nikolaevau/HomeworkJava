package Homework3;

public class Class1 {
    public String model; //публичная перменная
    public int year;
    public static String brand = "KIA";//статичная переменная


    //Метод со статичными перменными
    public void printInfo (){
        System.out.print("Марка:" + brand + " Модель:" + model + " Год выпуска:" + year);
    }
}
