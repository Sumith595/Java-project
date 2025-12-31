package quizapp2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton back,rules;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        setLayout(null);
        JLabel img = new JLabel(i1);
        img.setBounds(0,0,600,500);
        add(img);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(780,60,300,45);
        heading.setFont(new Font("VINER HAND ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your Name");
        name.setBounds(800,175,300,20);
        name.setFont(new Font("Poppins",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(750,220,250,25);
        tfname.setFont(new Font("TimesNowRoman",Font.PLAIN,18));
        tfname.setForeground(Color.BLACK);
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(745,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(890,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        setVisible(true);
        setSize(1200,550);
        setLocation(250,250);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }

   
    public static void main(String[] args) {
        new Login();
    }
    
}
