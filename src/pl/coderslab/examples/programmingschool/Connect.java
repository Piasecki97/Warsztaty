package pl.coderslab.examples.programmingschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static Connection connect() {
		Connection	conn = null;
	try {
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Warsztaty", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		} catch (SQLException e) {
		e.printStackTrace();
		}
	return conn;
	}

}
