package domain;

import base.domain.BaseEntity;

public class Role extends BaseEntity<Integer, String> {
    private String description;

    public Role(Integer integer, String s, String description) {
        super(integer, s);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
