package base.domain;

import java.io.Serializable;

@SuppressWarnings("unused")
public class BaseEntity<ID extends Serializable, NAME extends String> {
    private ID id;
    private NAME name;

    public BaseEntity(ID id, NAME name) {
        this.id = id;
        this.name = name;
    }

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}
