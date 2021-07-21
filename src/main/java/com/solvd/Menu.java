package com.solvd;

import com.solvd.body.Cabriolet;
import com.solvd.body.Coupe;
import com.solvd.body.Minivan;
import com.solvd.body.Sedan;
import com.solvd.exceptions.DriverException;
import com.solvd.utils.Authentification;

import java.util.Scanner;

public class Menu {


    public Menu() {
    }

    public void showMenu() {
        Authentification auth = new Authentification();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = in.nextLine();
        System.out.println("Enter your password: ");
        String password = in.nextLine();
        auth.setAuthentification("src/main/resources/config.properties", "email", "5656");


        try {
            DriverException.getDriverException(19);

            System.out.println("Choose your drive experience:" + "\n" +
                    " 1: 0-2 - bad experience, \n" +
                    " 2: 3-5 - middle experience, \n" +
                    " 3: 6-8 - good experience");

            int yearsExperience = in.nextInt();

            switch (yearsExperience) {
                case 1:
                    System.out.println("You can choose type of Sedan");
                    Sedan sedan = new Sedan();
                    sedan.showSedanNames();
                    int type = in.nextInt();

                    switch (type) {
                        case 1:
                            System.out.println("Congrats! You choose Mazda!");
                            break;
                        case 2:
                            System.out.println("Congrats! You choose Honda");
                            break;
                        case 3:
                            System.out.println("Congrats! You choose BMW");
                            break;
                        case 4:
                            System.out.println("Congrats! You choose Citroen");
                            break;
                        case 5:
                            System.out.println("Congrats! You choose Opel");
                            break;
                        default:
                            System.out.println("Incorrect value, try again, please");
                            break;

                    }
                    break;


                case 2:

                    System.out.println("You can choose Sedan or Minivan:" + "\n" +
                            "1: Sedan, \n" +
                            "2: Minivan");

                    int carBody = in.nextInt();

                    switch (carBody) {
                        case 1:
                            Sedan sedan1 = new Sedan();
                            System.out.println("You choose Sedan, please, choose car type now");
                            sedan1.showSedanNames();
                            break;
                        case 2:
                            Minivan minivan = new Minivan();
                            System.out.println("You choose Minivan, please, choose car type now");
                            minivan.showMinivanNames();
                            break;
                        default:
                            System.out.println("Incorrect value, try again");
                            break;
                    }

                    int carType = in.nextInt();

                    switch (carType) {
                        case 1:
                            Sedan sedan1 = new Sedan();
                            sedan1.showSedanNames();
                            System.out.println("Congrats! You choose Mazda!");
                            break;
                        case 2:
                            System.out.println("Congrats! You choose Honda!");
                            break;
                        case 3:
                            System.out.println("Congrats! You choose BMW");
                            break;
                        case 4:
                            System.out.println("Congrats! You choose Citroen");
                            break;
                        case 5:
                            System.out.println("Congrats! You choose Opel");
                            break;
                        default:
                            System.out.println("Incorrect value, try again, please");
                            break;
                    }
                {
                    int carTypeMinivan = in.nextInt();

                    switch (carTypeMinivan) {
                        case 1:
                            System.out.println("Congrats! You choose Minivan Volkswagen");
                            break;
                        case 2:
                            System.out.println("Congrats! You choose Minivan Mercedes");
                            break;
                        case 3:
                            System.out.println("Congrats! You choose Minivan Renault");
                            break;
                        case 4:
                            System.out.println("Congrats! You choose Minivan Fiat");
                            break;
                        case 5:
                            System.out.println("Congrats! You choose Minivan Geely");
                            break;
                        default:
                            System.out.println("Incorrect value, try again, please");
                            break;
                    }
                    break;
                }
                case 3:
                    System.out.println("You can choose Cabriolet or Coupe" + "\n" +
                            "1: Cabriolet, \n" +
                            "2: Coupe");

                    int carBodyExp = in.nextInt();
                    switch (carBodyExp) {
                        case 1:
                            Cabriolet cabriolet = new Cabriolet();
                            System.out.println("You choose Cabriolet, please, choose car type now");
                            cabriolet.showCabrioletNames();
                            break;
                        case 2:
                            Coupe coupe = new Coupe();
                            System.out.println("You choose Coupe, please, choose car type now");
                            coupe.showCoupeNames();
                            break;
                        default:
                            System.out.println("Incorrect value, try again");
                            break;
                    }

                    int carTypeCabriolet = in.nextInt();

                    switch (carTypeCabriolet) {
                        case 0:
                            Cabriolet cabriolet = new Cabriolet();
                            cabriolet.showCabrioletNames();
                        case 1:
                            System.out.println("Congrats! You choose Lexus!");
                            break;
                        case 2:
                            System.out.println("Congrats! You choose Audi!");
                            break;
                        case 3:
                            System.out.println("Congrats! You choose Mini");
                            break;
                        case 4:
                            System.out.println("Congrats! You choose Peugeut");
                            break;
                        case 5:
                            System.out.println("Congrats! You choose Porshe");
                            break;
                        default:
                            System.out.println("Incorrect value, try again, please");
                            break;
                    }

                    int carTypeCoupe = in.nextInt();

                    switch (carTypeCoupe) {
                        case 1:
                            System.out.println("Congrats! You choose Nissan");
                            break;
                        case 2:
                            System.out.println("Congrats! You choose Rolls-Royce");
                            break;
                        case 3:
                            System.out.println("Congrats! You choose Toyota");
                            break;
                        case 4:
                            System.out.println("Congrats! You choose Acura");
                            break;
                        case 5:
                            System.out.println("Congrats! You choose Maserati");
                            break;
                        default:
                            System.out.println("Incorrect value, try again, please");
                            break;
                    }
                    break;

            }


        } catch (DriverException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getAge());
        }
    }}