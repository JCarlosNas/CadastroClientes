package ClienteConta;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clientes c1 = new Clientes(001, "Joao", new Date());
		
		Clientes c2 = new Clientes(002, "Paula", new Date());
		
		
		System.out.println(c1.numeroCadastro + " " + c1.nomeCliente + 
				" " + c1.dataCadastro  );
		
		
		
		
		
		
	}

}
