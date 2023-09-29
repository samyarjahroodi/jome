package base.serviceBase.impl;

import base.domain.BaseEntity;
import base.repositoryBase.BaseEntityRepository;
import base.serviceBase.BaseEntityService;

import java.io.Serializable;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class BaseEntityServiceImpl
        <ID extends Serializable, NAME extends String, TYPE extends BaseEntity<ID, NAME>,
                R extends BaseEntityRepository<ID, NAME, TYPE>>
        implements BaseEntityService<ID, NAME, TYPE> {

    protected final R repository;

    public BaseEntityServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public void Save(TYPE entity) throws SQLException {
        repository.Save(entity);
    }

    @Override
    public TYPE findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public void update(TYPE entity) {
        repository.update(entity);
    }

    @Override
    public TYPE findByName(NAME name) {
        return repository.findByName(name);
    }

    @Override
    public void delete(ID id) {
        repository.delete(id);
    }
}
