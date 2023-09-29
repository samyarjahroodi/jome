package base.serviceBase;

import java.sql.SQLException;

@SuppressWarnings("unused")
public interface BaseEntityService<ID, NAME, TYPE> {

    void Save(TYPE entity) throws SQLException;

    TYPE findById(ID id) throws SQLException;

    void update(TYPE entity) throws SQLException;

    TYPE findByName(NAME name) throws SQLException;

    void delete(ID id) throws SQLException;

}
