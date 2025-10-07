package NewExercise;

import java.util.*;


enum ContentCategory { TV_SHOWS, SPORTS, KIDS, RELIGIOUS, MOVIES }



//=================== CORE CLASSES ===================

//--- Content Class ---


class Content {
 private final int id;
 private final String title;
 private final ContentCategory category;

 public Content(int id, String title, ContentCategory category) {
     this.id = id; this.title = title; this.category = category;
 }

 public int getId() { return id; }
 public String getTitle() { return title; }

 @Override
 public String toString() {
     return "[" + id + "] " + title + "  " + category;
 }
}

// Abstract Plan (Abstraction + Inheritance) 
abstract class Plan {
 private final String name;
 private final int maxDevices;
 private final String quality;
 private final boolean downloads;

 public Plan(String name, int maxDevices, String quality, boolean downloads) {
     this.name = name; this.maxDevices = maxDevices;
     this.quality = quality; this.downloads = downloads;
 }

 public String getName() { return name; }
 public int getMaxDevices() { return maxDevices; }
 public String getQuality() { return quality; }
 public boolean canDownload() { return downloads; }

 // to be overridden
 public abstract boolean canStreamOn(String device);

 @Override
 public String toString() {
     return name + " [Devices=" + maxDevices + ", Quality=" + quality + ", Downloads=" + downloads + "]";
 }
}

//--- Concrete Plans (Polymorphism) ---
class BasicPlan extends Plan {
 public BasicPlan() { super("Basic", 1, "720p", false); }
 public boolean canStreamOn(String device) { return device.equalsIgnoreCase("mobile"); }
}
class StandardPlan extends Plan {
 public StandardPlan() { super("Standard", 2, "1080p", true); }
 public boolean canStreamOn(String device) { return device.equalsIgnoreCase("mobile") || device.equalsIgnoreCase("desktop"); }
}
class PremiumPlan extends Plan {
 public PremiumPlan() { super("Premium", 4, "4K", true); }
 public boolean canStreamOn(String device) { return true; } // all devices
}

//--- User Class (Encapsulation + Security) ---
class User {
 private final String username;
 private final String password;
 private final Plan plan;
 private boolean unlocked = false;

 public User(String username, String password, Plan plan) {
     this.username = username; this.password = password; this.plan = plan;
 }

 public String getUsername() { return username; }
 public Plan getPlan() { return plan; }

 public boolean checkPassword(String pass) { return password.equals(pass); }

 // secure view
 public void viewSecureAccount(Scanner sc) {
     if (!unlocked) {
         System.out.print("Enter PIN (1234 for demo): ");
         if (sc.nextLine().equals("1234")) unlocked = true;
         else { System.out.println(" Wrong PIN"); return; }
     }
     System.out.println(" Account Info → Username: " + username + " || Password: " + password);
 }
 public void lock() { unlocked = false; }
}

//--- OTT Platform Class (Composition: holds users & content) ---
class OTTPlatform {
 private final Map<String, User> users = new HashMap<>();
 private final Map<Integer, Content> contents = new LinkedHashMap<>();

 public OTTPlatform() {
     // seed content
     contents.put(1, new Content(1, "Detective Tales", ContentCategory.TV_SHOWS));
     contents.put(2, new Content(2, "World Cup Highlights", ContentCategory.SPORTS));
     contents.put(3, new Content(3, "Cartoon Fiesta",  ContentCategory.KIDS));
     contents.put(4, new Content(4, "Sacred Chants",  ContentCategory.RELIGIOUS));
     contents.put(5, new Content(5, "Blockbuster Rise",  ContentCategory.MOVIES));

     // seed users
     users.put("aman", new User("Aman", "pass123", new BasicPlan()));
     users.put("priya", new User("Priya", "pass456", new StandardPlan()));
 }

 // user management
 public void registerUser(String username, String password, Plan plan) {
     users.put(username.toLowerCase(), new User(username, password, plan));
 }
 public User login(String username, String password) {
     User u = users.get(username.toLowerCase());
     return (u != null && u.checkPassword(password)) ? u : null;
 }

