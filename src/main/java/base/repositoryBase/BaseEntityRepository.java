package base.repositoryBase;

import base.domain.BaseEntity;

import java.io.Serializable;
import java.sql.SQLException;

public interface BaseEntityRepository<ID extends Serializable,
        NAME extends String, TYPE extends BaseEntity<ID, NAME>> {

    void Save(TYPE entity) throws SQLException;

    TYPE findById(ID id) throws SQLException;

    void update(TYPE entity) throws SQLException;

    TYPE findByName(NAME name) throws SQLException;

    void delete(ID id) throws SQLException;

}
