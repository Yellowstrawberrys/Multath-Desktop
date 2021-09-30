package gui;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class titlebar extends JPanel{
    public titlebar(JFrame jFrame) throws IOException, FontFormatException {
        //Settings
        JLabel logo,close,full,min,bar,title;
        setBackground(Color.BLUE);
        setMaximumSize(new Dimension(jFrame.getWidth(), 130));

        //Logo
        Image l = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/logo.png"))).getImage().getScaledInstance(50, 50,
                Image.SCALE_SMOOTH);
        logo = new JLabel(new ImageIcon(l));

        //Title
        Font font = Font.createFont(1, this.getClass().getResource("/fonts/Gugi-Regular.ttf").openStream());
        font.deriveFont(18.0f);

        title = new JLabel("Multath - Desktop");
        title.setSize(100, 100);
        title.setFont(font);

        //Add
        add(logo, FlowLayout.LEFT);
        add(title);
    }
}
