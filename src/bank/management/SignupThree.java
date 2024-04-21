
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree (String formno){
        this.formno = formno;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,30);
        add(l1);
        
        JLabel accountType = new JLabel("Account Type");
        accountType.setFont(new Font("Raleway",Font.BOLD,20));
        accountType.setBounds(100,100,400,30);
        add(accountType);
        
        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100,130,200,30);
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Current Account");
        r2.setBounds(350,130,200,30);
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setBounds(100,170,200,30);
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350,170,250,30);
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup accounttypesGroup = new ButtonGroup();
        accounttypesGroup.add(r1);
        accounttypesGroup.add(r2);
        accounttypesGroup.add(r3);
        accounttypesGroup.add(r4);
        
        JLabel cardLabel = new JLabel("Card Number");
        cardLabel.setFont(new Font("Raleway",Font.BOLD,20));
        cardLabel.setBounds(100,250,400,30);
        add(cardLabel);
        
        JLabel cardNumber = new JLabel("XXXX-XXXX-XXXX-4321");
        cardNumber.setFont(new Font("Raleway",Font.BOLD,20));
        cardNumber.setBounds(320,250,400,30);
        add(cardNumber);
        
        JLabel cardDetail = new JLabel("Your 16 Digit Card Number");
        cardDetail.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetail.setBounds(100,270,200,30);
        add(cardDetail);
        
        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Raleway",Font.BOLD,20));
        pinLabel.setBounds(100,330,400,30);
        add(pinLabel);
        
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway",Font.BOLD,20));
        pinNumber.setBounds(320,330,400,30);
        add(pinNumber);
        
        JLabel pinDetail = new JLabel("Your 4 Digit Password");
        pinDetail.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetail.setBounds(100,350,200,30);
        add(pinDetail);
        
        JLabel servicesLabel = new JLabel("Services Required");
        servicesLabel.setFont(new Font("Raleway",Font.BOLD,20));
        servicesLabel.setBounds(100,430,400,30);
        add(servicesLabel);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBounds(120,470,200,30);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(320,470,200,30);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(Color.WHITE);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(120,510,200,30);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Alert");
        c4.setBounds(320,510,200,30);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(Color.WHITE);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(120,550,200,30);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(Color.WHITE);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBounds(320,550,200,30);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(Color.WHITE);
        add(c6);
        
        c7 = new JCheckBox("I hearby declare that above entered are correct to the best of my knowledge.");
        c7.setBounds(120,630,600,30);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(Color.WHITE);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(370,670,100,30);
        add(submit);
        submit.addActionListener(this);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(200,670,100,30);
        add(cancel);
        cancel.addActionListener(this);
        
        
        
        setSize(850,800);
        setLocation(400,0);
        setVisible(true);
        
       
    }
    
    @Override
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            } else if (r2.isSelected()){
                accountType = "Current Account";
            } else if (r3.isSelected()){
                accountType = "Fixed Deposit Account";
            } else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs(random.nextLong() % 9000000000L + 4033221100000000L);
            String pin = "" + Math.abs(random.nextLong() % 9000L + 1000L);
            
            String services = "";
            if(c1.isSelected()){
                services = services + " ATM CARD";
                if(c2.isSelected()){
                services = services + " Internet Banking";
                    if(c3.isSelected()){
                        services = services + " Mobile Banking";
                          if(c4.isSelected()){
                            services = services + " EMAIL & SMS Alert";
                            if(c5.isSelected()){
                                services = services + " Check Book";
                                if(c6.isSelected()){
                                    services = services + " Internet Banking";
                                }
                            }
                        }
                    }
                }
            }  
            
            try{
          
              DBHelper con = new DBHelper();
                String query = "INSERT INTO signupthree VALUES ('" + formno + "','" + accountType + "','" + cardnumber + "','" + pin + "','" + services + "')";
                String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";  
                
                JOptionPane.showMessageDialog(null, "Card Number : " + cardnumber + "\nPin: "+ pin);
                
                con.executeQuery(query);
                con.executeQuery(query2);
                
                setVisible(false);
                new Login();

                
            
          
        } catch (Exception e){
            System.out.println(e);
        }
        } else if (ae.getSource() == cancel){
            
        }
    }

   
    public static void main(String[] args) {
       new SignupThree("");
    }
    
}
