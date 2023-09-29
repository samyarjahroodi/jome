package service.impl;

import base.serviceBase.BaseEntityService;
import base.serviceBase.impl.BaseEntityServiceImpl;
import domain.User;
import repository.UserRepository;
import service.UserService;

import java.sql.SQLException;

public class UserServiceImpl
        extends BaseEntityServiceImpl<Integer, String, User, UserRepository>
        implements UserService {


    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

}
