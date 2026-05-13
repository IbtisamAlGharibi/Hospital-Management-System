package Util;

import java.util.Scanner;

public class InputHandler {

    public void getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        prompt = scanner.nextLine();
    }

    public void getIntInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        prompt = String.valueOf(scanner.nextInt());
    }

    public int getIntInput(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {

            System.out.print(prompt);
            number = scanner.nextInt();

            if (number >= min && number <= max) {
                return number;
            }

            System.out.println("Invalid number. Try again.");
        }
    }

}
