package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CallPhone phone = new CallPhone();

        Scanner input = new Scanner(System.in);
        System.out.println("=====Pleas enter your phone information=====");
        System.out.println("What is the serial number?: ");
        int serialNumber = input.nextInt();
        input.nextLine();
        System.out.println("What model is your phone?: ");
        String model = input.nextLine();
        System.out.println("Who is the carrier?: ");
        String carrier = input.nextLine();
        System.out.println("what is your phone number?: ");
        String phonNumber = input.nextLine();
        System.out.println("Who is the owner of the phone?: ");
        String owner = input.nextLine();

        input.close();
        // getting and setting

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phonNumber);
        phone.setOwner(owner);

        System.out.println("Your serial: " + phone.getSerialNumber());
        System.out.println("Your model: " + phone.getModel());
        System.out.println("Your carrier: " + phone.getCarrier());
        System.out.println("Your phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }
}
