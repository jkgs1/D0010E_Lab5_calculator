import java.awt.Color;

public class EqualsButton extends CalculatorButton {

    public EqualsButton(String enStr, Situation situation) {

        super(enStr,situation); // constructor

    }
    
    @Override
    public void transition() {
        
        switch (this.situation.state) { //switch
            case OpReady:
                this.situation.state = State.OpReady;
                break;
            case HasResult:
                this.situation.state = State.HasReslut;
                break;
            case Input1:
                this.situation.state = State.Input1;
                break;
            case Input2:
                this.situation.state = State.HasReslut;
                this.setBGColor(Color.GRAY);
                ApplyAsIntmetod(a,b);
                this.situation.setDisplay(); // GUI method setDisplay
                
                break;

            default:
                break;
        }

    }
}
