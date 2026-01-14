package com.tss.test;

import java.util.Scanner;

public class SmartCityUtilityControlSystem {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        while(true){

            System.out.println("::::::::::::WELCOME TO SMART CITY UTILITY CONTROL SYSTEM::::::::::::");
            System.out.println("Main Menu:");
            System.out.println("1. Electricity Service");
            System.out.println("2. Water Service");
            System.out.println("3. Internet Service");
            System.out.println("4. Exit");

            System.out.println("Enter your option from Menu:");
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    electricityService();
                    break;
                case 2:
                    waterService();
                    break;
                case 3:
                    internetService();
                    break;
                case 4 :
                    scanner.close();
                    return;
                default:
                    System.out.println("Enter the valid input from 1 to 4");
            }
        }

    }

    public static void electricityService(){

        while(true){
            System.out.println("---------------ELECTRICITY SERVICE---------------");
            System.out.println("-> Submenu:");
            System.out.println("1. Domestic Connection");
            System.out.println("2. Commercial Connection");
            System.out.println("3. Industrial Connection");
            System.out.println("4. Back");

            System.out.println("Enter your option from Menu:");
            int choice= scanner.nextInt();

            switch (choice) {
                case 1:
                    domesticConnection();
                    break;

                case 2:
                    commercialConnection();
                    break;
                case 3:
                    industrialConnection();
                    break;
                case 4 :
                    return;
                default:
                    System.out.println("Enter the valid input from 1 to 4");
            }
        }

    }

    public static void industrialConnection(){
        System.out.println("Enter Unit Consumed :");
        int units = scanner.nextInt();
        float energy_charge = 0;
        int fixed_charge = 500;

        if (units < 0) {
            System.out.println("Invalid Value Of Units!");
            return;
        } else {
            energy_charge = units * 12;
        }
        float rebate = 0;
        if (units > 1000) {
            rebate = energy_charge * 0.15f;
        }
        electricityBillDisplay("Industrial", units, energy_charge, fixed_charge, rebate);

    }

    public static void commercialConnection(){
        System.out.println("Enter Unit Consumed :");
        int units=scanner.nextInt();
        float energy_charge=0;
        int fixed_charge=150;

        if(units<0){
            System.out.println("Invalid Value Of Units!");
            return;
        } else if (units<=200) {
            energy_charge=units*5;
        } else if (units<=500) {
            energy_charge=(200*5)+((units-200)*7);
        }else{
            energy_charge=(200*5)+(300*7)+((units-500)*10);
        }
        electricityBillDisplay("Commercial",units,energy_charge,fixed_charge,0);
    }

    public static void domesticConnection(){
        System.out.println("Enter Unit Consumed :");
        int units = scanner.nextInt();
        float energy_charge = 0;
        int fixed_charge = 50;

        if (units < 0) {
            System.out.println("Invalid Value Of Units!");
            return;
        } else if (units <= 100) {
            energy_charge = units * 2;
        } else if (units <= 300) {
            energy_charge = (100*2)+((units-100)*3);
        } else {
            energy_charge = (100*2)+(200*3)+((units-300)*5);
        }
        float extra_charge = 0;
        if (energy_charge > 2000) {
            extra_charge = energy_charge * 0.1f;
        }
        electricityBillDisplay("Domestic", units, energy_charge, fixed_charge, extra_charge);
    }

    public static void electricityBillDisplay(String connection_type,int units,float energy_charge,int fixed_charge,float extra_charge){

        System.out.print("Connection Type: "+connection_type+"\n");
        System.out.print("Units: "+units+"\n");
        System.out.print("Energy Charge: "+energy_charge+"\n");
        System.out.print("Fixed Charge: "+fixed_charge +"\n");
        System.out.print("Extra/Rebate "+extra_charge +"\n");
        System.out.print("TOTAL BILL: Rs. "+(energy_charge+fixed_charge+extra_charge) + "\n");

    }

    public static void waterService(){

        while(true){
            System.out.println("---------------WATER SERVICE----------------");
            System.out.println("-> Submenu:");
            System.out.println("1. Residential");
            System.out.println("2. Society");
            System.out.println("3. Factory");
            System.out.println("4. Back");

            System.out.println("Enter your option from Menu:");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter number of Person: ");
                    int person=scanner.nextInt();

                    float residential_bill=0;
                    residential_bill=person*30;

                    if(residential_bill>3000){
                        residential_bill+=residential_bill*0.08f;
                    }
                    System.out.println("Total Water Bill: Rs. "+residential_bill);
                    break;
                case 2:

                    System.out.println("Enter number of Person: ");
                    int taps=scanner.nextInt();

                    float society_bill=0;
                    society_bill=taps*25;

                    if(society_bill>3000){
                        society_bill+=society_bill*0.08f;
                    }
                    System.out.println("Total Water Bill: Rs. "+society_bill);
                    break;
                case 3:
                    System.out.println("Enter number of Machine: ");
                    int machines=scanner.nextInt();

                    float factory_bill=0;
                    factory_bill=machines*100;

                    if(factory_bill>3000){
                        factory_bill+=factory_bill*0.08f;
                    }
                    System.out.println("Total Water Bill: Rs. "+factory_bill);
                    break;

                case 4 :
                    return;
                default:
                    System.out.println("Enter the valid input from 1 to 4");
            }
        }


    }


    public static void internetService(){
        while(true){
            System.out.println("---------------INTERNET SERVICE---------------");
            System.out.println("-> Submenu:");
            System.out.println("1. Study Plan");
            System.out.println("2. Home Plan");
            System.out.println("3. Business Plan");
            System.out.println("4. Back");

            System.out.println("Enter your option from Menu:");
            int choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter your duration (1,3,6) months: ");
                    int studentPlan_months= scanner.nextInt();
                    switch(studentPlan_months){
                        case 1:
                            System.out.println("Your Total Internet Bill for "+studentPlan_months+" month: Rs. "+299);
                            break;
                        case 3:
                            System.out.println("Your Total Internet Bill for "+studentPlan_months+" month: Rs. "+799);
                            break;
                        case 6:
                            System.out.println("Your Total Internet Bill(with 5% discount) for "+studentPlan_months+" month: Rs. "+(1499-(1499*0.05)));
                            break;
                        default:
                            System.out.println("Enter valid value of month from (1,3,6)");

                    }
                    break;

                case 2:

                    System.out.println("Enter your duration (1,3,6) months: ");
                    int homePlan_months = scanner.nextInt();
                    switch (homePlan_months) {
                        case 1:
                            System.out.println("Your Total Internet Bill for " + homePlan_months + " month: Rs. " + 499);
                            break;
                        case 3:
                            System.out.println("Your Total Internet Bill for " + homePlan_months + " month: Rs. " + 1399);
                            break;
                        case 6:
                            System.out.println("Your Total Internet Bill(with 5% discount) for " + homePlan_months + " month: Rs. " + (2699 - (2699 * 0.05)));
                            break;
                        default:
                            System.out.println("Enter valid value of month from (1,3,6)");

                    }
                    break;
                case 3:
                    System.out.println("Enter your duration (1,3,6) months: ");
                    int businessPlan_months = scanner.nextInt();
                    switch (businessPlan_months) {
                        case 1:
                            System.out.println("Your Total Internet Bill for " + businessPlan_months + " month: Rs. " + 999);
                            break;
                        case 3:
                            System.out.println("Your Total Internet Bill for " + businessPlan_months + " month: Rs. " + 2799);
                            break;
                        case 6:
                            System.out.println("Your Total Internet Bill(with 5% discount) for " + businessPlan_months + " month: Rs. " + (5499 - (5499 * 0.05)));
                            break;
                        default:
                            System.out.println("Enter valid value of month from (1,3,6)");

                    }
                    break;
                case 4 :
                    return;
                default:
                    System.out.println("Enter the valid input from 1 to 4");
            }
        }

    }
}
