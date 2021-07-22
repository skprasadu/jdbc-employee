package com.example.jdbcdemo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.jdbcdemo.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	private JdbcTemplate jdbcTemplate;

	protected DataSource datasource;

	public ProjectServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		datasource = this.jdbcTemplate.getDataSource();
	}
	
	@Override
	public List<Project> getAll() {
		//*************************************************
		//README: Below is pretty much the template for all other CRUD functions like create, read, update and delete
		// 
		// ONLY DOMAIN OBJECT WILL CHANGE AS SQL STATEMENT, IN SOME CASES IT WILL BE "PROJECT",
		// IN SOME CASES IT WILL BE "PRODUCT"
		//*************************************************
		String sql = "select * from project";

		try (Connection connection = datasource.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql)) {

			ArrayList<Project> array = new ArrayList<>();
			System.out.println("************* Valid connection" + connection);
			System.out.println("************* Valid statement" + statement);
			
			//TODO: The candidate has to fix this issue and implement other methods using JDBC
			
			/*ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Project m = new Project();

				m.setId(rs.getLong("id"));
				m.setName(rs.getString("name"));

				array.add(m);
			}*/
		 
			return array;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;	
	}
	
	@Override
	public Project getById(Long id) {
		//TODO: Implement get by Id function using JDBC
		
		return null;
	}

	@Override
	public void create(Project project) {
		//TODO: Implement create function using JDBC

	}

	@Override
	public void update(Project project) {
		//TODO: Impleement update function using JDBC

	}

	@Override
	public void deleteById(long l) {
		//TODO: Implement delete function using JDBC

	}

}
