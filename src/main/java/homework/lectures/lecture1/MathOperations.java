package homework.lectures.lecture1;
//**********@Checked***************//
public class MathOperations {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int result;
        double divideResult;

        result = a+b;
        System.out.println("Резузльтат сложения a+b: " + result);

        result = a-b;
        System.out.println("Резузльтат вычитания a-b: " + result);

        result = a*b;
        System.out.println("Резузльтат умножения a*b: " + result);

        divideResult= (double) a / (double) b;
        System.out.println("Резузльтат деления a/b: " + divideResult);
    }
}
