import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
public class GUI extends JFrame{

JFrame frame = new JFrame();
JPanel canvas = new JPanel();
JLabel display = new JLabel();
JPanel keypad = new JPanel();

//Skapar första situation, börjar på state Input1
Situation situation = new Situation(display);

public GUI(){
    drawCanvas();
    drawKeypad();
    drawDisplay();
    drawBag();
    drawButtons();
    END();
}

    // canvas
    private void drawCanvas(){
        canvas.setLayout(new GridBagLayout());
        canvas.setPreferredSize(new DimensionUIResource(400, 500));
        canvas.setBackground(Color.LIGHT_GRAY);
        frame.setContentPane(canvas); // sets contentpane of frame to be canvas
    }
    
    // display
    private void drawDisplay(){
        //display.setVerticalAlignment(JLabel.TOP);
        display.setBorder(BorderFactory.createMatteBorder(2, 2, 4, 4, Color.LIGHT_GRAY));
        display.setFont(new Font("Italic", Font.ITALIC, 34));
        display.setPreferredSize(new DimensionUIResource(40, 50));
        situation.setDisplay("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        //canvas.add(display);
    }
    
    

    // GridBag
    private void drawBag(){
        GridBagConstraints bag = new GridBagConstraints(); // creates a gridbagconstraints object
        bag.fill = GridBagConstraints.BOTH;
        bag.gridx = 0;
        bag.gridy = 0;
        bag.weightx = 1;
        bag.weighty = 1;
        canvas.add(display, bag);
    }
    

    // keypad

    private void drawKeypad(){
        GridBagConstraints keybag = new GridBagConstraints(); // creates a gridbagconstraints object
        keybag.fill = GridBagConstraints.BOTH;
        keybag.gridx = 0;
        keybag.gridy = 1;
        keybag.weightx = 1;
        keybag.weighty = 9;
        keypad.setLayout(new GridLayout(4,4)); // 4 rows and 4 columns
        canvas.add(this.keypad, keybag);
    }
    

    private void drawButtons(){
        keypad.add(new DigitButton("7", situation));
        keypad.add(new DigitButton("8", situation));
        keypad.add(new DigitButton("9", situation));
        keypad.add(new BinOpButton("/", situation, (a,b) -> (a/b)));

        keypad.add(new DigitButton("4", situation));
        keypad.add(new DigitButton("5", situation));
        keypad.add(new DigitButton("6", situation));
        keypad.add(new BinOpButton("*", situation, (a,b) -> (a*b)));

        keypad.add(new DigitButton("3", situation));
        keypad.add(new DigitButton("2", situation));
        keypad.add(new DigitButton("1", situation));
        keypad.add(new BinOpButton("-", situation, (a,b) -> (a-b)));

        keypad.add(new DigitButton("0", situation));
        keypad.add(new EqualsButton("=", situation));
        keypad.add(new CancelButton("C", situation));
        keypad.add(new BinOpButton("+", situation, (a,b) -> (a+b)));
    }
    
    // ending commands
    private void END(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    
    }

}