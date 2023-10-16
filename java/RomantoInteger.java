import java.util.Scanner;

public class RomantoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase(); 

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);
            int currentValue = 0;
            int nextValue = 0;

            
            switch (currentChar) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral.");
                    return;
            }

            if (i < roman.length() - 1) {
                char nextChar = roman.charAt(i + 1);
                switch (nextChar) {
                    case 'I':
                        nextValue = 1;
                        break;
                    case 'V':
                        nextValue = 5;
                        break;
                    case 'X':
                        nextValue = 10;
                        break;
                    case 'L':
                        nextValue = 50;
                        break;
                    case 'C':
                        nextValue = 100;
                        break;
                    case 'D':
                        nextValue = 500;
                        break;
                    case 'M':
                        nextValue = 1000;
                        break;
                    default:
                        System.out.println("Invalid Roman numeral.");
                        return;
                }
            }

        
            if (i < roman.length() - 1 && currentValue < nextValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        System.out.println("The integer value of the Roman numeral is: " + result);
    }
}
