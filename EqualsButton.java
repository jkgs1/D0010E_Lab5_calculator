import java.awt.Color;

public class EqualsButton extends CalculatorButton {

    public EqualsButton(String enStr, Situation situation) {

        super(enStr,situation); // constructor

    }
    
    @Override
    public void transition() {
        //TODO: alla knappar grå, gör matten
        switch (this.situation.state) { //switch
            case OpReady:
            case HasResult:
            case Input1:
            case Input2:
                switch (){
                    case "/":
                        int newValue = leftOperand / valueDisplay();
                }
                this.situation.setDisplay("");



                this.situation.state = State.HasResult;
                this.setBGColor(Color.GRAY);
                applyAsIntmetod(a,b);
                this.situation.setDisplay(); // GUI method setDisplay
                
                break;

            default:
                break;
        }

    }
}