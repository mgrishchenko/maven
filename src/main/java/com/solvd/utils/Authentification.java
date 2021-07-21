package com.solvd.utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Authentification {

    public String getEmail(String path, String email) {

        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            properties.load(fis);
            fis.close();
            return properties.getProperty(email);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return "default";
    }
    public String getPassword(String path, String password) {

        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            properties.load(fis);
            fis.close();
            return properties.getProperty(password);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return "default";
    }

    public void setAuthentification(String path, String email, String password) {

        Properties properties = new Properties();
        try {
            FileOutputStream fos;
            fos = new FileOutputStream(path);
            properties.setProperty(email,password);
            properties.store(fos, "comments");
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}


