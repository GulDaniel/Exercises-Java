import javax.swing.JOptionPane;

public class Primos {
	public static void main(String args[]) {
	int n, m = 0, flag;
	String primos = "";
	
	for (n = 100; m < 10; n++){
		flag = 0;
		for (int i = 2; i < n / 2; i++){
			if (n % i == 0){
			flag = 1;
			break;
			}
		}
		if (flag == 0){
		primos += String.valueOf(n) + "\n";
		m++;
		}
	}

	JOptionPane.showMessageDialog(null, "10 primeiros números primos após 100\n" + primos);
	}
}
