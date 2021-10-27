package com.company;

public class GenerateString implements com.company.StringInterface{
    @Override
    public String generateString() {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characters = "@#$%^&*";
        // create a super set of all characters
        String allCharacters = lowerCase + upperCase + numbers + characters;
        // initialize a string to hold result
        StringBuilder randomString = new StringBuilder();
        // loop for 100 times
        for (int i = 0; i < 100; i++) {
            // generate a random number between 0 and length of all characters
            int randomIndex = (int)(Math.random() * allCharacters.length());
            // retrieve character at index and add it to result
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();

    }

    @Override
    public int getNumber() {
        return 0;
    }

}
