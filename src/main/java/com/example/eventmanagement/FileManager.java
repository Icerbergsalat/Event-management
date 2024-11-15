package com.example.eventmanagement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    public static void createFile(String name) throws IOException {
        Scanner input = new Scanner(System.in);
        File newFile = new File(name);
        if (newFile.createNewFile()) {
            System.out.println("File created: " + newFile.getName());
        } else {
            System.out.println("file already exists");
        }
    }

    public static ArrayList<String> readFile(String name) throws FileNotFoundException {
        File myObj = new File(name);
        Scanner myReader = new Scanner(myObj);
        ArrayList<String> data = new ArrayList<>();
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            data.add(line);
        }
        return data;
    }

    public static void writeToFile(String name, ArrayList<User> users) throws IOException {
        FileWriter myWriter = new FileWriter(name);
        for (User user: users){
            String data = user.getId() + " " + user.getUsername() + " " + user.getPassword();
            myWriter.write(data + "\n");
        }


        myWriter.close();
        System.out.println("succesfully wrote to file");
    }

    public static void writeToFile(String name, String test) throws IOException {
        FileWriter myWriter = new FileWriter(name);
        myWriter.write(test);
        myWriter.close();
        System.out.println("succesfully wrote to file");
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Filen " + fileName + " blev slettet.");
        } else {
            System.out.println("Filen kunne ikke slettes. Kontroller, om den eksisterer.");
        }
    }
}
