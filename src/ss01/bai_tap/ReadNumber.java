package ss01.bai_tap;
import java.util.Scanner;
public class ReadNumber {
    public static String readOnes(int number){
        switch (number) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Invalid number";
        }
    }
    public static String readHundred(int number){
        String numberString ="";
        int ones, tens, hundered;
        hundered = number/100;
        tens = (number-hundered*100)/10;
        ones = (number - hundered*100 - tens*10);

        if (hundered > 0) {
            numberString += readOnes(hundered) + " hundered and ";
        }

        if (tens>1) {
            switch (tens) {
                case 2:
                    numberString += "twenty " + readOnes(ones);
                    break;
                case 3:
                    numberString += "thirty " + readOnes(ones);
                    break;
                case 5:
                    numberString += "fifty " + readOnes(ones);
                    break;
                case 8:
                    numberString += "eighty " + readOnes(ones);
                    break;
                case 6:
                case 7:
                case 9:
                    numberString += readOnes(tens) + "ty " + readOnes(ones);
                    break;
                default:
                    numberString +="";
            }
        }
        if (tens == 1) {
            switch (ones) {
                case 0:
                    numberString += "ten";
                    break;
                case 1:
                    numberString += "eleven";
                    break;
                case 2:
                    numberString += "twelve";
                    break;
                case 3:
                    numberString += "thirteen";
                    break;
                case 5:
                    numberString += "fifteen";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    numberString += readOnes(ones)+"teen";
                    break;
            }
        }
        if (number<10) {
            numberString +=readOnes(number);
        }
        return numberString;
    }
    public static void main(String[] args) {
        System.out.println("Enter your weight: ");
        Scanner sc = new Scanner(System.in);
        int weight;
        weight = sc.nextInt();
        System.out.println(readHundred(weight));
    }
}

