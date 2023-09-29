package base.repositoryBase.impl;

import base.domain.BaseEntity;
import base.repositoryBase.BaseEntityRepository;

import java.io.Serializable;
import java.sql.Connection;

public abstract class BaseEntityRepositoryImpl<ID extends Serializable, NAME extends String,
        TYPE extends BaseEntity<ID, NAME>>
        implements BaseEntityRepository<ID, NAME, TYPE> {
    protected final Connection connection;

    public BaseEntityRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void Save(TYPE entity) {

    }

    @Override
    public BaseEntity findById(Serializable serializable) {
        return null;
    }

    @Override
    public void update(BaseEntity entity) {

    }

    @Override
    public BaseEntity findByName(String s) {
        return null;
    }

    @Override
    public void delete(Serializable serializable) {

    }
}
