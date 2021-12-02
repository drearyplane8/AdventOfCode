package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Day1SonarSweep extends Challenge {

    List<String> input;
    int increases;

    @Override
    public void ReadInput(String filename) throws IOException {
        input = Files.readAllLines(Paths.get(filename));
    }

    public void run(){


        try { ReadInput("day1input"); } catch (IOException ignored){}

        //some magic to convert to an integer list
        List<Integer> inputAsInts = input.stream().map(Integer::parseInt).collect(Collectors.toList());

        for(int i = 1; i < inputAsInts.size(); i++){
            if(inputAsInts.get(i) > inputAsInts.get(i-1)) increases++;
        }

        System.out.println("Increases: " + increases );

    }

    public Day1SonarSweep(){};

}
