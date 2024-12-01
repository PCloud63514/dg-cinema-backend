package com.dg_cinema.support.base;

import java.util.Optional;

public interface Repository<AR extends AggregateRoot<AR, ARID>, ARID> {
    AR save(AR root);
    Optional<AR> find(ARID id);
    void delete(ARID id);
    void delete(AR root);
}
