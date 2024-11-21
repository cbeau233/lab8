package com.example.lab8;
import java.util.Arrays;
import java.util.List;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        Character[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        List<Character> numberList = Arrays.asList(numbers);



        /*if (password.strip().length() < 10) {
            return false;
        }*/


        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            //if (numberList.contains(c)) hasNumber = true;

            // If both conditions are met, the password is valid
            if (hasUpperCase && hasLowerCase /*&& hasNumber*/) return true;
        }
        return false;
    }
}