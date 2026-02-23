import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Take user input using JOptionPane and store in variable

        String name = JOptionPane.showInputDialog("Enter Restaurant Name: ");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter Average Wait Time in Minutes (ex. 30): "));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Rating (ex. 0.0-5.0 Stars): "));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Average Cost (ex. 12.50): "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Distance From You In Miles (ex. 5.0): "));
        String hoursOpen = JOptionPane.showInputDialog("Enter Hours of Operation (ex. am-pm): ");

        // Instantiate Restaurant object with those variables
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        Restaurant userRestaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);
        System.out.println(userRestaurant);
        

        // Add User's Restaurant Object to the Array List
        restaurantList.add(userRestaurant);
    }
}
