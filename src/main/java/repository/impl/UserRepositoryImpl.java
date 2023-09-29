package repository.impl;

import base.repositoryBase.BaseEntityRepository;
import base.repositoryBase.impl.BaseEntityRepositoryImpl;
import domain.User;
import repository.UserRepository;

import java.sql.Connection;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<Integer, String, User>
        implements UserRepository {
    public UserRepositoryImpl(Connection connection) {
        super(connection);
    }


    @Override
    public User findById(Integer integer) {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
