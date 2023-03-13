import java.awt.Color;

public class EqualsButton extends CalculatorButton {

    public EqualsButton(String enStr, Situation situation) {

        super(enStr,situation); // constructor

    }
    
    @Override
    public void transition() {
        //TODO: alla knappar grå, gör matten
        switch (this.situation.state) {
            //OpReady,HasResult och Input1 gör ingenting
            case OpReady:
            case HasResult:
            case Input1:

            case Input2:
                this.situation.state = State.HasResult;
                int rightOperand = situation.valueDisplay();
                //skickar left och right med beräkningsmetoden som kommer från knappskapandet till applyAsInt metoden resultat
                try{
                    int beräkning = this.situation.binaryOperator.resultat(situation.leftOperand, rightOperand);
                    situation.setDisplay(String.valueOf(beräkning));
                //Ser till att användaren "kan" dela med noll
                }catch(ArithmeticException e){
                    situation.setDisplay("ERROR");
                }
                this.setBGColor(Color.GRAY);
                break;

            default:
                break;
        }

    }
}