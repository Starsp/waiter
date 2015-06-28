package by.waiter.DAO.mapper;

import by.waiter.model.Unit;
import org.springframework.jdbc.core.RowMapper;
;import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class UnitRowMapper implements RowMapper<Unit> {

    public static final UnitRowMapper INSTANCE = new UnitRowMapper();

    private UnitRowMapper() {
    }

    public Unit mapRow(ResultSet resultSet, int i) throws SQLException {
        Unit unit = new Unit();
        unit.setId(resultSet.getInt("id"));
        unit.setName(resultSet.getString("name"));
        return unit;
    }

}
