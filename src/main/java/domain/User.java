package domain;

import base.domain.BaseEntity;

public class User extends BaseEntity<Integer, String> {
    public User(Integer integer, String s) {
        super(integer, s);
    }

}
