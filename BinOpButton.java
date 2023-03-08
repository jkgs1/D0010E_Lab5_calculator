import java.awt.Color;
import java.util.function.IntBinaryOperator;

public class BinOpButton extends CalculatorButton {
    private IntBinaryOperator teckenOperation;

    public BinOpButton(String enStr, Situation situation, IntBinaryOperator teckenOperator){
        super(enStr, situation);
        this.teckenOperation = teckenOperator;
    }
    public int applyAsIntmetod(int a, int b){
        return teckenOperation.applyAsInt(a, b);
    }

    @Override
    public void transition() {
        switch(this.situation.state){
            case Input1:
                this.situation.state = State.OpReady;
                this.setBGColor(Color.RED);
                break;
            case HasResult:
                this.situation.state = State.OpReady;
                break;
            case Input2:
                break;
            case OpReady:
                this.setBGColor(Color.RED);
                this.situation.binaryOperator = this;
                this.setBGColor(Color.RED);
                break;
        }
    }
}
