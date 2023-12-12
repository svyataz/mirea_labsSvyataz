package LAB22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    CAlculatorView view;
    static int operator=0;
    CalculatorModel model;
    public CalculatorController(CalculatorModel model, CAlculatorView view){
        this.model = model;
        this.view = view;
    }
    public double getModelA(){
        return model.getA();
    }

    public double getModelB(){
        return model.getB();
    }

    public double getModelResult(){
        return model.getResult();
    }
    public void setModelA(double A){
        model.setA(A);
    }

    public void setModelB(double B){
        model.setB(B);
    }

    public void setModelResult(double result){
        model.setResult(result);
    }

    public void updateView(){
        ActionListener ButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == view.getButtons()[8])
                    view.getT().setText(view.getT().getText().concat("1"));
                if (e.getSource() == view.getButtons()[9])
                    view.getT().setText(view.getT().getText().concat("2"));
                if (e.getSource() == view.getButtons()[10])
                    view.getT().setText(view.getT().getText().concat("3"));
                if (e.getSource() == view.getButtons()[4])
                    view.getT().setText(view.getT().getText().concat("4"));
                if (e.getSource() == view.getButtons()[5])
                    view.getT().setText(view.getT().getText().concat("5"));
                if (e.getSource() == view.getButtons()[6])
                    view.getT().setText(view.getT().getText().concat("6"));
                if (e.getSource() == view.getButtons()[0])
                    view.getT().setText(view.getT().getText().concat("7"));
                if (e.getSource() == view.getButtons()[1])
                    view.getT().setText(view.getT().getText().concat("8"));
                if (e.getSource() == view.getButtons()[2])
                    view.getT().setText(view.getT().getText().concat("9"));
                if (e.getSource() == view.getButtons()[12])
                    view.getT().setText(view.getT().getText().concat("0"));
                if (e.getSource() == view.getButtons()[13])
                    view.getT().setText(view.getT().getText().concat("."));
                if (e.getSource() == view.getButtons()[15]) {
                    setModelA(Double.parseDouble(view.getT().getText()));
                    operator = 1;
                    view.getT().setText("");
                }
                if (e.getSource() == view.getButtons()[11]) {
                    setModelA(Double.parseDouble(view.getT().getText()));
                    operator = 2;
                    view.getT().setText("");
                }
                if (e.getSource() == view.getButtons()[7]) {
                    setModelA(Double.parseDouble(view.getT().getText()));
                    operator = 3;
                    view.getT().setText("");
                }
                if (e.getSource() == view.getButtons()[3]) {
                    setModelA(Double.parseDouble(view.getT().getText()));
                    operator = 4;
                    view.getT().setText("");
                }
                if (e.getSource() == view.getButtons()[14]) {
                    setModelB(Double.parseDouble(view.getT().getText()));
                    switch (operator) {
                        case 1:
                            setModelResult(getModelA() + getModelB());
                            break;
                        case 2:
                            setModelResult(getModelA() - getModelB());
                            break;
                        case 3:
                            setModelResult(getModelA() * getModelB());
                            break;
                        case 4:
                            setModelResult(getModelA() / getModelB());
                            break;
                        default:
                            setModelResult(0);
                    }
                    view.getT().setText("" + getModelResult());
                }
            }
        };
        view.printCalculator(ButtonListener);
    }
}
