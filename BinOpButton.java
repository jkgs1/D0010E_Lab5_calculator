//John Kågström 
//Oscar Westerlund Bucht
import java.awt.Color;
import java.util.function.IntBinaryOperator;

public class BinOpButton extends CalculatorButton {
    private IntBinaryOperator teckenOperation;

    public BinOpButton(String enStr, Situation situation, IntBinaryOperator teckenOperator){
        super(enStr, situation);
        this.teckenOperation = teckenOperator;
    }

    public int resultat(int a, int b){
        return this.teckenOperation.applyAsInt(a, b);
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
                //sparar resultatet som leftOperand och ändrar state
                this.situation.state = State.OpReady;
                this.situation.leftOperand = this.situation.valueDisplay();
                this.situation.binaryOperator=this;
                this.setBGColor(Color.RED);
                break;
            case Input2:
            case OpReady:
                this.situation.binaryOperator.setBGColor(Color.GRAY);
                this.situation.binaryOperator = this;
                this.setBGColor(Color.RED);
                break;
            default:
                break;
        }
    }
}
