package com.examples.postcrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.model.posts;

public interface PostDao {
	public List<posts> getAllPosts() throws SQLException;
	public String inserPost(posts posts) throws SQLException;
}