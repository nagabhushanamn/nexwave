package com.mts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

@Repository("jdbcAccountRepo")
public class JdbcAccountRepository implements AccountRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public Account load(String num) {
		String sql = "select * from mts.ACCOUNTS where num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Account>() {
			@Override
			public Account mapRow(ResultSet rs, int i) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString(1));
				account.setBalance(rs.getDouble(2));
				account.setAccHolderName(rs.getString(3));
				return account;
			}
		}, num);
	}

	public void update(Account account) {
		String sql = "update mts.ACCOUNTS set balance=? where num=?";
		jdbcTemplate.update(sql, account.getBalance(), account.getNum());
	}

}
