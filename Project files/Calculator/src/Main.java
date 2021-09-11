import javax.swing.JFrame;

public class Main {

	public static JFrame cal = new JFrame();
	public static void main(String[] args) {
		
		Calculator page = new Calculator();
		cal.add(page);
		cal.setSize(310,500);
		cal.setVisible(true);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setResizable(false);

	}

}
