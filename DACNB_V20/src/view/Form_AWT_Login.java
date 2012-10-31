package view;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  


public class Form_AWT_Login
{  
    public static void main(String[] args)  
    {  
        JFrame frame = new LoginFrame();  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}  
class LoginFrame extends JFrame implements ActionListener  
{  
    Container contentPane;  
    JPanel panel1;  
    JPanel panel2;  
    JButton login;  
    JButton cancel;  
    JTextField t2;  
    JTextField t1;  
    JLabel l1;  
    JLabel l2;  
    JLabel l3;  
    public LoginFrame()  
    {     
        setSize(320,230);  
        setTitle("Login Form");  
        setResizable(false);  
          
        contentPane=getContentPane();  
        panel1=new JPanel();  
        panel2=new JPanel();  
              
        login=new JButton("Login");  
        cancel=new JButton("Cancel");  
        t1=new JTextField(20);  
        t2=new JTextField(20);  
        l1=new JLabel("Welcome");  
        l2=new JLabel("Username : ");  
        l3=new JLabel("Password : ");  
          
        login.addActionListener(this);  
        cancel.addActionListener(this);  
          
        contentPane.add(panel1,"North");  
        contentPane.add(panel2,"Center");  
      
        panel1.add(l1);  
        panel2.add(l2);  
        panel2.add(t1);  
        panel2.add(l3);  
        panel2.add(t2);  
        panel2.add(login);  
        panel2.add(cancel);  
        
    }  
    
    
    
    
    public void actionPerformed(ActionEvent e)  
    {     
          
    	String Username = t1.getText();
    	String Password = t2.getText();
		
		
		
        if(e.getSource()==login)  
        {           
        	if (Username.equals("") && Password.equals("")) {
				JOptionPane.showMessageDialog(null,
						"Enter Username or Password", "Error",
						JOptionPane.ERROR_MESSAGE);
		}
        }  
        if(e.getSource()==cancel)  
        {  
            JOptionPane.showMessageDialog(this,"Thanks");  
            System.exit(0);  
        }  
        
    }  
      
}  
