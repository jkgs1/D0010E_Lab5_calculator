import java.awt.Color;
import java.util.function.IntBinaryOperator;

public class BinOpButton extends CalculatorButton {
    private IntBinaryOperator teckenOperation;

    public BinOpButton(String enStr, Situation situation, IntBinaryOperator teckenOperator){
        super(enStr, situation);
        this.teckenOperation = teckenOperator;
    }

    @Override
    public void transition() {
        switch(this.situation.state){
            case Input1:
                this.situation.state = State.OpReady;
                this.setBGColor(Color.RED);
                this.situation.binaryOperator=this;
                break;
            case HasResult:
                this.situation.state = State.OpReady;
                break;
            case Input2:
            case OpReady:
                this.situation.valueDisplay();
                this.setBGColor(Color.GRAY);
                this.situation.binaryOperator = this;
                this.setBGColor(Color.RED);
                break;
            default:
                break;
        }
    }
}
