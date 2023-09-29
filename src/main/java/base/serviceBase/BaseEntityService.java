package base.serviceBase;

import java.sql.SQLException;

@SuppressWarnings("unused")
public interface BaseEntityService<ID, NAME, TYPE> {

    void Save(TYPE entity) throws SQLException;

    TYPE findById(ID id);

    void update(TYPE entity);

    TYPE findByName(NAME name);

    void delete(ID id);

}
