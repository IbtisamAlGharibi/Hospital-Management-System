package Util;

import java.util.Scanner;

public class InputHandler {

    public void getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        prompt = scanner.nextLine();
    }
}
