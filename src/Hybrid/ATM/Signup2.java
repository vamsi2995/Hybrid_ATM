package Hybrid.ATM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signup2(String first){
        super ("APPLICATION FORM");
        //image i1
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;           //getting form number from signup page
        //label text
        JLabel l1 = new JLabel("page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(330,30,600,40);
        add(l1);
        //label text
        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(290,60,600,40);
        add(l2);
        //Religion
        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);
        //options in field
        String religion[] = {"Hindu","Muslim","Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);
        //category
        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);
        //field options
        String Category [] = {"General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);
        //Income
        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);
        //field options
        String income [] = {"Null","Below 1,50,000","Below 2,50,000", "Below 5,00,000", "Below 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);
        //education
        JLabel l6 = new JLabel("Education : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);
        //field options
        String educational [] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);
        //occupation
        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);
        //field options
        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);
        //pan
        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);
        //text field
        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(350,370,320,30);
        add(textPan);
        //aadhar
        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,420,180,30);
        add(l9);
        //text field
        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAadhar.setBounds(350,420,320,30);
        add(textAadhar);
        //Senior citizen
        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,470,180,30);
        add(l10);
        //buttons
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,470,100,30);
        add(r2);
        //type of account
        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,520,180,30);
        add(l11);
        //buttons
        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,520,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,520,100,30);
        add(e2);
        //display formno
        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD,18));
        l12.setBounds(670,10,100,30);
        add(l12);
        //display number
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);
        //next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);    //overriding
        add(next);
        //window properties
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
