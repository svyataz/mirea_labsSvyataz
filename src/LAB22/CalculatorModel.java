package LAB22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorModel {
    static double a=0,b=0,result=0;
    public CalculatorModel(double a, double b, double result){
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        CalculatorModel.a = a;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        CalculatorModel.b = b;
    }

    public static double getResult() {
        return result;
    }

    public static void setResult(double result) {
        CalculatorModel.result = result;
    }
}
