package Q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JButton randomButton = new JButton("Click me");

   public JFrameDisableButton()
   {
      super("Disable Button Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      setVisible(true);
      add(randomButton);
      randomButton.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      randomButton.setEnabled(false);
   }


   public static void main(String[] args)
   {
      JFrame frame = new JFrameDisableButton();
      frame.setSize(350, 100);
      frame.setVisible(true);
   } 
}
