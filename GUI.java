import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
public class GUI extends JFrame{
    JFrame frame = new JFrame();
   // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel canvas = new JPanel();
    public GUI(){
        ritaCanvas();
    }

    private void ritaCanvas(){
        canvas.setBounds(2000,2000,2000,2000);
        canvas.setBackground(Color.RED);
        frame.getContentPane().add(canvas);
        this.setVisible(true);
        this.pack();
    }

   private void ritaDisplay(){

    }

    private void ritaKeypad(){

    }

    private void ritaKnappar(){

    }


}

