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
		//TODO: Impleement get all function using JDBC
		
		return null;
	}
	
	@Override
	public Project getById(Long id) {
		//TODO: Impleement get by Id function using JDBC
		
		return null;
	}

	@Override
	public void create(Project model) {
		//TODO: Impleement create function using JDBC

	}

	@Override
	public void update(Project e) {
		//TODO: Impleement update function using JDBC

	}

	@Override
	public void deleteById(long l) {
		//TODO: Impleement delete function using JDBC

	}

}
