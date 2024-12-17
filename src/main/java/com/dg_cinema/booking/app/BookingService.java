package com.dg_cinema.booking.app;

import com.dg_cinema.booking.app.usecase.BookingCommand;
import com.dg_cinema.booking.app.usecase.BookingResult;
import com.dg_cinema.booking.app.usecase.BookingUseCase;
import org.springframework.stereotype.Service;

@Service
class BookingService implements BookingUseCase {

    @Override
    public BookingResult booking(final BookingCommand command) {
        return BookingResult.builder()
                .build();
    }
}
