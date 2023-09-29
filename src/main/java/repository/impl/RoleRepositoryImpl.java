package repository.impl;

import base.repositoryBase.impl.BaseEntityRepositoryImpl;
import domain.Role;
import domain.User;
import repository.RoleRepository;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleRepositoryImpl
        extends BaseEntityRepositoryImpl<Integer, String, Role>
        implements RoleRepository {

    public RoleRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getCountQuestionMarkForParams() {
        return "(?,?)";
    }

    @Override
    public String getColumnsName() {
        return "(description,nameOfRole)";
    }

    @Override
    public String getTableName() {
        return "roles";
    }

    @Override
    protected Role mapResultSetEntity(ResultSet resultSet) throws SQLException {
        Role role = new Role(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3));
        role.setId(resultSet.getInt(1));
        return role;
    }

    @Override
    protected void fillParamForStatement(PreparedStatement preparedStatement, Role entity, boolean b) throws SQLException {
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2,entity.getDescription() );

    }

    @Override
    protected String getUpdateQueryParams() {
        return null;
    }
}
