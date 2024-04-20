
package bank.management;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    
    Long random;
    JTextField nameTextField,fnameTextField,emailTextField,cityTextField,pinCodeTextField,stateTextField,addressTextField;
    JDateChooser dateChooser;
    JRadioButton male,female,others,single,married;
    JButton next;
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs( ran.nextLong() % 9000L + 1000L ) ;
        
        JLabel formno = new JLabel("Application Form NO:  " + random);
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal  Details");
        personalDetails.setBounds(250,80,400,30);
        personalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setBounds(100,140,200,30);
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(100,190,200,30);
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setBounds(100,240,200,30);
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setFont(new Font("Raleway",Font.BOLD,14));
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        
        JLabel gender = new JLabel("Gender:");
        gender.setBounds(100,290,200,30);
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        others = new JRadioButton("Others");
        others.setBounds(600,290,100,30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);
        
        
        
        JLabel email = new JLabel("Email Address:");
        email.setBounds(100,340,200,30);
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setBounds(100,390,200,30);
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        add(marital);
        
        single = new JRadioButton("Single");
        single.setBounds(300,390,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        
        married = new JRadioButton("Married");
        married.setBounds(450,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(single);
        maritalGroup.add(married);
        
        
        JLabel address = new JLabel("Address:");
        address.setBounds(100,440,200,30);
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setBounds(100,490,200,30);
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setBounds(100,540,200,30);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setBounds(100,590,200,30);
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        add(pinCode);
        
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinCodeTextField.setBounds(300,590,400,30);
        add(pinCodeTextField);
        
        
        next = new JButton("Next");
        next.setBounds(600,660,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);
        next.addActionListener(this);
        
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(400,10);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        } else if (others.isSelected()){
            gender = "Others";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(single.isSelected()){
            marital = "Single";
        } else if(married.isSelected()){
            marital = "Married";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pinCode = pinCodeTextField.getText();
        
        try{
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else if(fname.isEmpty()){
                JOptionPane.showMessageDialog(null, "Father Name is required");
            }
            else if(dob.isEmpty()){
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            }
            else if(!male.isSelected() && !female.isSelected() && !others.isSelected()){
                JOptionPane.showMessageDialog(null, "Gender is required");
            }
            else if(email.isEmpty()){
                JOptionPane.showMessageDialog(null, "Email is required");
            }
            else if(!single.isSelected() && !married.isSelected()){
                JOptionPane.showMessageDialog(null, "Marital Status is required");
            }
            else if(address.isEmpty()){
                JOptionPane.showMessageDialog(null, "Address is required");
            }
            else if(city.isEmpty()){
                JOptionPane.showMessageDialog(null, "City is required");
            }
            else if(state.isEmpty()){
                JOptionPane.showMessageDialog(null, "State is required");
            }
            else if(pinCode.isEmpty()){
                JOptionPane.showMessageDialog(null, "Pincode is required");
            }
            else {
              DBHelper con = new DBHelper();
                String query = "INSERT INTO signup VALUES ('" + formno +"','"+ name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pinCode + "')";

                // Execute the query
                con.executeQuery(query);
                setVisible(false);
                new SignupTwo(formno);
                
                

                
            }
          
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupOne();
    }
    
}
