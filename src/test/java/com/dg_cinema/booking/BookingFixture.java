package com.dg_cinema.booking;

import com.dg_cinema.booking.app.usecase.BookingCommand;

public class BookingFixture {

    public static BookingCommand.BookingCommandBuilder anBookingCommand() {
        return BookingCommand.builder();
    }
}
