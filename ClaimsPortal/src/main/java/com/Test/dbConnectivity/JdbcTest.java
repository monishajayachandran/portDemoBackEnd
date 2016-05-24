package com.Test.dbConnectivity;

import java.sql.*;

public class JdbcTest {
	public Connection getConnection() {
		Connection conctn = null;

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String url = "jdbc:ucanaccess://C:/software/Member_Portal.accdb";
			conctn = DriverManager.getConnection(url);

		} catch (Exception sqlExcptn) {
			System.out.println(sqlExcptn);
		}

		return conctn;
	}
}
