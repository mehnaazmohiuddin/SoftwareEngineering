package com.mehnaaz.makeadonation.repository;

import com.mehnaaz.makeadonation.model.Charity;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.Currency;
import java.util.Date;
import java.util.List;

public class CharityTemplate {
    private final JdbcTemplate jdbcTemplate;

    public CharityTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Charity> getAll() throws  SQLException{
        String sql = "SELECT * FROM Charity";
        List<Charity> charityList =   jdbcTemplate.query(sql, CharityTemplate::mapRow);
        return charityList;
    }

    private static <List> Charity mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            return  new Charity( resultSet.getInt(0),resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
               resultSet.getString(3),
                    new Date(resultSet.getInt(5)),
                    resultSet.getString(6) );
    }


}
