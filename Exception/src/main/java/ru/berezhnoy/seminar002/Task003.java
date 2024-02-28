package ru.berezhnoy.seminar002;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task003 {
    public static void main(String[] args) {
        File file = new File("Exception/src/main/java/ru/berezhnoy/seminar002/out.txt");
        Map<String, String> students = convertFileToCollection(file);
        System.out.println(students);

        System.out.println();

        String path = "Exception/src/main/java/ru/berezhnoy/seminar002/in.txt";
        readFile(convertCollectionToFile(validate(students), path));

    }

    public static Map<String, String> convertFileToCollection(File file) {
        Map<String, String> students = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                students.put(line.split("=")[0], line.split("=")[1]);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return students;
    }

    public static Map<String, String> validate(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("?"))
                map.replace(entry.getKey(), String.valueOf(entry.getKey().length()));
            else if (entry.getValue().matches("[^?[0-9]]")) {
                map.replace(entry.getKey(), "Bad argument");
//                throw new IllegalArgumentException("Bad argument");
            }
        }
        return map;
    }

    public static File convertCollectionToFile(Map<String, String> map, String path) {
        File file = new File(path);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bw.write(entry.getKey() + "=" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void readFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
