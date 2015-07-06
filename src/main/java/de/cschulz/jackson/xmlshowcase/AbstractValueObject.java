package de.cschulz.jackson.xmlshowcase;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractValueObject<V> {
    private V value;

    protected AbstractValueObject() {
    }

    public AbstractValueObject(V value) {
        this.value = value;
    }

    protected V getValue() {
        return this.value;
    }
}