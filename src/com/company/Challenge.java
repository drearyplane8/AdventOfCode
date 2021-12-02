package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Challenge {

    public int day;
    public String name;

    public void run(){
        System.out.println("Running default challenge");
    }

    public void ReadInput(String filename) throws IOException {
        System.out.println("Running default challenge ReadInput");
    }

    public List<String> ReadLines(String filename) throws IOException {
        return  Files.readAllLines(Paths.get(filename));
    }

    public Challenge(){}

}
