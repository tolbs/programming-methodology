package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //split into words and turn them into lowercase
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        //parse the input
        InputParser inputParser = new InputParser();
        ParsedQuery parsedQuery = InputParser.parseInput(words);

        //print the result
        System.out.println(parsedQuery.getWord());
        System.out.println(parsedQuery.getPartOfSpeech());
        System.out.println(parsedQuery.getIsDistinct());
        System.out.println(parsedQuery.getIsReversed());
    }
}
