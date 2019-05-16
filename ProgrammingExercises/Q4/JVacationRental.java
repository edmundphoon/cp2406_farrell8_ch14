package Q4;// Beverage selector
// Milk and cola are $3
// all other drinks are $2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   String title = new String("Lambert's Vacation Rentals");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);

   ButtonGroup locationSelection = new ButtonGroup();
   final int PARKSIDE = 600, POOLSIDE = 750, LAKESIDE = 825;
   JCheckBox parkside = new JCheckBox("Parkside",false);
   JCheckBox poolside = new JCheckBox("Poolside",false);
   JCheckBox lakeside = new JCheckBox("Lakeside",false);

   ButtonGroup numOfBedrooms = new ButtonGroup();
   final int ONE_ROOM = 0, TWO_ROOMS = 75, THREE_ROOMS = 150;
   JCheckBox oneRoom = new JCheckBox("One room",false);
   JCheckBox twoRoom = new JCheckBox("Two rooms",false);
   JCheckBox threeRoom = new JCheckBox("Three rooms",false);

   ButtonGroup mealsIncluded = new ButtonGroup();
   final int NORMAL_PRICE = 0, MEAL_PRICE = 200;
   JCheckBox normalPrice = new JCheckBox("No meals included",false);
   JCheckBox mealPrice = new JCheckBox("Meals included",false);


   JTextField totPrice = new JTextField(10);
   String output;
   int totalPrice = 0;
   public JVacationRental()
   {
      super("Lambert's Vacation Rentals");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);

      locationSelection.add(parkside);
      parkside.addItemListener(this);
      locationSelection.add(poolside);
      poolside.addItemListener(this);
      locationSelection.add(lakeside);
      poolside.addItemListener(this);

      numOfBedrooms.add(oneRoom);
      oneRoom.addItemListener(this);
      numOfBedrooms.add(twoRoom);
      twoRoom.addItemListener(this);
      numOfBedrooms.add(threeRoom);
      threeRoom.addItemListener(this);

      mealsIncluded.add(normalPrice);
      normalPrice.addItemListener(this);
      mealsIncluded.add(mealPrice);
      mealPrice.addItemListener(this);

      add(parkside);
      add(poolside);
      add(lakeside);
      add(oneRoom);
      add(twoRoom);
      add(threeRoom);
      add(normalPrice);
      add(mealPrice);
      add(totPrice);
      totPrice.setText("0");
   }


   public static void main(String[] arguments)
   {
      JFrame bFrame = new JVacationRental();
      bFrame.setSize(350, 200);
      bFrame.setVisible(true);
   }


   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      if (source == parkside)
      {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += PARKSIDE;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= PARKSIDE;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == poolside) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += POOLSIDE;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= POOLSIDE;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == lakeside) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += LAKESIDE;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= LAKESIDE;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == oneRoom) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += ONE_ROOM;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= ONE_ROOM;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == twoRoom) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += TWO_ROOMS;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= TWO_ROOMS;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == threeRoom) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += THREE_ROOMS;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= THREE_ROOMS;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == normalPrice) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += NORMAL_PRICE;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= NORMAL_PRICE;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
      else if (source == mealPrice) {
         int select = check.getStateChange();
         if(select == ItemEvent.SELECTED) {
            totalPrice += MEAL_PRICE;
         }
         else if(select == ItemEvent.DESELECTED) {
            totalPrice -= MEAL_PRICE;
         }
         output = "$" + totalPrice;
         totPrice.setText(output);
      }
   }
}