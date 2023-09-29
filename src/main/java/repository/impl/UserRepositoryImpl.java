package repository.impl;

import base.repositoryBase.BaseEntityRepository;
import base.repositoryBase.impl.BaseEntityRepositoryImpl;
import domain.User;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<Integer, String, User>
        implements UserRepository {
    public UserRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getCountQuestionMarkForParams() {
        return "(?)";
    }

    @Override
    public String getColumnsName() {
        return "(name)";
    }

    @Override
    public String getTableName() {
        return "users";
    }

    @Override
    protected User mapResultSetEntity(ResultSet resultSet) throws SQLException {
        User user = new User(resultSet.getInt(1),
                resultSet.getString(2));
        user.setId(resultSet.getInt(1));
        return user;
    }


    @Override
    protected void fillParamForStatement(PreparedStatement preparedStatement, User entity, boolean b) {

    }

    @Override
    protected String getUpdateQueryParams() {
        return null;
    }
}
