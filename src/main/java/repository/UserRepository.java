package repository;

import base.repositoryBase.BaseEntityRepository;
import domain.User;

import java.io.Serializable;

public interface UserRepository extends
        BaseEntityRepository<Integer, String, User> {


}
