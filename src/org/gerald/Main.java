package org.gerald;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Patient patient = new Patient("Geris",  65,
        new Eye( "Left Eye", "Normal", "Blue", true),
                new Eye( "Right Eye", "Normal", "Blue", true),
                new Heart("Heart", "Normal", 56),
                new Skin("Skin", "Burned", "white", 40),
                new Stomach("Stomach", "PUD", false));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an Option: " +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Skin" +
                    "\n\t5. Stomach");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart beat");
                    if(scanner.nextInt() == 1) {
                        System.out.println("Enter the new heart beat");
                        int newHeartBeat = scanner.nextInt();

                        patient.getHeart().setRate(newHeartBeat);
                        System.out.println("Your new heart rate is:" + patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");

                    if(scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
