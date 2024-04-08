package com.sirorlando;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAdventureGame {

    private static Map<Integer, Room> rooms; // Mapping of room IDs to Room objects
    private static int currentRoomId; // ID of the current room
    private static Scanner scanner;


    public static void main(String[] args) {

        initializeGame();

        /* Clear the console screen in preperation for the game!
         *  '\033[H'  - Moves the cursor to the upper-left corner of the screen.
         *  '\033[2J' - Clears the entire screen.
         *  flush()   - Flushes the output stream to ensure the clearing operation takes effect immediately.
         */ 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n\n Hello, world! This is my text adventure game.");
        System.out.println("Type 'help' for a list of commands.");

        // Game loop
        while (true) {
            Room currentRoom = rooms.get(currentRoomId);
            System.out.println();
            System.out.println(currentRoom.getTitle());
            System.out.println(currentRoom.getDescription());

            System.out.print("Enter a command: ");
            String input = scanner.nextLine().toLowerCase();
            processCommand(input);
        }
    }



    // Initialize game data
    private static void initializeGame() {
        // Create rooms
        rooms = new HashMap<>();
        rooms.put(1, new Room("Forest", "You are in a dense forest."));
        rooms.put(2, new Room("Cave Entrance", "You stand at the entrance of a dark cave."));

        // Define exits
        rooms.get(1).addExit("N", 2); // Example: Exit north from forest to cave entrance
        rooms.get(2).addExit("S", 1); // Example: Exit south from cave entrance to forest

        // Initialize current room
        currentRoomId = 1;

        // Initialize scanner for user input
        scanner = new Scanner(System.in);
    }

    // Process player command
    private static void processCommand(String input) {
        switch (input) {
            case "help":
                displayHelp();
                break;
            case "look":
                displayRoomDescription();
                break;
            // Add more commands as needed...
            default:
                System.out.println("Invalid command. Type 'help' for a list of commands.");
        }
    }

    // Display list of available commands
    private static void displayHelp() {
        System.out.println("Available commands:");
        System.out.println("  help - Display list of commands");
        System.out.println("  look - Examine your surroundings");
        // Add more commands as needed...
    }

    // Display description of current room
    private static void displayRoomDescription() {
        Room currentRoom = rooms.get(currentRoomId);
        System.out.println(currentRoom.getDescription());

        // Display objects in the room
        if (!currentRoom.getObjects().isEmpty()) {
            System.out.println("Objects in the room:");
            for (String object : currentRoom.getObjects().keySet()) {
                System.out.println("- " + object);
            }
        }
    }


}