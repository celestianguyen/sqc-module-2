package chapter12;

import java.util.Scanner;

/**
 * # Problem
 *
 * - Write a program that allows the user to enter a string.
 * - Then check whether the string satisfies the following requirements:
 *
 * ### a. Validate Phone Number
 *
 * - Starts with `0` or `(+84)`.
 * - The next 2 digits can be: `32`, `33`, `34`, `35`, `36`, `37`, `38`, `39`.
 * - The next 7 characters must be digits.
 *
 * ### b. Validate Email
 *
 * - Contains characters from `A-Z` and `a-z`.
 * - Contains numeric characters.
 * - Can contain underscore `_`.
 * - Must contain `@`.
 * - The part before `@` must have 6 to 32 characters.
 * - The domain part after `@` is divided into two sections, and each section must contain 2 to 12 characters.
 *
 * ### c. Validate Username
 *
 * - Contains characters from `A-Z`, `a-z`, `0-9`, dot `.`, and underscore `_`.
 * - Length must be from 6 to 32 characters.
 *
 * ### d. Validate Password
 *
 * - Contains uppercase letters, lowercase letters, numbers, special characters, and dot `.`.
 * - Must start with an uppercase letter.
 * - Length must be from 6 to 32 characters.
 */
public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. sdt
        String phoneRegex = "(0|\\(\\+84\\))3[2-9][0-9]{7}";

        System.out.print("Enter phone number: ");
        String phone = input.nextLine();

        if (phone.matches(phoneRegex)) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }

        // b. mail
        String emailRegex =
                "[A-Za-z0-9_]{6,32}@[A-Za-z0-9]{2,12}\\.[A-Za-z0-9]{2,12}";

        System.out.print("\nEnter email address: ");
        String email = input.nextLine();

        boolean validEmailFormat = email.matches(emailRegex);

        // Get the part be4 @
        String emailName = "";

        if (email.contains("@")) {
            emailName = email.substring(0, email.indexOf("@"));
        }

        boolean emailHasLetter = emailName.matches(".*[A-Za-z].*");
        boolean emailHasNum = emailName.matches(".*[0-9].*");

        if (validEmailFormat && emailHasLetter && emailHasNum) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }

        // Username
        String usernameRegex = "[A-Za-z0-9._]{6,32}";

        System.out.print("\nEnter username: ");
        String username = input.nextLine();

        if (username.matches(usernameRegex)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        // password
        String passwordRegex =
                "[A-Za-z0-9.!@#$%^&*()_+=-]{6,32}";

        System.out.print("\nEnter password: ");
        String password = input.nextLine();

        boolean correctLengthAndChars = password.matches(passwordRegex);

        boolean startsWithUppercase = password.matches("[A-Z].*");

        boolean hasLowercase = password.matches(".*[a-z].*");

        boolean hasNum = password.matches(".*[0-9].*");

        boolean hasSpecialChar = password.matches(".*[.!@#$%^&*()_+=-].*");

        if (correctLengthAndChars && startsWithUppercase && hasLowercase && hasNum && hasSpecialChar) {
            System.out.println("Valid passsword");
        } else {
            System.out.println("Invalid password");
        }

        input.close();
    }

}
