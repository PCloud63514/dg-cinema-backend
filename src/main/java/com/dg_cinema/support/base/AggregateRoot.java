package com.dg_cinema.support.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Transient;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class AggregateRoot<T extends DomainEntity<T, TID>, TID> extends DomainEntity<T, TID> {
    @JsonIgnore
    @Transient
    private final transient List<Object> domainEvents = new ArrayList<>();

    protected AggregateRoot() {
    }

    protected <ET> ET registerEvent(final ET event) {
        Assert.notNull(event, "AggregateRoot.event must not be null");
        this.domainEvents.add(event);
        return event;
    }

    protected void clearDomainEvents() {
        this.domainEvents.clear();
    }

    protected Collection<Object> domainEvents() {
        return Collections.unmodifiableList(this.domainEvents);
    }
}
