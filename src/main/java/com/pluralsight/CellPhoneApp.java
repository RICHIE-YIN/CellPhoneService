package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cell = new CellPhone();
        System.out.println("What is the serial number?");
        cell.setSerialNumber(Long.parseLong(scanner.nextLine()));
        System.out.println("What model is the phone?");
        cell.setModel(scanner.nextLine());
        System.out.println("Who is the carrier?");
        cell.setCarrier(scanner.nextLine());
        System.out.println("What is the phone number?");
        cell.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        cell.setOwner(scanner.nextLine());

        System.out.println("serial number: " + cell.getSerialNumber());
        System.out.println("model: " + cell.getModel());
        System.out.println("carrier: " + cell.getCarrier());
        System.out.println("phone number: " + cell.getPhoneNumber());
        System.out.println("owner: " + cell.getOwner());
    }


}
