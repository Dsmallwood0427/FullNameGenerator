package com.pluralsight;

import java.util.Scanner;

public class FullNameApp {
    public static void main(String[] args) {
        String fullname = "Glen Williams";

        String fullname = "Glen C. Williams";

        String fullname = "Glen Williams,  phd ";
        fullname = fullname.trim();

        String fullname = "Glen C. Williams, PhD"

        String stringy = "";
        Scanner scanner = new Scanner(System.in);


        System.out.println(" What is your first name: ");
        String firstname = "Glen"
        String firstname = scanner.nextLine();


        System.out.println("What is your last name: ");
        String lastname = "Williams"
        String lastname = scanner.nextLine();


        System.out.println("What is your middle initial:");
        String middleinitial = "C."
        String middleinitial  = scanner.nextLine();


        System.out.println("Suffix:");
        String Suffix = ",PhD"
        String suffix  = scanner.nextLine();

        String fullname = firstname + lastname + middleinitial + suffix;
        System.out.println("Your fullname is: + fullname");
        String fullname = "Glen C. Williams, PhD"
