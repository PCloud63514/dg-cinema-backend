package com.dg_cinema.booking.app;

import com.dg_cinema.booking.BookingFixture;
import com.dg_cinema.booking.app.usecase.BookingCommand;
import com.dg_cinema.booking.app.usecase.BookingResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BookingServiceTest {
    @InjectMocks
    private BookingService bookingService;

    @Test
    @DisplayName("예약을 하면 예약 결과를 반환한다.")
    void booking_should_return_booking_result() {
        final BookingCommand givenCommand = BookingFixture.anBookingCommand().build();
        final BookingResult result = bookingService.booking(givenCommand);
        assertThat(result).isNotNull();
    }
}
