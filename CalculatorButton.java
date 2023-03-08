import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.plaf.DimensionUIResource;

public abstract class CalculatorButton extends JButton{

    //måste skapa för toString ska fungera
    String enStr = new String();
    Situation situation;

    public CalculatorButton(String enStr, Situation situation){
        super(enStr);
        this.situation = situation;

        //knapparnas storlek, färg, font
        this.setPreferredSize(new DimensionUIResource(100, 100));
        this.setBackground(Color.GRAY);
        this.setFont(new Font("Italic", Font.ITALIC, 12));
        
        //lägger keylistner på knapparna
        this.addActionListener(actionListener);
    }

    //kallar på transition vid knapptryck
    public void actionPerformed(ActionEvent e){
        transition();
    }

    public abstract void transition();
    
    public void setBGColor(Color color){
        this.setBackground(color);
    }
    public String toString(){
        return this.enStr;
    }
}