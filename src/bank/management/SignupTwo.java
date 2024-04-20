
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField panTextField,citizenshipNumberTextField;
    JComboBox religionComboBox,categoryComboBox,incomeComboBox,educationComboBox,occupationComboBox;
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional  Details");
        additionalDetails.setBounds(300,50,400,30);
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setBounds(100,140,200,30);
        religion.setFont(new Font("Raleway",Font.BOLD, 20));
        add(religion);
        
        String valreligion[] = {"Hindu","Christian","Muslim","Buddhist","Other"};
        religionComboBox = new JComboBox(valreligion);
        religionComboBox.setBounds(300,140,400,30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);
       
        
        JLabel category = new JLabel("Category:");
        category.setBounds(100,190,200,30);
        category.setFont(new Font("Raleway",Font.BOLD, 20));
        add(category);
        
        String valcategory[] = {"Current","Saving","FD","Other"};
        categoryComboBox = new JComboBox(valcategory);
        categoryComboBox.setBounds(300,190,400,30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        JLabel income = new JLabel("Income:");
        income.setBounds(100,240,200,30);
        income.setFont(new Font("Raleway",Font.BOLD, 20));
        add(income);
        
        String valincome[] = {"null","<1,00,000","<2,00,000","<5,00,000","upto 10,00,000"};
        incomeComboBox = new JComboBox(valincome);
        incomeComboBox.setBounds(300,240,400,30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        
        
        JLabel educational = new JLabel("Educational ");
        educational.setBounds(100,290,200,30);
        educational.setFont(new Font("Raleway",Font.BOLD, 20));
        add(educational);
        
        JLabel qualification = new JLabel("Qualificaiton:");
        qualification.setBounds(100,320,200,30);
        qualification.setFont(new Font("Raleway",Font.BOLD, 20));
        add(qualification);
        
        String valeducation[] = {"SEE","High School","Graduate","Post Graduate","Others"};
        educationComboBox = new JComboBox(valeducation);
        educationComboBox.setBounds(300,320,400,30);
        educationComboBox.setBackground(Color.WHITE);
        add(educationComboBox);
        
       
        
        JLabel marital = new JLabel("Occupation:");
        marital.setBounds(100,390,200,30);
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        add(marital);
        
        String valoccupation[] = {"Self-Employed","Salried","Business","Student","Others"};
        occupationComboBox = new JComboBox(valoccupation);
        occupationComboBox.setBounds(300,390,400,30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);  
        
        JLabel panNumber = new JLabel("PAN Number:");
        panNumber.setBounds(100,440,200,30);
        panNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        add(panNumber);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel citizenshipNumber = new JLabel("Citizenship Number:");
        citizenshipNumber.setBounds(100,490,200,30);
        citizenshipNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        add(citizenshipNumber);
        
        citizenshipNumberTextField = new JTextField();
        citizenshipNumberTextField.setFont(new Font("Raleway",Font.BOLD,14));
        citizenshipNumberTextField.setBounds(300,490,400,30);
        add(citizenshipNumberTextField);
        
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setBounds(100,540,200,30);
        seniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        add(seniorCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(420,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        
        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setBounds(100,590,200,30);
        existingAccount.setFont(new Font("Raleway",Font.BOLD,20));
        add(existingAccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(420,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
       
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        
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
        
        String religion = (String) religionComboBox.getSelectedItem();
        String category = (String) categoryComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String education = (String) educationComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();
        String pan = panTextField.getText();
        String citizenshipNumber = citizenshipNumberTextField.getText();
        
        String seniorCitizen = null;
        if(syes.isSelected()){
            seniorCitizen = "Yes";
        } else if (sno.isSelected()){
            seniorCitizen = "No";
        }
        
        String existing = null;
        if(eyes.isSelected()){
            existing = "Yes";
        } else if (eno.isSelected()){
            existing = "No";
        }
        try{
          
              DBHelper con = new DBHelper();
                String query = "INSERT INTO signuptwo VALUES ('" + formno + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + citizenshipNumber + "','" + seniorCitizen + "','" + existing + "')";
                // Execute the query
                con.executeQuery(query);
                
                setVisible(false);
                new SignupThree(formno);
                
            
          
        } catch (Exception e){
            System.out.println(e);
        }
        
        
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
    
}
