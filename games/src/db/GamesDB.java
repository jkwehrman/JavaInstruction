//This is cut and pasted code


package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Games;

public class GamesDB implements DAO<Games> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/games"; //677 similar
		String username = "stuffyUser";  //don't use root password!!!  Thanos power!  granted only certain privileges to user
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn; //establish connection with the database and return it
	}

//	  Name						VARCHAR(25)             NOT NULL,
//	  Type        				VARCHAR(15)    			NOT NULL,    
//	  MinimumPlayers			INT   					NOT NULL,
//	  MaximumPlayers			INT   					NOT NULL,
//	  Description				VARCHAR(125)    		NOT NULL
	
	public Games get(int name) {
		String sql = "SELECT * FROM games where id = ?";
		List<Games> games = new ArrayList<>();
		try {
		Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,  id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
//				String name = rs.getString("Name");
				String type = rs.getString("Type");
				int minimumPlayers = rs.getInt("Minimum Number of Players");
				int maximumPlayers = rs.getInt("Maximum Number of Players");
				String description = rs.getString("Description");
				Games g = new Games(name, type, minimumPlayers, maximumPlayers, description);
				return g;
			}
			else {
			rs.close();
			return null;
			}
		} catch (SQLException e) {

			System.err.println(e);
			return null;

		}
	}

	@Override
	public List<Games> getAll() {
		String sql = "SELECT * FROM Stuffy";
		//declare list in type product
		//SQL is NOT case sensitive
		List<Games> stuffies = new ArrayList<>();
		try {
		Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("Id");
				String type = rs.getString("Type");
				String color = rs.getString("Color");
				String size = rs.getString("Size");
				int limbs = rs.getInt("Limbs");
			//	(id, type, color, size, limbs)
				//create a new instance of product
				Games s = new Games(id, type, color, size, limbs);
				stuffies.add(s);	
			}
		}
		catch (SQLException e) {
			System.err.println(e);
			stuffies = null;	
		}
		return stuffies;
	}

	@Override
	public boolean add(Games t) {
		String sql = "INSERT INTO Stuffy (Type, Color, Size, Limbs)" +
				"VALUES (?, ?, ?, ?)";
		try {
		Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getType());
			ps.setString(2, t.getColor());
			ps.setString(3, t.getSize());
			ps.setInt (4, t.getLimbs());

			ps.executeUpdate();
			return true;
		}
		catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}  
	@Override
	public boolean update(Games t) {
		String sql = "UPDATE Stuffy SET "
				+ " Color = ? "
				+ "WHERE ID = ?";
		try 
		(Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getColor());
			ps.setInt(2, t.getId());
		ps.executeUpdate();
		return true;
	}
	catch (SQLException e) {
		System.err.println(e);
		return false;
	}
}
	@Override
	public boolean delete(Games t) {
		String sql = "delete from Stuffy " +
				"where id =  ?";
		try 
		(Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, t.getId());
			ps.executeUpdate();
			return true;
			
		} catch (SQLException e) {
		System.err.println(e); 
		return false;
		}
		
		
	}

}
