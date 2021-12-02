package com.company;

import java.util.HashMap;

public class Main {

    public static Day[] days = new Day[]{
       new Day(new Day1SonarSweep(), new Day1SonarSweepPart2()),
            new Day(new Day2Part1(), null)
    };

    public static void main(String[] args) {
        days[0].day1.run();
        days[0].day2.run();

        days[1].day1.run();
    }
}
