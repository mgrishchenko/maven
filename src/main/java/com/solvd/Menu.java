package com.solvd;

import com.solvd.body.Cabriolet;
import com.solvd.body.Coupe;
import com.solvd.body.Minivan;
import com.solvd.body.Sedan;
import com.solvd.exceptions.DriverException;
import com.solvd.utils.Authentification;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Menu {
    private final static Logger LOGGER = Logger.getLogger(Menu.class);


    public Menu() {
    }

    public void showMenu()  {

        Driver driver = new Driver();
        driver.setId(1);
        driver.setFirstName("Alan");
        driver.getFirstName();
        driver.setLastName("Cooper");

        JsonToJava jsonAction = new JsonToJava();
        String jsonStr = jsonAction.convertToJsonString(driver);
        LOGGER.info(jsonStr);

        String jsonStr1 = "{\n" +
                "  \"id\": 1,\n" +
                "  \"firstName\" : \"Bob\",\n" +
                "  \"lastName\" : \"Fox\"\n" +
                "}";

        Driver driver1 = jsonAction.convertJsonToPojo(jsonStr1);
        LOGGER.info("Name Pojo: " +driver1.getFirstName());
        LOGGER.info("LastName Pojo: " + driver1.getLastName());



        Authentification auth = new Authentification();
        Scanner in = new Scanner(System.in);
        LOGGER.info("Enter your email: ");
        String email = in.nextLine();
        LOGGER.info("Enter your password: ");
        String password = in.nextLine();
        auth.setAuthentification("src/main/resources/config.properties", "email", "5656");


        try {
            DriverException.getDriverException(19);

            LOGGER.info("Choose your drive experience:" + "\n" +
                    " 1: 0-2 - bad experience, \n" +
                    " 2: 3-5 - middle experience, \n" +
                    " 3: 6-8 - good experience");

            int yearsExperience = in.nextInt();

            switch (yearsExperience) {
                case 1:
                    LOGGER.info("You can choose type of Sedan");
                    Sedan sedan = new Sedan();

                    sedan.showSedanNames();
                    int type = in.nextInt();

                    switch (type) {
                        case 1:
                            LOGGER.info("Congrats! You choose Mazda!");
                            break;
                        case 2:
                            LOGGER.info("Congrats! You choose Honda");
                            break;
                        case 3:
                            LOGGER.info("Congrats! You choose BMW");
                            break;
                        case 4:
                            LOGGER.info("Congrats! You choose Citroen");
                            break;
                        case 5:
                            LOGGER.info("Congrats! You choose Opel");
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again, please");
                            break;

                    }
                    break;


                case 2:

                    LOGGER.info("You can choose Sedan or Minivan:" + "\n" +
                            "1: Sedan, \n" +
                            "2: Minivan");

                    int carBody = in.nextInt();

                    switch (carBody) {
                        case 1:
                            Sedan sedan1 = new Sedan();
                            LOGGER.info("You choose Sedan, please, choose car type now");
                            sedan1.showSedanNames();
                            break;
                        case 2:
                            Minivan minivan = new Minivan();
                            LOGGER.info("You choose Minivan, please, choose car type now");
                            minivan.showMinivanNames();
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again");
                            break;
                    }

                    int carType = in.nextInt();

                    switch (carType) {
                        case 1:
                            Sedan sedan1 = new Sedan();
                            sedan1.showSedanNames();
                            LOGGER.info("Congrats! You choose Mazda!");
                            break;
                        case 2:
                            LOGGER.info("Congrats! You choose Honda!");
                            break;
                        case 3:
                            LOGGER.info("Congrats! You choose BMW");
                            break;
                        case 4:
                            LOGGER.info("Congrats! You choose Citroen");
                            break;
                        case 5:
                            LOGGER.info("Congrats! You choose Opel");
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again, please");
                            break;
                    }
                {
                    int carTypeMinivan = in.nextInt();

                    switch (carTypeMinivan) {
                        case 1:
                            LOGGER.info("Congrats! You choose Minivan Volkswagen");
                            break;
                        case 2:
                            LOGGER.info("Congrats! You choose Minivan Mercedes");
                            break;
                        case 3:
                            LOGGER.info("Congrats! You choose Minivan Renault");
                            break;
                        case 4:
                            LOGGER.info("Congrats! You choose Minivan Fiat");
                            break;
                        case 5:
                            LOGGER.info("Congrats! You choose Minivan Geely");
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again, please");
                            break;
                    }
                    break;
                }
                case 3:
                    LOGGER.info("You can choose Cabriolet or Coupe" + "\n" +
                            "1: Cabriolet, \n" +
                            "2: Coupe");

                    int carBodyExp = in.nextInt();
                    switch (carBodyExp) {
                        case 1:
                            Cabriolet cabriolet = new Cabriolet();
                            LOGGER.info("You choose Cabriolet, please, choose car type now");
                            cabriolet.showCabrioletNames();
                            break;
                        case 2:
                            Coupe coupe = new Coupe();
                            LOGGER.info("You choose Coupe, please, choose car type now");
                            coupe.showCoupeNames();
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again");
                            break;
                    }

                    int carTypeCabriolet = in.nextInt();

                    switch (carTypeCabriolet) {
                        case 0:
                            Cabriolet cabriolet = new Cabriolet();
                            cabriolet.showCabrioletNames();
                        case 1:
                            LOGGER.info("Congrats! You choose Lexus!");
                            break;
                        case 2:
                            LOGGER.info("Congrats! You choose Audi!");
                            break;
                        case 3:
                            LOGGER.info("Congrats! You choose Mini");
                            break;
                        case 4:
                            LOGGER.info("Congrats! You choose Peugeut");
                            break;
                        case 5:
                            LOGGER.info("Congrats! You choose Porshe");
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again, please");
                            break;
                    }

                    int carTypeCoupe = in.nextInt();

                    switch (carTypeCoupe) {
                        case 1:
                            LOGGER.info("Congrats! You choose Nissan");
                            break;
                        case 2:
                            LOGGER.info("Congrats! You choose Rolls-Royce");
                            break;
                        case 3:
                            LOGGER.info("Congrats! You choose Toyota");
                            break;
                        case 4:
                            LOGGER.info("Congrats! You choose Acura");
                            break;
                        case 5:
                            LOGGER.info("Congrats! You choose Maserati");
                            break;
                        default:
                            LOGGER.info("Incorrect value, try again, please");
                            break;
                    }
                    break;

            }


        } catch (DriverException e) {
            LOGGER.info(e.getMessage());
            LOGGER.info(e.getAge());
        }
    }}