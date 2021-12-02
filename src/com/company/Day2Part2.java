package com.company;

import java.io.IOException;
import java.util.List;

public class Day2Part2 extends Challenge{

    List<String> input;

    int hpos = 0, depth = 0, aim = 0;

    public void SetUpInput() throws IOException {
        input = ReadLines("day2");
    }

    public void run() {
        try {
            SetUpInput();
        } catch (IOException ignored){}

        for (String command : input) {
            String[] cmd = command.split(" ");

            int X = Integer.parseInt(cmd[1]);

            switch (cmd[0]) {
                case "forward" -> {
                    hpos += X;
                    depth += (aim * X);
                }
                case "down" -> aim += X;
                case "up" -> aim -= X;
            }
        }
        System.out.println("Final hozpos: " + hpos);
        System.out.println("Final depth: " + depth);

        System.out.println("Result = " + (hpos * depth));
    }

}
