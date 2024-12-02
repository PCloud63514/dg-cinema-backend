package com.dg_cinema.booking.infra;

import com.dg_cinema.booking.domain.Booking;
import com.dg_cinema.booking.domain.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
class BookingAdapter implements BookingRepository {
    private final BookingJpaRepository bookingJpaRepository;

    @Override
    public Booking save(final Booking root) {
        return bookingJpaRepository.save(root);
    }

    @Override
    public Optional<Booking> find(final Long id) {
        return bookingJpaRepository.findById(id);
    }

    @Override
    public void delete(final Long id) {

    }

    @Override
    public void delete(final Booking root) {

    }

    @Override
    public List<Booking> findAll() {
        return bookingJpaRepository.findAll();
    }
}
