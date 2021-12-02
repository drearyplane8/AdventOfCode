package com.company;

import java.io.IOException;
import java.util.List;

public class Day2Part1 extends Challenge {

    List<String> input;

    int hpos = 0, depth = 0;

    public void SetUpInput() throws IOException{
        input = ReadLines("day2");
    }


    public void run() {
        try {
            SetUpInput();
        } catch (IOException ignored){}

        for (String command : input) {
            String[] cmd = command.split(" ");



            int amount = Integer.parseInt(cmd[1]);

            System.out.println(cmd[0]);

            switch (cmd[0]) {
                case "forward" -> hpos += amount;
                case "down" -> depth += amount;
                case "up" -> depth -= amount;
            }
        }
        System.out.println("Final hozpos: " + hpos);
        System.out.println("Final depth: " + depth);

        System.out.println("Result = " + (hpos * depth));
    }
}
