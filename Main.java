package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* write a small java program to generate a Student ID Card*/
        int age;
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        age=scanner.nextInt();
        String blood_group=scanner.next();
        System.out.println("_________________________");
        System.out.println("  Name: "+name);
        System.out.println("  Age: "+age);
        System.out.println("  Blood Group: "+blood_group);
        System.out.println("_________________________");
        String group = null;
        if (age>=20) {
            
            group="RED";
        } else if (age>=15 && age<20) {
            group="BLUE";
        } else if (age>=10 && age<15) {
            group = "YELLOW";
        }
        System.out.println("  your group is "+group);
        System.out.println("_________________________");
        scanner.close();





    }
}
