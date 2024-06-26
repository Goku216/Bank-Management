
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        
        ImageIcon i3 = new ImageIcon(i2);
        
        
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osword",Font.BOLD,38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
         JLabel card = new JLabel("Card No:");
        card.setFont(new Font("Ralway",Font.BOLD,28));
        card.setBounds(120, 150, 150, 30);
        add(card);
        
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial",Font.BOLD,18));
        cardTextField.setBounds(280,150,250,30);
        add(cardTextField);
        
         JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Ralway",Font.BOLD,28));
        pin.setBounds(120, 220, 100, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Arial",Font.BOLD,18));
        pinTextField.setBounds(280,220,250,30);
        add(pinTextField);
        
        login = new JButton("LOG IN");
        login.setBounds(280,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(280,350,250,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        
        getContentPane().setBackground(Color.white);
        
        
        
        setSize(800,480);
        setVisible(true);
        setLocation(450,100);
        
        
        
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne(); 
        } else if(ae.getSource() == login){
            
            
        }
    }
    
  
    public static void main(String[] args) {
        
        new Login();
    }

   
    
}
