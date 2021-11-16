package com.company;

import com.company.controllers.FileController;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Leer archivo");
        System.out.println("2. Escribir archivo");
        System.out.print("Opción: ");
        int option = scanner.nextInt();
        FileController fileController = new FileController();
        try {
            switch (option) {
                case 1:
                    fileController.readFile();
                    break;
                case 2:
                    fileController.writeFile();
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
