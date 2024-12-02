package com.dg_cinema.booking.domain;

import com.dg_cinema.support.base.Repository;

import java.util.List;

public interface BookingRepository extends Repository<Booking, Long> {
    List<Booking> findAll();
}
