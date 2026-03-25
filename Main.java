import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
    try {
        scanRestaurantFile(restaurants);
    }
    catch (FileNotFoundException e) {
        System.out.println(e);
    }
            printRandomRestaurant(restaurants);
        }

    private static void printRandomRestaurant(ArrayList<Restaurant> restaurants) {
    }


    public static void scanRestaurantFile(ArrayList<Restaurant> list) throws FileNotFoundException {
        File file = new File("src/restaurant.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            String name = scan.next();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avgPrice = scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen = scan.next();

            if (rating > 5) {
                rating = -1;
            }

            Restaurant restaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);
        }

        /**
         * Chooses a random Restaurant from an ArrayList and outputs the Restaurant
         * @param list ArrayList of Restaurants
         */

        //could not run when more organized (public static needed to be in main?)
        {
            Random randy = new Random();
            int numRestaurants = list.size();
            int randIndex = randy.nextInt(numRestaurants - 1);
            System.out.println(list.get(randIndex));
        }


    }

    }