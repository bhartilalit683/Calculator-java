import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.element.Element;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel implements ActionListener{
	
	private JTextField dis_exp;
	private JTextField dis_ans;
	private String show;
	private double val,sum;
	private boolean oneDot;
	private boolean oneDigit;
	private boolean working;
	private boolean not_del;
	
	private boolean add;
	private boolean sub;
	private boolean mul;
	private boolean div;
	private boolean ent;
	
	private boolean adde;
	private boolean sube;
	private boolean mule;
	private boolean dive;
	

	
	
	private boolean initial;
	
	
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn_point;
	private JButton btn_div;
	private JButton btn_mul;
	private JButton btn_sub;
	private JButton btn_add;
	private JButton btn_ent;
	private JButton btn_del;
	private JButton btn_ac;

	public Calculator() {
		// TODO Auto-generated constructor stub
		setSize(310,500);
		setVisible(true);
		setLayout(null);
		show = "";
		oneDot = true;
		oneDigit = false;
		working = false;
		
		add = false;
		sub = false;
		mul = false;
		div = false;
		ent = false;
		
		adde = false;
		sube = false;
		mule = false;
		dive = false;
		
		initial = true;
		not_del = true;
		val = 0;
		sum = 0;
		
		dis_exp = new JTextField();
		dis_exp.setEditable(false);
		dis_ans = new JTextField();
		dis_ans.setEditable(false);
			
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn_point = new JButton(".");
		btn_div = new JButton("/");
		btn_mul = new JButton("*");
		btn_sub = new JButton("-");
		btn_add = new JButton("+");
		btn_ent = new JButton("=");
		btn_ac = new JButton("AC");
		btn_del = new JButton("C");
		
		dis_exp.setBounds(40,20,230,40);
		dis_ans.setBounds(40,60,230,40);
		
		btn0.setBounds(40,400,110,50);
		btn1.setBounds(40,340,50,50);
		btn4.setBounds(40,280,50,50);
		btn7.setBounds(40,220,50,50);
		btn_ac.setBounds(40,160,50,50);
		
		btn2.setBounds(100,340,50,50);
		btn5.setBounds(100,280,50,50);
		btn8.setBounds(100,220,50,50);
		btn_del.setBounds(100,160,50,50);
		
		btn_point.setBounds(160,400,50,50);
		btn3.setBounds(160,340,50,50);
		btn6.setBounds(160,280,50,50);
		btn9.setBounds(160,220,50,50);
		btn_mul.setBounds(160,160,50,50);
		
		btn_div.setBounds(220,160,50,50);
		btn_ent.setBounds(220,340,50,110);
		btn_add.setBounds(220,280,50,50);
		btn_sub.setBounds(220,220,50,50);
		
		
		
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn_point.addActionListener(this);
		btn_div.addActionListener(this);
		btn_mul.addActionListener(this);
		btn_sub.addActionListener(this);
		btn_add.addActionListener(this);
		btn_ent.addActionListener(this);
		btn_del.addActionListener(this);
		btn_ac.addActionListener(this);
		
		
		add(dis_exp);
		add(dis_ans);
		add(btn0);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn_ac);
		add(btn9);
		add(btn_point);
		add(btn_div);
		add(btn_mul);
		add(btn_sub);
		add(btn_add);
		add(btn_ent);
		add(btn_del);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn0) {
			show = show+"0";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn1) {
			show = show+"1";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn2) {
			show = show+"2";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn3) {
			show = show+"3";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn4) {
			show = show+"4";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn5) {
			show = show+"5";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn6) {
			show = show+"6";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn7) {
			show = show+"7";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn8) {
			show = show+"8";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn9) {
			show = show+"9";
			oneDigit = true;
			working = true;
		}
		if (e.getSource() == btn_point && oneDot == true) {
			if (oneDigit == false) {
				show = show+"0.";
			}
			else {
				show = show+".";
			}
			oneDot = false;
			oneDigit = true;
		}
		
		if (e.getSource() == btn_sub && oneDigit == true && working == true) {
			if (initial == true) {
				sum = Double.parseDouble(show);
				initial = false;
			}
			else {
				val = Double.parseDouble(show);
			}
			sub = true;
			sube = true;
			working = false;
			not_del = true;
		}
		if (e.getSource() == btn_add && oneDigit == true && working == true) {
			if (initial == true) {
				sum = Double.parseDouble(show);
				initial = false;
			}
			else {
				val = Double.parseDouble(show);
			}
			add = true;
			adde = true;
			working = false;
			not_del = true;
		}
		if (e.getSource() == btn_mul && oneDigit == true && working == true) {
			if (initial == true) {
				sum = Double.parseDouble(show);
			}
			else {
				val = Double.parseDouble(show);
			}
			mul = true;
			mule = true;
			working = false;
			not_del = true;
		}
		if (e.getSource() == btn_div && oneDigit == true && working == true) {
			if (initial == true) {
				sum = Double.parseDouble(show);
			}
			else {
				val = Double.parseDouble(show);
			}
			div = true;
			dive = true;
			working = false;
			not_del = true;
		}
		if (e.getSource() == btn_del) {
			show = removeLastChar(show);
			working = true;
			not_del = false;
			
		}
		if (e.getSource() == btn_ent && oneDigit == true && working == true) {
			if (initial == true) {
				sum = Double.parseDouble(show);
				initial = false;
			}
			else {
				val = Double.parseDouble(show);
			}
			ent = true;
			working = false;
			not_del = true;
		}
		
		if( working == false && not_del == true)
		{
			show = "";
		}
		
		if(add == true)
		{
			sum += val;
			add = false;
		}
		if(sub == true)
		{
			sum -= val;
			sub = false;
		}
		if(mul == true)
		{
			if (initial == true) {
				sum = sum;
				initial = false;
			}
			else {
				sum *= val;
			}
			mul = false;
		}
		if(div == true)
		{
			if (initial == true) {
				sum = sum;
				initial = false;
			}
			else {
				sum = sum / val;
			}
			div = false;
		}
		
		if(ent == true)
		{
			if(adde == true)
			{
				sum += val;
				adde = false;
			}
			if(sube == true)
			{
				sum -= val;
				sube = false;
			}
			if(mule == true)
			{
				if (initial == true) {
					sum = sum;
					initial = false;
				}
				else {
					sum *= val;
				}
				mule = false;
			}
			if(dive == true)
			{
				if (initial == true) {
					sum = sum;
					initial = false;
				}
				else {
					sum = sum / val;
				}
				dive = false;
			}
			ent = false;
		}
		if(e.getSource() == btn_ac)
		{
			show = "";
			oneDot = true;
			oneDigit = false;
			working = false;
			
			add = false;
			sub = false;
			mul = false;
			div = false;
			ent = false;
			
			adde = false;
			sube = false;
			mule = false;
			dive = false;
			
			initial = true;
			not_del = true;
			val = 0;
			sum = 0;
		}
		dis_ans.setText("Ans   : " + sum);
		dis_exp.setText(show);		
	}
	private static String removeLastChar(String str) {
		if(str != null && str.length() > 0) {
			return str.substring(0, str.length() - 1);
		}
		return str;
    }

}
