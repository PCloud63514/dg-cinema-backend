package com.dg_cinema.booking.api;

import com.dg_cinema.booking.domain.Booking;
import com.dg_cinema.booking.domain.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
class BookingApi {
    private final BookingRepository bookingRepository;

    @GetMapping("api/booking")
    Object test() {
        final List<Booking> all = bookingRepository.findAll();
        return null;
    }
}
