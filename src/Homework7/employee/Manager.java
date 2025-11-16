package Homework7.employee;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void work(){
        System.out.println(name + " управляет командой и ставит задачи" );
    }
}
