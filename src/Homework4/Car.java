package Homework4;

import javax.xml.transform.Source;

public class Car {
    public String model;
    public int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    public void makeBebe() {
        System.out.println("Изготовлен автомобиль: " + model + " (" + year + "год)");
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setModel(String model){
        this.model= model;
    }
    public void setYear(int year){
        this.year= year;
    }
}
