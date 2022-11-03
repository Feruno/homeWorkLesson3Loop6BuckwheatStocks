package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int storageOneKilogramMonth = 100; // используется в двух вариантах задачи

        int payment;
        int totalPayment = 0;
        for (int i = 100; i >= 1;) {
            payment = i * storageOneKilogramMonth;
            //System.out.println("плата" + payment );
            i = i-6;
            totalPayment = totalPayment + payment;
            //System.out.println("Общая плата " + totalPayment );
        }
        System.out.println("Общая плата при запасе 100 килограммов гречки : " + totalPayment + " рублей");


        //Задание со звёздочкой.
        int termPowerSupplyBuckwheatMonths = 10; //месяцев питания гречкой
        int storageKilogramMonth = 0;
        int totalPaymentDop = 0;
        for (int i = termPowerSupplyBuckwheatMonths; i >= 1; i--) {
            storageKilogramMonth += 6;
            //System.out.println("килограммы " + storageKilogramMonth );
        }
        totalPaymentDop = storageOneKilogramMonth * storageKilogramMonth;
        System.out.println("Общая плата на " + termPowerSupplyBuckwheatMonths + " месяцев : " + totalPaymentDop + " рублей");
    }
}
