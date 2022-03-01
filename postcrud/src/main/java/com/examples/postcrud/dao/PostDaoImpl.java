package com.examples.postcrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.examples.postcrud.model.posts;

public class PostDaoImpl implements PostDao {
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String username = "root";
	String password = "password";
	static Connection con;
	static PreparedStatement pst;
	
	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "password";
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<posts> getAllPosts() throws SQLException {
		// TODO Auto-generated method stub
		List<posts> posts = new ArrayList();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from posts");
		while (rs.next()) {
			posts.add(new posts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}

		return posts;
	}

	public String inserPost(posts posts) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into posts values(?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, posts.getPid());
		pst.setString(2, posts.getAuthor());
		pst.setString(3, posts.getTitle());
		pst.setString(4, posts.getDiscription());
		pst.executeUpdate();
		return "Record Inserted...";
	}

}