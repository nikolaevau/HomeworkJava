package Homework5;

import java.util.Scanner;

public class DepositCalculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада");
        float deposit = scanner.nextFloat();

        System.out.println("Введите срок вклада в месяцах");
        int month = scanner.nextInt();

        float startDeposit = deposit;

        // Цикл for
        System.out.println("Расчет с помощью цикла for");
        for (int i=1; i<=month; i++) {
            deposit = deposit + (deposit * 0.07f);
        }
        System.out.println("После " + month + " месяцев сумма вклада составит " + deposit);

        // Цикл while
        deposit = startDeposit;

        System.out.println("Расчет с помощью цикла while");
        int startMonth = 1;
        while (startMonth <= month) {
            deposit = deposit + (deposit * 0.07f);
            startMonth++;
        }
        System.out.println("После " + month + " месяцев сумма вклада составит " + deposit);
    }
}

