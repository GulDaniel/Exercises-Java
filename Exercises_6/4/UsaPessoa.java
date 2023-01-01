import javax.swing.JOptionPane;

public class UsaPessoa {
	public static void main(String args[]) {

		String pessoaSalario = "";		

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Mario");
		pessoa1.setSobrenome("Lopes");
		
		Funcionario pessoa2 = new Funcionario();
		pessoa2.setNome("Lucas");
		pessoa2.setSobrenome("Mendes");
		pessoa2.setSalario(2000);
		
		Professor pessoa3 = new Professor();
		pessoa3.setNome("Rafael");
		pessoa3.setSobrenome("Lira");
		pessoa3.setSalario(500);
		
		pessoaSalario += pessoa1.getNomeCompleto() + "\n" +	
		pessoa2.getNomeCompleto() + "\n" + pessoa3.getNomeCompleto() + "\n" +
		pessoa2.getNome() + " primeira parcela: " + pessoa2.getSalarioPrimeiraParcela() + "\n" +
		pessoa2.getNome() + " primeira parcela: " + pessoa2.getSalarioSegundaParcela() + "\n" +
		pessoa3.getNome() + " primeira parcela: " + pessoa3.getSalarioPrimeiraParcela() + "\n" +
		pessoa3.getNome() + " primeira parcela: " + pessoa3.getSalarioSegundaParcela();

		JOptionPane.showMessageDialog(null, pessoaSalario);	
	}
}
