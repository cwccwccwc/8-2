package com.yc.spring.test7.user;

import com.yc.spring.test7.jdbcTemplate.JdbcTemplate;
import com.yc.spring.test7.jdbcTemplate.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class BankAccountDao extends JdbcTemplate {

    @Autowired
    public BankAccountDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<BankAccount> findAll(){
        return super.executeQuery("select * from atm", new RowMapper<BankAccount>() {
            @Override
            public BankAccount mapper(ResultSet rs, int i) throws SQLException {
                BankAccount ba = new BankAccount();
                ba.setId(rs.getInt(1));
                ba.setMoney(rs.getDouble(2));
                return ba;
            }
        });
    }

}
