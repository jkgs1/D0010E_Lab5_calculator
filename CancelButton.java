import java.awt.Color;

public class CancelButton extends CalculatorButton{
    
    public CancelButton(String c, Situation situation){
        super(c, situation);
    }
    
    @Override
    public void transition() {
        switch(this.situation.state){
            case Input1:
                this.situation.setDisplay("0");
                this.situation.leftOperand = 0;
                break;
            case HasResult:
                //sätter displayen till 0, ändrar leftoperand till 0, ändrar state tillbaks till Input1, ändrar eventuell färg tillbaka till grå
                this.situation.setDisplay("0");
                this.situation.leftOperand = 0;
                this.situation.state = State.Input1;
                break;
            case Input2:
                this.situation.state = State.Input1;
                this.situation.setDisplay("0");
                this.situation.binaryOperator.setBGColor(Color.GRAY);
                this.situation.leftOperand = 0;
                break;
            case OpReady:
                this.situation.state = State.Input1;
                this.situation.setDisplay("0");
                this.situation.binaryOperator.setBGColor(Color.GRAY);
                this.situation.leftOperand = 0;
                break;
        }
    }

}