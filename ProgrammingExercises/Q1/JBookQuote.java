package Q1;

import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
   FlowLayout flow = new FlowLayout();
   JLabel quote1 = new JLabel("Death is so terribly final, while life is full of possibilities.");
   JLabel quote2 = new JLabel("A bruise is a lesson... and each lesson makes us better.");

   public JBookQuote()
   {
      super("Book Quotes");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(quote1);
      add(quote2);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JBookQuote();
      frame.setSize(350, 100);
      frame.setVisible(true);
   } 
}
