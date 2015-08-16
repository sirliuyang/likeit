package com.formula.likeit.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.formula.likeit.dao.IUserDAO;
import com.formula.likeit.entity.User;

@Repository("userDao")
public class UserDAO implements IUserDAO{

	private JdbcTemplate jdbcTemplate;
	
	@Resource(name="jdbcTemplate")
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean insert() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void test() {
		System.out.println("query db");
	}

	@Override
	public List<User> findAllUser() {
		String sql = "SELECT * FROM USR";
		final List<User> listUser = new ArrayList<User>();
		
		jdbcTemplate.query(sql, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException{
				User u = new User();
				u.setUid(rs.getLong("uid"));
				u.setNickName(rs.getString("nickname"));
				u.setContact(rs.getString("contact"));
				listUser.add(u);
			}
		});
		
		return listUser;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
