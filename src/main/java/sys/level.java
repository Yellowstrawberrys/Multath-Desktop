package sys;

import Data.Data;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class level {
    /*
    * Question
    *
    * Level 1:
    *   Only Number
    *   Ex. 5+9= ?
    *
    * Level 2:
    *   Number + Bit of sentences
    *   Ex. There were 5 apples but who ate 2 apples then, how many apples are left?
    *
    * Level 3:
    *   Number + Long Sentences
    *   Ex. One Day, There were 9 bananas and 5 potatoes in the table but at night, 5 bananas and 3 potatoes
    *       has been eaten by somebody, and he left letter in the table. That letter said "If you find out
    *       how much I ate in yesterday then, I will give back your bananas and potatoes!". How much somebody
    *       ate bananas and potatoes? (Please say each time)
    *
    * */
    public List<JPanel> questions() {
        List<JPanel> panels = new ArrayList<>();
        final int VAL = 30;
        for (int i = 0; i < 10; i++) {
            JPanel pane = new JPanel();
            pane.setLayout(new GridBagLayout());
            pane.setBorder(BorderFactory.createLineBorder(Color.blue, 1, true));
            switch (Data.grade) {
                case 1: {
                    System.out.println("1");
                    TextField question = new TextField("Question "+i);
                    pane.add(question, BorderLayout.LINE_START);

                    JButton button = new JButton("Start");
                    button.setBorder(new RoundedBorder(10));
                    button.setForeground(Color.blue);
                    pane.add(button, BorderLayout.EAST);
                    Dimension size = pane.getPreferredSize();
                    pane.setBounds(10, (7 + (VAL * i)), size.width , size.height);
                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
            }
            panels.add(pane);
        }
        System.out.println(panels.size());
        return panels;
    }
    private static class RoundedBorder implements Border {

        private int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}