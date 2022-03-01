package com.examples.postcrud.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.examples.postcrud.model.posts;
import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;

public class PostsMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PostService service= new PostServiceImpl();
		/*List<Posts> posts = service.getAllPosts();
		for(Posts p:posts) {
			System.out.println(p.getPid()+" "+p.getTitle()+" "+p.getAuthor()+" "+p.getDiscription());
		}
		*/
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		System.out.println("Enter title ");
		String title = sc.next();
		System.out.println("Enter author ");
		String author = sc.next();
		System.out.println("Enter discription ");
		String discription = sc.next();
		String result = service.inserPost(new posts(pid,author,title,discription));
		
		System.out.println(result);
		

	}

}