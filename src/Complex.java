public class Complex implements Comparable{
    double  complexNum1, complexNum2;

    Complex(double complexNum1, double complexNum2){
        this.complexNum1 = complexNum1;
        this.complexNum2 = complexNum2;
    }

    Complex(double complexNum1){
        this.complexNum1 = complexNum1;
        complexNum2 = 0;
    }

    Complex(){
        complexNum1=0;
        complexNum2=0;
    }

    public double getComplexNUm1() {
        return complexNum1;
    }

    public void setComplexNUm1(double complexNUm1) {
        this.complexNum1 = complexNUm1;
    }

    public double getComplexNum2() {
        return complexNum2;
    }

    public void setComplexNum2(double complexNum2) {
        this.complexNum2 = complexNum2;
    }

    public double getRealPart(){

        return complexNum1;
    }


    public String getImgnaryPart() {
        return String.valueOf(complexNum2) + "i";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
