package set3;

import java.util.Scanner;

class Player {
    String name;
    int number;
    int age;
    double strikeRate;

    Player(String name, int number, int age, double strikeRate) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.strikeRate = strikeRate;
    }

    void display() {
        System.out.println("Name: " + name + ", Number: " + number + ", Age: " + age + ", Strike Rate: " + strikeRate);
    }
}

class PlayerManager {
    static Player[] players = new Player[15];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Player Management System ======");
            System.out.println("1. Search Player");
            System.out.println("2. Bubble Sort by Strike Rate");
            System.out.println("3. Insert Player");
            System.out.println("4. Delete Player");
            System.out.println("5. Display All Players");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1 -> searchPlayer(sc);
                case 2 -> bubbleSort();
                case 3 -> insertPlayer(sc);
                case 4 -> deletePlayer(sc);
                case 5 -> displayAll();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void searchPlayer(Scanner sc) {
        System.out.println("Search by: 1) Name 2) Number");
        int opt = sc.nextInt();
        sc.nextLine(); // consume newline
        boolean found = false;

        if (opt == 1) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();
            for (int i = 0; i < count; i++) {
                if (players[i].name.equalsIgnoreCase(name)) {
                    players[i].display();
                    found = true;
                }
            }
        } else if (opt == 2) {
            System.out.print("Enter player number: ");
            int number = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (players[i].number == number) {
                    players[i].display();
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Player not found.");
        }
    }

    static void bubbleSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (players[j].strikeRate > players[j + 1].strikeRate) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        System.out.println("Players sorted by Strike Rate.");
    }

    static void insertPlayer(Scanner sc) {
        if (count >= 15) {
            System.out.println("Cannot insert more players. Maximum limit reached.");
            return;
        }

        System.out.print("Enter player name: ");
        String name = sc.nextLine();
        System.out.print("Enter player number: ");
        int number = sc.nextInt();
        System.out.print("Enter player age: ");
        int age = sc.nextInt();
        System.out.print("Enter player strike rate: ");
        double strikeRate = sc.nextDouble();

        players[count++] = new Player(name, number, age, strikeRate);
        System.out.println("Player inserted successfully.");
    }

    static void deletePlayer(Scanner sc) {
        System.out.println("Delete by: 1) Name 2) Number");
        int opt = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        if (opt == 1) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();
            for (int i = 0; i < count; i++) {
                if (players[i].name.equalsIgnoreCase(name)) {
                    for (int j = i; j < count - 1; j++) {
                        players[j] = players[j + 1];
                    }
                    count--;
                    found = true;
                    System.out.println("Player deleted successfully.");
                    break;
                }
            }
        } else if (opt == 2) {
            System.out.print("Enter player number: ");
            int number = sc.nextInt();
            for (int i = 0; i < count; i++) {
                if (players[i].number == number) {
                    for (int j = i; j < count - 1; j++) {
                        players[j] = players[j + 1];
                    }
                    count--;
                    found = true;
                    System.out.println("Player deleted successfully.");
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Player not found.");
        }
    }

    static void displayAll() {
        if (count == 0) {
            System.out.println("No players to display.");
            return;
        }
        System.out.println("=== All Players ===");
        for (int i = 0; i < count; i++) {
            players[i].display();
        }
    }
}
