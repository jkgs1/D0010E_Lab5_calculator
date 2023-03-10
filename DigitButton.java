import java.awt.Color;
public class DigitButton extends CalculatorButton {
    public DigitButton(String enStr, Situation situation) {
       
        super(enStr,situation); // constructor
    }

    @Override
    public void transition() {
        String displayStingen = situation.display.getText();
        switch (this.situation.state) { //switch
            case OpReady:
                this.situation.leftOperand = this.situation.valueDisplay();
                this.situation.setDisplay(enStr); // situation method setDisplay
                this.situation.state = State.Input2; //TODO:if sats för op/siffra
                break;
            case HasResult:
                this.situation.setDisplay(String.valueOf(enStr)); // situation method setDisplay
                this.situation.state = State.Input1;
                break;
            case Input1:
                if(displayStingen == "0"){
                    this.situation.setDisplay(enStr);
                }else{
                    this.situation.setDisplay(displayStingen+enStr);
                }
                break;
            case Input2:
                if(displayStingen == "0"){
                    this.situation.setDisplay(enStr);
                }else{
                    this.situation.setDisplay(displayStingen+enStr);
                }
                break;

            default:
                break;
        }
    }
}