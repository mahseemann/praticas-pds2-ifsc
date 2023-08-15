package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {
	
	public boolean inserir(Pessoa p) {
		
		Conexao c = Conexao.getInstacia();
		Connection con = c.conectar();
		
		return true;
	}

}
