public class DigitButton extends CalculatorButton {

    public DigitButton(String enStr, Situation situation) {

        super(enStr,situation); // constructor

    }

    @Override
    public void transition() {

        switch (this.situation.state) { //switch
            case OpReady:
                this.situation.setDisplay("integer 0"); // GUI method setDisplay
                this.situation.state = State.Input2;
                break;
            case HasResult:
                this.situation.setDisplay("integer 0"); // GUI method setDisplay
                this.situation.state = State.Input1;
                break;
            case Input1:
                this.situation.state = State.Input1;
                this.situation.setDisplay();
                break;
            case Input2:
                this.situation.state = State.HasReslut;
                this.setBGColor(Color.GRAY);
                ApplyAsIntmetod(a,b);
                GUI.setDisplay( // result of binary operator);

                break;

            default:
                break;
        }
    }
}
