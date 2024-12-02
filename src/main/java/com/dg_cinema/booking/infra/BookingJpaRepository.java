package com.dg_cinema.booking.infra;


import com.dg_cinema.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

interface BookingJpaRepository extends JpaRepository<Booking, Long> {
}
