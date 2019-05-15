package Q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JButton randomButton = new JButton("Click me");
   int count = 0;
   final int MAX = 8;
   JLabel enoughWarning = new JLabel("That's enough!");

   public JFrameDisableButton2()
   {
      super("Disable Button Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      setVisible(true);
      add(randomButton);
      add(enoughWarning);
      enoughWarning.setVisible(false);
      randomButton.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      ++count;
      if(count == MAX) {
         randomButton.setEnabled(false);
         enoughWarning.setVisible(true);
      }
   }


   public static void main(String[] args)
   {
      JFrame frame = new JFrameDisableButton2();
      frame.setSize(350, 100);
      frame.setVisible(true);
   } 
}
