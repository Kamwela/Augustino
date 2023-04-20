import java.util.ArrayList;
import java.util.Scanner;

public class CrudApp {

    private static ArrayList<String> data = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Enter a command: (1) Insert, (2) Delete, (3) Update, (4) Read, (5) Exit");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Enter data to insert:");
                    String insertData = scanner.next();
                    insert(insertData);
                    break;
                case 2:
                    System.out.println("Enter index of data to delete:");
                    int deleteIndex = scanner.nextInt();
                    delete(deleteIndex);
                    break;
                case 3:
                    System.out.println("Enter index of data to update:");
                    int updateIndex = scanner.nextInt();
                    System.out.println("Enter new data:");
                    String newData = scanner.next();
                    update(updateIndex, newData);
                    break;
                case 4:
                    read();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
        scanner.close();
    }

    private static void insert(String data) {
        CrudApp.data.add(data);
        System.out.println("Data inserted successfully");
    }

    private static void delete(int index) {
        if (index >= 0 && index < data.size()) {
            CrudApp.data.remove(index);
            System.out.println("Data deleted successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void update(int index, String newData) {
        if (index >= 0 && index < data.size()) {
            CrudApp.data.set(index, newData);
            System.out.println("Data updated successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void read() {
        if (data.isEmpty()) {
            System.out.println("No data to display");
        } else {
            System.out.println("Data:");
            for (int i = 0; i < data.size(); i++) {
                System.out.println(i + ": " + data.get(i));
            }
        }
    }
}
