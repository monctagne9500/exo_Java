package fr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestDB01 {



	public TestDB01() {

	}

	public static void main(String[] args) {

		final String dbDriver = "com.mysql.jdbc.Driver";
		final String dbUrl = "jdbc:mysql://localhost/banque";
		final String dbLogin = "root";
		final String dbPwd = "";

		Connection connection = null;
		Statement request = null;
		ResultSet resultat = null;

		try {
			Class.forName(dbDriver);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(dbUrl, dbLogin, dbPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			request = connection.createStatement();
		} catch (SQLException e) {
			//
			// e.printStackTrace();
		}

		try {
			resultat = request.executeQuery("select * from utilisateur");
		} catch (SQLException e) {
			//
			// e.printStackTrace();
		}

		try {
			while (resultat.next()) {
				System.out.println(resultat.getString("nom"));
				System.out.println(resultat.getString("prenom"));
			}
		} catch (SQLException e) {
			//
			// e.printStackTrace();
		}


		finally {
			if (resultat != null) {
				try {
					resultat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (request != null) {
				try {
					request.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}



	}

}
