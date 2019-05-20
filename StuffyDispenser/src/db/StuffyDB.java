package db;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

import business.Stuffy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
//import com.prs.business.User;



public class StuffyDB implements DAO<Stuffy> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffy"; //677 similar
		String username = "stuffyUser";  //don't use root password!!!  Thanos power!  granted only certain privileges to user
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn; //establish connection with the database and return it
	}

	public Stuffy get(int id) {
		String sql = "SELECT * FROM stuffy where id = ?";
		List<Stuffy> stuffy = new ArrayList<>();
		try {
		Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,  id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String type = rs.getString("Type");
				String color = rs.getString("Color");
				String size = rs.getString("Size");
				int limbs = rs.getInt("Limbs");
				Stuffy s = new Stuffy(id, type, color, size, limbs);
				return s;
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
	public List<Stuffy> getAll() {
		String sql = "SELECT * FROM Stuffy";
		//declare list in type product
		//SQL is NOT case sensitive
		List<Stuffy> stuffies = new ArrayList<>();
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
				Stuffy s = new Stuffy(id, type, color, size, limbs);
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
	public boolean add(Stuffy t) {
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
	public boolean update(Stuffy t) {
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
	public boolean delete(Stuffy t) {
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

/*
 * package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB implements DAO<Stuffy> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffy"; //677 similar
		String username = "stuffyUser";  //don't use root password!!!  Thanos power!  granted only certain privileges to user
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn; //establish connection with the database and return it
	}

	public Stuffy get(int id) {
		String sql = "SELECT * FROM stuffy where id = ?";
		List<Stuffy> stuffy = new ArrayList<>();
		try {
		Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,  id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String type = rs.getString("Type");
				String color = rs.getString("Color");
				String size = rs.getString("Size");
				int limbs = rs.getInt("Limbs");
				Stuffy s = new Stuffy(id, type, color, size, limbs);
				return s;
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
	public List<Stuffy> getAll() {
		String sql = "SELECT * FROM Stuffy";
		//declare list in type product
		//SQL is NOT case sensitive
		List<Stuffy> stuffies = new ArrayList<>();
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
				Stuffy s = new Stuffy(id, type, color, size, limbs);
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
	public boolean add(Stuffy t) {
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
	public boolean update(Stuffy t) {
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
	public boolean delete(Stuffy t) {
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

 **/
