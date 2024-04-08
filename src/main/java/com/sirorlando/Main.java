package com.sirorlando;

public class Main {
    public static void main(String[] args) {

        /* Clear the console screen in preperation for the game!
         *  '\033[H'  - Moves the cursor to the upper-left corner of the screen.
         *  '\033[2J' - Clears the entire screen.
         *  flush()   - Flushes the output stream to ensure the clearing operation takes effect immediately.
         */ 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n\n Hello, world! This is my text adventure game.");
        // Add your game logic here
    }
}