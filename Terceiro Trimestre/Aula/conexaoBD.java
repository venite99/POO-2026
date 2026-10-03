package Aula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class conexaoBD {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:5244/escola";
		String usuario = "root";
		String senha = "";
		
		String nome = "Wellington";
		int idade = 27;
		String email = "wellington@email.com"; 
		
		try {
			Connection con = DriverManager.getConnection(
					url,
					usuario,
					senha
					);
			System.out.println("Conexão realizada com sucesso");
			
			Statement sql = con.createStatement();
			sql.executeUpdate(
					"INSERT INTO aluno (nome, idade, email) "
					+ "VALUES ('Ayslan', 45, 'ayslan@email.com')");
			
			//Usando PreparedStatement
			
			String consulta = "INSERT INTO aluno (nome, idade, email)" +
			"VALUES(?,?,?)";
			
			PreparedStatement sql2 = con.prepareStatement(consulta);
			sql2.setString(1, nome);
			sql2.setInt(2, idade);
			sql2.setString(3, email);
			
			sql2.executeUpdate();
			
		
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: "+ e.getMessage());
		}

	}

}
