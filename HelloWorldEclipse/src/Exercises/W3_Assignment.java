package Exercises;

import java.util.*;

class InternetPlans {
    private String ispName;
    private String networkGen;
    private String dailyLimit;
    private String speed;
    private int price;
    private int validity;

    InternetPlans(String ispName, String networkGen, String dailyLimit, String speed, int price, int validity) {
        this.ispName = ispName;
        this.networkGen = networkGen;
        this.dailyLimit = dailyLimit;
        this.price = price;
        this.speed = speed;
        this.validity = validity;
    }

    public int getPrice() {
        return price;
    }

    public String getSpeed() {
        return speed;
    }

    public int getSpeedValue() {
        return Integer.parseInt(speed.replaceAll("[^0-9]", ""));    // Extract numeric part 
    } 

    public int getValidity() {
        return validity;
    }

    public String getNetworkGen() {
        return networkGen;
    }

    @Override
    public String toString() {
        return "InternetPlans [ispName=" + ispName + ", networkGen=" + networkGen + ", dailyLimit=" + dailyLimit
                + ", speed=" + speed + ", price= Rupees " + price + ", validity=" + validity + " Days]";
    }
}

public class  W3_Assignment {

    // Utility to print plans
    private static void printPlans(List<InternetPlans> plans) {
        for (InternetPlans p : plans) {
            System.out.println(p);
        }
    }

    // Suggest nearest plans when not found
    private static void suggestClosest(List<InternetPlans> isp, int index1) {
        int insertionPoint = -(index1) - 1;
        int bigger = insertionPoint;
        int smaller = insertionPoint - 1;

        if (bigger < isp.size()) {
            System.out.println("Closest bigger: " + isp.get(bigger));
        }
        if (smaller >= 0) {
            System.out.println("Closest smaller: " + isp.get(smaller));
        }
    }

    public static void main(String[] args) {
        List<InternetPlans> isp = new ArrayList<>();
        isp.add(new InternetPlans("Airtel", "4G", "1.5 GB/Day", "10Mbps", 349, 28));
        isp.add(new InternetPlans("Airtel", "4G", "1.5 GB/Day", "10Mbps", 699, 56));
        isp.add(new InternetPlans("Airtel", "4G", "1.5 GB/Day", "10Mbps", 899, 84));
        isp.add(new InternetPlans("Airtel", "5G", "2 GB/Day", "100Mbps", 399, 28));
        isp.add(new InternetPlans("Airtel", "5G", "2 GB/Day", "100Mbps", 799, 56));
        isp.add(new InternetPlans("Airtel", "5G", "2 GB/Day", "100Mbps", 999, 84));
        isp.add(new InternetPlans("Airtel", "6G", "Unlimited", "500Mbps", 499, 28));
        isp.add(new InternetPlans("Airtel", "6G", "Unlimited", "500Mbps", 949, 56));
        isp.add(new InternetPlans("Airtel", "6G", "Unlimited", "500Mbps", 1399, 84));
        isp.add(new InternetPlans("Jio", "4G", "Unlimited", "10Mbps", 849, 84));
        isp.add(new InternetPlans("Jio", "5G", "Unlimited", "500Mbps", 1299, 84));

        Scanner sc = new Scanner(System.in);

        //***** Comparators******************************************
        Comparator<InternetPlans> byPriceAsc = Comparator.comparing(InternetPlans::getPrice);
        Comparator<InternetPlans> byPriceDesc = Comparator.comparing(InternetPlans::getPrice).reversed();
        Comparator<InternetPlans> bySpeedAsc = Comparator.comparing(InternetPlans::getSpeedValue);
        Comparator<InternetPlans> bySpeedDesc = Comparator.comparing(InternetPlans::getSpeedValue).reversed();
        Comparator<InternetPlans> byValidity = Comparator.comparing(InternetPlans::getValidity);
        Comparator<InternetPlans> byNetwork = Comparator.comparing(InternetPlans::getNetworkGen);

        System.out.println("=== Welcome to Internet Plans App ===");

        //******************* Filtering Menu******************************
        while (true) {
            System.out.println("\nFilter Options:");
            System.out.println("1. Price Low to High");
            System.out.println("2. Price High to Low");
            System.out.println("3. Speed Low to High");
            System.out.println("4. Speed High to Low");
            System.out.println("5. Validity");
            System.out.println("6. Network Generation");
            System.out.println("7. Exit Filtering");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> { 
                	isp.sort(byPriceAsc); 
                    printPlans(isp); 
                }
                case 2 -> {
                	isp.sort(byPriceDesc); 
                	printPlans(isp); 
                	}
                case 3 -> { 
                	isp.sort(bySpeedAsc); 
                	printPlans(isp); 
                	}
                case 4 -> { 
                	isp.sort(bySpeedDesc); 
                	printPlans(isp);
                	}
                case 5 -> { 
                	isp.sort(byValidity); 
                	printPlans(isp);
                	}
                case 6 -> { 
                       isp.sort(byNetwork);
                       printPlans(isp); }
                case 7 -> {
                        System.out.println("Exiting Filtering..."); }
                default -> 
                       System.out.println("Invalid choice, try again!");
            }
            if (choice == 7) break;
        }

        // ***************************Searching Menu************************
        while (true) {
            System.out.println("\nSearch Options:");
            System.out.println("1. Search by Price");
            System.out.println("2. Search by Speed");
            System.out.println("3. Search by Validity");
            System.out.println("4. Exit Searching");

            int choice = sc.nextInt();
            if (choice == 4) {
                System.out.println("Exiting Searching...");
                break;
            }

            if (choice == 1) {
                isp.sort(byPriceAsc);
                System.out.print("Enter price to search: ");
                int x = sc.nextInt();
                int index = Collections.binarySearch(isp, new InternetPlans("", "", "", "", x, 0), byPriceAsc);
                if (index >= 0) System.out.println("Found: " + isp.get(index));
                else { 
                	System.out.println("Not Found! Nearet Possible Options are : "); 
                     suggestClosest(isp, index); }
            }

            else if (choice == 2) {
                isp.sort(bySpeedAsc);
                System.out.print("Enter speed (e.g. 100): ");
                int x = sc.nextInt();
                int index = Collections.binarySearch(isp,
                        new InternetPlans("", "", "", x + "Mbps", 0, 0), bySpeedAsc);
                if (index >= 0) System.out.println("Found: " + isp.get(index));
                else { 
                	System.out.println("Not Found! Nearet Possible Options are : "); 
                	suggestClosest(isp, index); }
            }

            else if (choice == 3) {
                isp.sort(byValidity);
                System.out.print("Enter validity (in days): ");
                int x = sc.nextInt();
                int index = Collections.binarySearch(isp,
                        new InternetPlans("", "", "", "", 0, x), byValidity);
                if (index >= 0) System.out.println("Found: " + isp.get(index));
                else { 
                	System.out.println("Not Found! Nearet Possible Options are : "); 
                	suggestClosest(isp, index); }
            }
        }

     
    }
}
