package base.repositoryBase;

import base.domain.BaseEntity;

import java.io.Serializable;

public interface BaseEntityRepository<ID extends Serializable, NAME extends String, TYPE extends BaseEntity<ID, NAME>> {
    void Save(TYPE entity);

    TYPE findById(ID id);

    void update(TYPE entity);

    TYPE findByName(NAME name);

    void delete(ID id);


}
