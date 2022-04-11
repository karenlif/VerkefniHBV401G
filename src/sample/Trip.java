package sample;

import java.time.LocalDate;
import java.util.Date;

public class Trip {
    public Trip(int id, String name, double price, String date) {
        this.id = id; //ferða id gæti þess vegna verið staðsetning
        this.name = name; //nafnið á ferðinni
        this.price = price;
        this.date = date; //dagsetning og tími?
    }

    private int id;
    private String name;
    private double price;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}



