package com.company.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
    private final String path = "./assets/example.txt";

    public void readFile() throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        System.out.println("====> Start File");
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        System.out.println("====> End File");
        scanner.close();
    }

    public void writeFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el texto:");
        String text = scanner.nextLine();
        FileWriter myWriter = new FileWriter(path);
        myWriter.write(text);
        myWriter.close();
        System.out.println("texto guardado correctamente");
    }
}
