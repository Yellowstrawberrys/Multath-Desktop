package gui;

import core.Logging;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class login {
    private JLabel login_text;
    private JTextField id;
    private JPasswordField passwords;
    private JButton login_button;
    private JPanel login;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        login_button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!id.getText().replaceAll(" ", "").isEmpty() && !String.valueOf(passwords.getPassword()).replaceAll(" ", "").isEmpty()){

                }else{
                    JOptionPane.showMessageDialog(null, "Can't find ID or Password. Please enter your ID or Password", "Can not found ID or Password", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        System.out.println("Login GUI has been Loaded");
        JFrame jFrame = new JFrame("Multath - Login");
        jFrame.setSize(720, 480);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        Logging.getLogger().info("Login GUI has been Loaded");
    }

    public void view(){
        Logging.getLogger().info("Starting to load Login GUI");
    }
}
