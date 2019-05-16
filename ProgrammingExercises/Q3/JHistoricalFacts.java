package Q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JButton factButton = new JButton("Fact");
   JLabel fact1 = new JLabel("Singapore is founded by Sir Thomas Stamford Raffles in 1819 wherey he established it as a British trading post.");
   JLabel fact2 = new JLabel("Singapore fell under the Japanese Occupation on 15 February 1942 in World War II.");
   JLabel fact3 = new JLabel("The Japanese surrendered to the Allies on 15 August 1945, which frees Singapore from its occupation.");
   JLabel fact4 = new JLabel("Lee Kuan Yew, the co-founder of the People's Action Party (PAP), became the first Prime Minister in 3 Jun 1959.");
   JLabel fact5 = new JLabel("Singapore gains independence in 9 August 1965 after tension and riots between the Chinese and Malays.");
   int count = 0;

   public JHistoricalFacts()
   {
      super("Singapore History Facts");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(factButton);
      add(fact1);
      factButton.addActionListener(this);
   }
   public static void main(String[] arguments)
   {
      JFrame frame = new JHistoricalFacts();
      frame.setSize(200, 150);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      ++count;
      if (count == 1) {
         remove (fact1);
         add (fact2);
      }
      else if (count == 2) {
         remove (fact2);
         add (fact3);
      }
      else if (count == 3) {
         remove (fact3);
         add (fact4);
      }
      else if (count == 4) {
         remove (fact4);
         add (fact5);
      }
      else if (count == 5) {
         remove (fact5);
         add (fact1);
         count = 0;
      }
      validate();
      repaint();
   }
}