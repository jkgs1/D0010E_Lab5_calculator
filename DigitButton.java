import java.awt.Color;
public class DigitButton extends CalculatorButton {
    public DigitButton(String enStr, Situation situation) {
       
        super(enStr,situation); // constructor
    }

    @Override
    public void transition() {
        String displayStingen = situation.display.getText();
        switch (this.situation.state) { 
            case OpReady:
                //tar bort binOP highlight färgen, sparar värdet som står på displayen till leftOperand
                //sätter displayen till det som knappas in
                //ändrar till state Input2
                this.situation.leftOperand = this.situation.valueDisplay();
                this.situation.binaryOperator.setBGColor(Color.GRAY);
                this.situation.setDisplay(enStr);
                this.situation.state = State.Input2; //TODO:if sats för op/siffra
                break;
            case HasResult:
                this.situation.setDisplay(String.valueOf(enStr)); // situation method setDisplay
                this.situation.state = State.Input1;
                this.situation.leftOperand = 0;
                break;
            case Input1:
                //kollar om displayen visar 0, i såfall skriver den över det
                //annars adderas den gamla stringen med den nya "1+2=12"
                if(displayStingen == "0"){
                    this.situation.setDisplay(enStr);
                }else{
                    this.situation.setDisplay(displayStingen+enStr);
                }
                break;
            case Input2:
                this.situation.binaryOperator.setBGColor(Color.GRAY);
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