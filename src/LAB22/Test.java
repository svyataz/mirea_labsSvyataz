package LAB22;

public class Test {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel(0, 0, 0);
        CAlculatorView view = new CAlculatorView();
        CalculatorController controller = new CalculatorController(model, view);
        controller.updateView();
    }
}