 // content management
 public void showCatalog() {
     System.out.println("\n Content Catalog:");
     contents.values().forEach(System.out::println);
 }
 public void streamContent(User user, Scanner sc) {
     showCatalog();
     System.out.print("Enter Content ID to stream: ");
     int id = Integer.parseInt(sc.nextLine());
     Content c = contents.get(id);
     if (c == null) { System.out.println(" Invalid Content"); return; }

     System.out.print("Enter device (mobile/desktop/tv): ");
     String device = sc.nextLine().toLowerCase();

     if (user.getPlan().canStreamOn(device)) {
         System.out.println(" Streaming " + c.getTitle() + " in " + user.getPlan().getQuality() + " on " + device);
     } else {
         System.out.println(" Your plan (" + user.getPlan().getName() + ") does not allow streaming on " + device);
     }
 }
 public void downloadContent(User user, Scanner sc) {
     if (!user.getPlan().canDownload()) {
         System.out.println(" Downloads not allowed in " + user.getPlan().getName() + " plan");
         return;
     }
     showCatalog();
     System.out.print("Enter Content ID to download: ");
     int id = Integer.parseInt(sc.nextLine());
     Content c = contents.get(id);
     if (c != null) System.out.println(" Downloading " + c.getTitle() + " ... Done ");
 }
}

//--- MAIN APP ---
public class SimpleOTTApp {

 public static void main(String[] args) {
     OTTPlatform platform = new OTTPlatform();
     Scanner sc = new Scanner(System.in);

     System.out.println(" Welcome to Simple OTT Platform");
     mainMenu(platform, sc);

     sc.close();
 }

 // --- Main Menu ---
 private static void mainMenu(OTTPlatform platform, Scanner sc) {
     while (true) {
         System.out.println("\n--- MAIN MENU ----");
         System.out.println("1) Login");
         System.out.println("2) Register");
         System.out.println("3) Show Content Catalog");
         System.out.println("4) Exit");
         System.out.print(" Choose: ");

         switch (sc.nextLine().trim()) {
             case "1" -> handleLogin(platform, sc);
             case "2" -> handleRegister(platform, sc);
             case "3" -> platform.showCatalog();
             case "4" -> { System.out.println(" Goodbye!"); return; }
             default -> System.out.println(" Invalid option");
         }
     }
 }

 // --- Handle User Registration ---
 private static void handleRegister(OTTPlatform platform, Scanner sc) {
     System.out.print("Enter username: ");
     String username = sc.nextLine().trim();
     System.out.print("Enter password: ");
     String password = sc.nextLine().trim();

     System.out.println("Pick Plan: 1) Basic 2) Standard 3) Premium");
     Plan plan = switch (sc.nextLine().trim()) {
         case "1" -> new BasicPlan();
         case "2" -> new StandardPlan();
         case "3" -> new PremiumPlan();
         default -> new BasicPlan();
     };

     platform.registerUser(username, password, plan);
     System.out.println("User registered. Now you can login.");
 }

 // --- Handle Login ---
 private static void handleLogin(OTTPlatform platform, Scanner sc) {
     System.out.print("Username: ");
     String username = sc.nextLine().trim();
     System.out.print("Password: ");
     String password = sc.nextLine().trim();

     User user = platform.login(username, password);
     if (user == null) {
         System.out.println(" Invalid credentials");
         return;
     }

     System.out.println(" Welcome " + user.getUsername() + " [Plan: " + user.getPlan().getName() + "]");
     userMenu(user, platform, sc);
 }

 // --- User Menu ---
 private static void userMenu(User user, OTTPlatform platform, Scanner sc) {
     while (true) {
         System.out.println("\n==== USER MENU (" + user.getUsername() + ") ====");
         System.out.println("1) View Catalog");
         System.out.println("2) Stream Content");
         System.out.println("3) Download Content");
         System.out.println("4) View Secure Account Info");
         System.out.println("5) Logout");
         System.out.print(" Choose: ");

         switch (sc.nextLine().trim()) {
             case "1" -> platform.showCatalog();
             case "2" -> platform.streamContent(user, sc);
             case "3" -> platform.downloadContent(user, sc);
             case "4" -> user.viewSecureAccount(sc);
             case "5" -> { user.lock(); System.out.println(" Logged out."); return; }
             default -> System.out.println(" Invalid option");
         }
     }
 }
}