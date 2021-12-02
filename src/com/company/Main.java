package com.company;

import java.util.HashMap;

public class Main {

    public static Day[] days = new Day[]{
       new Day(new Day1SonarSweep(), new Day1SonarSweepPart2()),
            new Day(new Day2Part1(), new Day2Part2())
    };

    public static void main(String[] args) {

        for(Day day : days){
            day.day1.run();
            day.day2.run();
            System.out.println("-------------------------------");
        }

    }
}
