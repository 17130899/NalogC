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
public static void main2(String[] args) { 
SwingUtilities.invokeLater(new Runnable() { 
public void run() { 
JFrame form2 = new JFrame("form2"); 
JPanel panel, panel1; 
JButton calc,calc2; 
JLabel label_1,label_2,label_3, label_4,label_n,sum_n,sum,label_n1,label_n2,label_n3,label_n4; 
JTextField sum_ok; 
JRadioButton rad_13, rad_13_1,rad_15, rad_30, rad_35; 
int q=13,q1=15,q2=30,q3=35; 
form2.setTitle("Калькулятор НДФЛ"); 
form2.setSize(475, 290); 
form2.setLocationRelativeTo(null); 
form2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
form2.setLayout (new BorderLayout()); 
form2.setVisible(true); 
panel = new JPanel(); 
panel1 = new JPanel(); 
form2.add(panel, BorderLayout.CENTER); 
form2.add(panel1, BorderLayout.SOUTH); 
panel.setBorder(new EmptyBorder(10,0,10,10)); 
panel1.setBorder(new EmptyBorder(10,10,10,10)); 
panel.setLayout(new GridLayout(9,2,5,0)); 
panel1.setLayout(new GridLayout(1,2)); 
label_1 = new JLabel("Вычитать налог для:", JLabel.LEFT); 
label_2 = new JLabel("Резидент", JLabel.LEFT); 
label_3 = new JLabel("Сумма налога, руб.", JLabel.LEFT); 
label_4 = new JLabel("Сумма на руки, руб.", JLabel.LEFT); 
label_n = new JLabel(""); 
label_n1 = new JLabel("Нерезидент"); 
label_n2 = new JLabel("Доход", JLabel.RIGHT); 
label_n3 = new JLabel("это:", JLabel.LEFT); 
label_n4 = new JLabel(""); 
sum_n = new JLabel("", JLabel.CENTER); 
sum = new JLabel("", JLabel.CENTER); 
calc = new JButton("Рассчитать"); 
calc2 = new JButton("В меню"); 
sum_ok = new JTextField(); 
sum_ok.setHorizontalAlignment(JTextField.CENTER); 
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
ButtonGroup group = new ButtonGroup(); 
rad_13 = new JRadioButton("Иное",false); 
group.add(rad_13); 
rad_13.setHorizontalAlignment(JRadioButton.LEFT); 
rad_13_1 = new JRadioButton("Любой доход гражданина ЕАЭС",false); 
group.add(rad_13_1); 
rad_13_1.setHorizontalAlignment(JRadioButton.LEFT); 
rad_15 = new JRadioButton("Дивиденты", false); 
group.add(rad_15); 
rad_15.setHorizontalAlignment(JRadioButton.LEFT); 
rad_30 = new JRadioButton("Иное", false); 
group.add(rad_30); 
rad_30.setHorizontalAlignment(JRadioButton.LEFT); 
rad_35 = new JRadioButton("Выйгрыш,займ" 
+ " или приз", false); 
group.add(rad_35); 
rad_35.setHorizontalAlignment(JRadioButton.LEFT); 
panel.add(label_1); 
panel.add(label_n); 
panel.add(label_2); 
panel.add(label_n1); 
panel.add(label_n2); 
panel.add(label_n3); 
panel.add(rad_35); 
panel.add(rad_13_1); 
panel.add(rad_13); 
panel.add(rad_15); 
panel.add(label_n4); 
panel.add(rad_30); 
panel.add(label_3); 
panel.add(sum_n); 
panel.add(label_4); 
panel.add(sum); 
panel.add(sum_ok); 
panel1.add(calc); 
panel1.add(calc2); 
rad_13.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
int_rad=a; 
sum_n.setText(""); 
sum.setText(""); 
} 
}); 
rad_13_1.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
int_rad=a1; 
sum_n.setText(""); 
sum.setText(""); 
} 
}); 
rad_15.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
int_rad=a2; 
sum_n.setText(""); 
sum.setText(""); 
} 
}); 
rad_30.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
int_rad=a3; 
sum_n.setText(""); 
sum.setText(""); 
} 
}); 
rad_35.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
int_rad=a4; 
sum_n.setText(""); 
sum.setText(""); 
} 
}); 
calc2.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{form2.dispose();}}); 
calc.addActionListener(new 
ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
if (isValidInput(sum_ok, "сумму оклада")) { 
double d_sum_ok= Double.parseDouble(sum_ok.getText().replace(',','.')); 
double d_sum_n = d_sum_ok/100*int_rad; 
double d_sum = d_sum_ok-d_sum_n; 
String
s_sum_n = String.format("%.2f", d_sum_n); 
sum_n.setText(s_sum_n); 
String s_sum = String.format("%.2f", d_sum); 
sum.setText(s_sum); 
} 
} 
}); 
} 
public boolean isValidInput(JTextField jtxt, String description) { 
JDialog D = new JDialog(); 
if (jtxt.getText().trim().length() > 0) { 
try { 
double num = Double.parseDouble(jtxt.getText().replace(',','.')); 
return true; 
} catch (NumberFormatException e) { 
jtxt.requestFocus(); 
jtxt.setText(""); 
JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE); 
return false; 
} 
} else { 
JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE); 
jtxt.requestFocus(); 
jtxt.selectAll(); 
return false; 
} 
} 
}); 
}
