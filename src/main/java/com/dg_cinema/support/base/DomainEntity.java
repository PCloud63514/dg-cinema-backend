package com.dg_cinema.support.base;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public abstract class DomainEntity<T extends DomainEntity<T,TID>, TID> implements DomainObject {
    public abstract TID getId();

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (null == obj || getClass() != obj.getClass()) return false;
        final T other = (T) obj;
        if (null == getId()) return false;
        return getId().equals(other.getId());
    }

    @Override
    public int hashCode() {
        return null == getId() ? 0 : getId().hashCode();
    }
}
