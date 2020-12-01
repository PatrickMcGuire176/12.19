package com.company;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        int counter = 0;
        try (Scanner scanner = new Scanner(new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt").openStream())) {
            while (scanner.hasNext()) {
                if (!scanner.next().equals("--"))
                    counter++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
