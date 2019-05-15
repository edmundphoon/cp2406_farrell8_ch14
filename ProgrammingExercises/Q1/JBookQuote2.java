package Q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JLabel quote1 = new JLabel("Death is so terribly final, while life is full of possibilities.");
   JLabel quote2 = new JLabel("A bruise is a lesson... and each lesson makes us better.");
   JButton bookButton = new JButton("Source");
   JLabel message = new JLabel("Title: A Game of Thrones");

   public JBookQuote2()
   {
      super("Book Quotes 2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(quote1);
      add(quote2);
      add(bookButton);
      bookButton.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      add(message);
      validate();
      repaint();
   }


   public static void main(String[] args)
   {
      JFrame frame = new JBookQuote2();
      frame.setSize(550, 150);
      frame.setVisible(true);
   } 
}
