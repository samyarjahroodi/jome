package base.repositoryBase.impl;

import base.domain.BaseEntity;
import base.repositoryBase.BaseEntityRepository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("unused")
public abstract class BaseEntityRepositoryImpl<ID extends Serializable, NAME extends String,
        TYPE extends BaseEntity<ID, NAME>>
        implements BaseEntityRepository<ID, NAME, TYPE> {
    protected final Connection connection;

    public BaseEntityRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void Save(TYPE entity) throws SQLException {
        String sql = "INSERT INTO " + getTableName() + "  " + getColumnsName() + " VALUES " + getCountQuestionMarkForParams();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        fillParamForStatement(preparedStatement, entity, false);
        preparedStatement.executeUpdate();
    }

    @Override
    public TYPE findById(ID id) throws SQLException {
        String sql = "SELECT * FROM" + getTableName() + "WHERE id=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, (Integer) id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return mapResultSetEntity(resultSet);
        }
        return null;
    }

    @Override
    public void update(TYPE entity) throws SQLException {
        String sql = "UPDATE FROM" + getTableName() + "SET " + getUpdateQueryParams() + "WHERE id=" + entity.getId();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        fillParamForStatement(preparedStatement, entity, false);
        preparedStatement.executeUpdate();

    }

    @Override
    public TYPE findByName(String s) throws SQLException {
        String sql = "SELECT * FROM" + getTableName() + "WHERE name=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, s);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return mapResultSetEntity(resultSet);
        }
        return null;
    }

    @Override
    public void delete(ID id) throws SQLException {
        String sql = "DELET FROM " + getTableName() + "WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, (Integer) id);
        preparedStatement.executeUpdate();
    }

    public abstract String getCountQuestionMarkForParams();

    public abstract String getColumnsName();

    public abstract String getTableName();

    protected abstract TYPE mapResultSetEntity(ResultSet resultSet) throws SQLException;

    protected abstract void fillParamForStatement(PreparedStatement preparedStatement, TYPE entity, boolean b);

    protected abstract String getUpdateQueryParams();

}
