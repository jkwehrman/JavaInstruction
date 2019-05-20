package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import business.User;

public class userDB implements DAO<User>  {
	private static Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prs"; //677 similar
		String username = "prs_user";  //don't use root password!!!  Thanos power!  granted only certain privileges to user
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn; //establish connection with the database and return it
	}

	//@Override
	public static User get(int id) {  //get -> getAll
		String sql = "SELECT * FROM user where ID = ?";
		try {
			Connection conn = getConnection();

			PreparedStatement ps = conn.prepareStatement(sql); {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					int ID = rs.getInt("Id");
					String userName = rs.getString("userName");
					String password = rs.getString("password");
					String firstName = rs.getString("firstName");
					String lastName = rs.getString("lastName");
					String phoneNumber = rs.getString("phoneNumber");
					String email = rs.getString("email");
					Boolean isReviewer = rs.getBoolean("isReviewer");
					Boolean isAdmin = rs.getBoolean("isAdmin");

					User t = new User(ID, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
					return t;				

				}
				else {
					rs.close();
					return null;
				}
			} }catch (SQLException e) {
				System.err.println(e);
				return null;

			}
	}

	//@Override
	public List<User> getAll() {

		String user_Select = "SELECT ID, UserName, Password, FirstName, LastName, PhoneNumber, "
				+ "Email, IsReviewer, IsAdmin FROM User";
		//id.add(u);
		//declare list in type product
		//SQL is NOT case sensitive
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(user_Select)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//paste here
				int id = rs.getInt("Id");
				String userName = rs.getString("userName");
				String password = rs.getString("password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");
				Boolean isReviewer = rs.getBoolean("isReviewer");
				Boolean isAdmin = rs.getBoolean("isAdmin");
				//create a new instance of product

				//I am here
				User t = new User();
				t.setId(id);
				t.setUserName(userName);
				t.setPassword(password);
				t.setFirstName(firstName);
				t.setLastName(lastName);
				t.setPhoneNumber(phoneNumber);
				t.setEmail(email);
				t.setIsReviewer(isReviewer);
				t.setIsAdmin(isAdmin);
				//User t = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
				users.add(t);

			}

		}
		catch (SQLException e) {
			System.err.println(e);
			users = null;	
		}
		return users;
	}

	//	@Override
	public boolean add(User t) {
		String sql = "INSERT INTO User (userName, password, firstName, lastName, "
				+ "phoneNumber, email, isReviewer, isAdmin) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		// =============================================================
		//		String sql = "INSERT INTO Stuffy (Type, Color, Size, Limbs)" +
		//				"VALUES (?, ?, ?, ?)";
		//		(userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin)

		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString (1, t.getUserName());
			ps.setString(2, t.getPassword());
			ps.setString(3, t.getFirstName());
			ps.setString (4, t.getLastName());
			ps.setString(5, t.getPhoneNumber());
			ps.setString(6, t.getEmail());
			ps.setBoolean (7, t.getIsReviewer());
			ps.setBoolean(8, t.getIsAdmin());

			ps.executeUpdate();
			return true;
		}
		catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}  



	private int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	//@Override
	public boolean update(User t) {

		String sql = "UPDATE User SET userName = ?, password = ?, firstName = ?, lastName = ?, "
				+ "phoneNumber = ?, email = ?, isReviewer = ?, isAdmin = ?)" +
				"Where id = ? ";

		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString (1, t.getUserName());
			ps.setString(2, t.getPassword());
			ps.setString(3, t.getFirstName());
			ps.setString (4, t.getLastName());
			ps.setString(5, t.getPhoneNumber());
			ps.setString(6, t.getEmail());
			ps.setBoolean (7, t.getIsReviewer());
			ps.setBoolean(8, t.getIsAdmin());
			ps.setInt(9, t.getId());

			ps.executeUpdate();
			return true;
		}
		catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

	//	@Override
	public boolean delete(User t) {
		String sql = "delete from user " +
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

	@Override
	public User get(String user) {
		return null;
	}

	@Override
	public boolean delete(int user) {
		return false;
	}

}

