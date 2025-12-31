package quizapp2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    String name;
    int score;
    JButton playagain;
    Score(String name,int score){
        this.name=name;
        this.score=score;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,450,300,250);
        add(img); 
        
        JLabel heading = new JLabel("Thank you "+name+" for playing smart minds");
        heading.setBounds(45,100,700,30);
        heading.setFont(new Font("Times Now Roman",Font.BOLD,26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is "+score);
        lblscore.setBounds(600,350,300,30);
        lblscore.setFont(new Font("Times Now Roman",Font.BOLD,26));
        add(lblscore);
        
        playagain = new JButton("Play Again");
        playagain.setBounds(650,420,120,30);
        playagain.setBackground(new Color(30,144,255));
        playagain.setForeground(Color.WHITE);
        playagain.addActionListener(this);
        add(playagain);
        
        setVisible(true);
        setSize(1000,800);
        setLocation(250,250);
        
    }
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new Login();
    }
    public static void main(String args[]){
        new Score("user",0);
    }
}
