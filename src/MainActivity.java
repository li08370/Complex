import java.util.Scanner;

public class MainActivity {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String firstComplex = "";
        String secondComplex = "";
        boolean isComplexNum1 = true;
        boolean isComplexNum2 = true;
        System.out.println("What oppertaion would you like to do 1) addition 2)subtraction 3)multiplication 4)division 5)abs");
        int op = in.nextInt();
        do {
            if (isComplexNum1) {
                System.out.println("Enter the First Complex number (Example: 47 + 87i)");
                firstComplex = in.nextLine();
                isComplexNum1 = confirmationImaginaryNum(firstComplex);
            }
            if (isComplexNum2 && op != 5) {
                System.out.println("Enter the Second Complex number(Example: 76 + 7i");
                secondComplex = in.nextLine();
                isComplexNum2 = confirmationImaginaryNum(secondComplex);
            }
        } while (isComplexNum1 && (isComplexNum2 || op == 5));
       Complex num = new Complex(Double.parseDouble(firstComplex), Double.parseDouble(secondComplex));
        switch (op) {
            case 1:
                addition(firstComplex, secondComplex);
                break;
            case 2:
                subtraction(firstComplex, secondComplex);
                break;
            case 3:
                multiplication(firstComplex, secondComplex);
                break;
            case 4:
                division(firstComplex, secondComplex);
                break;
            case 5:
                absolute(firstComplex);


        }
    }



    private static String addition(String firstComplex, String secondComplex) {
        int indexOfPlus1 = firstComplex.indexOf('+');
        int indexOfPlus2 = secondComplex.indexOf('+');
        int indexOfI1 = firstComplex.indexOf('i');
        int indexOFI2 = secondComplex.indexOf('i');
        double realNumValue = Double.parseDouble(firstComplex.substring(0, indexOfPlus1 - 1)) + Double.parseDouble(secondComplex.substring(0, indexOfPlus2 - 1));
        double imaginaryValue = Double.parseDouble(firstComplex.substring(indexOfPlus1, indexOfI1 - 1)) + Double.parseDouble(secondComplex.substring(indexOfPlus2, indexOFI2 - 1));
        return realNumValue + imaginaryValue + "i";
    }

    private static String subtraction(String firstComplex, String secondComplex) {
        int indexOfPlus1 = firstComplex.indexOf('+');
        int indexOfPlus2 = secondComplex.indexOf('+');
        int indexOfI1 = firstComplex.indexOf('i');
        int indexOFI2 = secondComplex.indexOf('i');
        double realNumValue = Double.parseDouble(firstComplex.substring(0, indexOfPlus1 - 1)) - Double.parseDouble(secondComplex.substring(0, indexOfPlus2 - 1));
        double imaginaryValue = Double.parseDouble(firstComplex.substring(indexOfPlus1, indexOfI1 - 1)) - Double.parseDouble(secondComplex.substring(indexOfPlus2, indexOFI2 - 1));
        return realNumValue +"+"+ imaginaryValue + "i";
    }

    private static String multiplication(String firstComplex, String secondComplex) {
        int indexOfPlus1 = firstComplex.indexOf('+');
        int indexOfPlus2 = secondComplex.indexOf('+');
        int indexOfI1 = firstComplex.indexOf('i');
        int indexOFI2 = secondComplex.indexOf('i');
        double firstReal = Double.parseDouble(firstComplex.substring(0, indexOfPlus1 - 1));
        double secondReal = Double.parseDouble(secondComplex.substring(0, indexOfPlus2 - 1));
        double firstImaginary =  Double.parseDouble(firstComplex.substring(indexOfPlus1, indexOfI1 - 1));
        double secondImaginary = Double.parseDouble(secondComplex.substring(indexOfPlus2, indexOFI2 - 1));
        double realNumValue = firstReal * secondReal ;
        double imaginaryValue = firstImaginary * secondImaginary;
       double realResult = realNumValue + imaginaryValue;
       realResult = firstReal * secondImaginary;
       imaginaryValue = firstImaginary * secondReal ;
       double imaginaryResult = realResult + imaginaryValue;
        return realResult +"+"+ imaginaryResult + "i";
    }

    private static String division(String firstComplex, String secondComplex) {
return "temp";
    }

    private static double absolute(String firstComplex){
        int realNum = Integer.parseInt(firstComplex.substring(0, firstComplex.indexOf('+') - 1));
        int imaginary = Integer.parseInt(firstComplex.substring(firstComplex.indexOf('+') + 1, firstComplex.length()-1));
        return Math.sqrt((Math.pow(realNum,2) + Math.pow(imaginary,2)));
    }


    public static boolean confirmationImaginaryNum(String iNum) {
        Boolean isInFormat;
        int indexOfPlus = iNum.indexOf('+');
        int indexOfI = iNum.indexOf('i');
        if (indexOfPlus != -1 && indexOfI != -1 || iNum.equals("")) {
            isInFormat = true;
        } else {
            return false;
        }
        try {
            int realNum = Integer.parseInt(iNum.substring(0, indexOfPlus - 1));
            int imaginary = Integer.parseInt(iNum.substring(indexOfPlus + 1, indexOfI - 1));
        } catch (Exception e) {
            return false;
        }
        return isInFormat;
    }
    public static int curiosity(int n, int m) {
        if (m <= 0) return 0;
        else return n + curiosity(n, m - 1);
    }
}
