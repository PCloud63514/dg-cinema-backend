package com.dg_cinema.support.base;

import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class ValueObject<T extends ValueObject<T>> implements DomainObject {
    @Override
    public int hashCode() {
        return Arrays.hashCode(getEqualityFields());
    }

    @Override
    public boolean equals(final Object obj) {
        if(null == obj) return false;
        if (!(obj.getClass().equals(getClass()))) return false;
        final T other = (T) obj;
        return Arrays.equals(getEqualityFields(), other.getEqualityFields());
    }

    protected Object[] getEqualityFields() {
        return Arrays.stream(getClass().getDeclaredFields())
                .map(this::getFieldValue).toArray();
    }

    private Object getFieldValue(final Field field) {
        try {
            field.setAccessible(true);
            return field.get(this);
        } catch (final IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
