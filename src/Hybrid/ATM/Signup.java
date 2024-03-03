package Hybrid.ATM;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame  implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName ,textFname, textEmail, textAdd, textCity ,textPin, textState;

    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =Math.abs(ran.nextLong() % 9000L) +1000L;//to ensure it is non negative number
    String first = " " + first4;
    Signup(){
        super ("APPLICATION FORM");
        //image i1
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        //label1
        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);
        //label2
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);
        //label3
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);
        //labelName
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);
        //labelFName
        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(300,240,400,30);
        add(textFname);
        //labelDOB
        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);
        //labelG
        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100,340,200,30);
        add(labelG);
        //radio buttons
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,90,30);
        add(r2);
        //grouping radio buttons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        //labelEmail
        JLabel labelEmail = new JLabel("Email address:");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);
        //labelMs
        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);
        //radio buttons
        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(600,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        add(m3);
        //grouping buttons
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        //labelAdd
        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);
        //labelCity
        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD, 14));
        textCity.setBounds(300,540,400,30);
        add(textCity);
        //labelPin
        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 14));
        textPin.setBounds(300,590,400,30);
        add(textPin);
        //labelState
        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,640,400,30);
        add(textState);
        //next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);//adding event
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup();
    }
}