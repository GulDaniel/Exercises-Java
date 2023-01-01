import javax.swing.JOptionPane;

public class TesteEmpresa {
	public static void main(String args[]) {
		Cliente c = new Cliente();
		c.setNome("Hans");
		c.setIdade(22);
		c.setSexo("Masculino");
		c.setValorDivida(5500);
		c.setAnoNascim(2000);
		
		JOptionPane.showMessageDialog(null, c.toString());
		
		Gerente g = new Gerente();
		g.setNome("Fritz");
		g.setIdade(21);
		g.setMatricula("1234567");
		g.setNomeGerencia("Holga");
		g.valorinss();
		g.setSalario(2000);
		
		JOptionPane.showMessageDialog(null, g.toString());
	
		Vendedor v = new Vendedor();
		v.setNome("Laura");
		v.setSalario(3200);
		v.setValorVendas(14284);
		v.setQntVendas(42);
		JOptionPane.showMessageDialog(null, v.toString());
	}
}
