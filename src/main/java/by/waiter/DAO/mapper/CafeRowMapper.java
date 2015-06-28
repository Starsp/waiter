package by.waiter.DAO.mapper;

import by.waiter.model.Cafe;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class CafeRowMapper implements RowMapper<Cafe> {

    public static final CafeRowMapper INSTANCE = new CafeRowMapper();

    public Cafe mapRow(ResultSet resultSet, int i) throws SQLException {
        Cafe cafe = new Cafe();
        cafe.setId(resultSet.getInt("id"));
        cafe.setName(resultSet.getString("name"));

        return cafe;
    }
}
