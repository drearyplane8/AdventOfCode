package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day1SonarSweepPart2 extends Challenge {

    List<String> input;
    int increases;

    @Override
    public void ReadInput(String filename) throws IOException {
        input = Files.readAllLines(Paths.get(filename));
    }

    @Override
    public void run() {

        try {
            ReadInput("day1input");
        } catch (IOException ignored) {
        }

        //some magic to convert to an integer list
        List<Integer> inputAsInts = input.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> slidingWindows = new ArrayList<>();
        int increasingSlidingWindows = 0;

        //iterate over the int list to get all the sliding windows.
        for (int i = 0; i < input.size() - 2; i++) {
            slidingWindows.add(inputAsInts.get(i) + inputAsInts.get(i + 1) + inputAsInts.get(i + 2));
        }
        //iterate over the sliding windows
        for (int i = 1; i < slidingWindows.size(); i++) {
            if (slidingWindows.get(i) > slidingWindows.get(i - 1)) increasingSlidingWindows++;
        }
        System.out.println(increasingSlidingWindows);
    }
}
