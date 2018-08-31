import java.util.Scanner;
public class main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a number between 1 and 10 to know what they are in spanish!: ");
        int num;
        num = in.nextInt();
        String numString;

        switch (num) {
            case 1: numString = " Uno ";
                break;
            case 2: numString = " Dos ";
                break;
            case 3: numString = " Tres ";
                break;
            case 4: numString = " Cuatro ";
                break;
            case 5: numString = " Cinco ";
                break;
            case 6: numString = " Seis ";
                break;
            case 7: numString = " Siete ";
                break;
            case 8: numString = " Ocho ";
                break;
            case 9: numString = " Nueve ";
                break;
            case 10: numString = " Diez ";
                break;
            default:numString = " That was an invalid number try again! ";
                break;
        }
        System.out.println("Your number: " + num + numString);
    }
}
