package NalogC;                 
import java.awt.*;            
import java.awt.event.*;      
import javax.swing.*;         
import javax.swing.border.*;  
	public class Nalog extends JFrame{
	private static final long serialVersionUID = 1L;
	public static Nalog frame = new Nalog(); 
	public static void main(String[] args) { 
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	frame.setVisible(true); 
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}
	private JPanel panel1;
	private JButton calc,calc2;
	private JLabel label_1;
	public static double int_rad;
	static double a=13,a1=13,a2=15,a3=30,a4=35;
	protected Window panel;
	public Nalog() { 
	setTitle("Меню");
	setSize(225, 175); 
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setLayout (new BorderLayout()); 
	panel1 = new JPanel();
	add(panel1, BorderLayout.CENTER);
	panel1.setBorder(new EmptyBorder(10,10,10,10));
	panel1.setLayout(new GridLayout(3,1,5,5));
	calc = new JButton("Пользователь");
	calc2 = new JButton("Админ");
	label_1 = new JLabel("Зайти как:", JLabel.CENTER);
	panel1.add(label_1);
	panel1.add(calc);
	panel1.add(calc2);
	calc.addActionListener(new ActionListener() { 
           @Override
           public void actionPerformed(ActionEvent e) {
        	   Nalog.main2(null);
        	   }
       });
	calc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	Password.main(null);
     		}
 });
	}
