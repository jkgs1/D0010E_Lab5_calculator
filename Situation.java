//John Kågström 
//Oscar Westerlund Bucht
import javax.swing.JLabel;

public class Situation{
    State state = State.Input1;
    JLabel display;
    BinOpButton binaryOperator;
    int leftOperand;

    Situation(JLabel display){
        this.display = display;
    }

    public void setDisplay(String värde){
        display.setText(värde);
    }

    public int valueDisplay(){
        return Integer.parseInt(display.getText());
    }
    public State getState(){
        return state;
    }
    public void setLeftOperator(){
        leftOperand = valueDisplay();
    }
}