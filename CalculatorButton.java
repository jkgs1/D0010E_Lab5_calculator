//John Kågström 
//Oscar Westerlund Bucht
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class CalculatorButton extends JButton implements ActionListener{

    String enStr;
    Situation situation;

    public CalculatorButton(String enStr, Situation situation){
        super(enStr);
        this.situation = situation;
        this.enStr = enStr;

        //knapparnas storlek, färg, font
        //this.setPreferredSize(new DimensionUIResource(300, 300));
        this.setBackground(Color.GRAY);
        this.setFont(new Font("Italic", Font.ITALIC, 24));
        
        //lägger Actionlistner på knapparna
        addActionListener(this);
    }

    //kallar på transition vid knapptryck
    public void actionPerformed(ActionEvent e){
        transition();
        System.out.println("leftoperand=" + situation.leftOperand);
        System.out.println(situation.getState());
    }

    public abstract void transition();
    
    public void setBGColor(Color color){
        this.setBackground(color);
    }
    public String toString(){
        return this.enStr;
    }
}