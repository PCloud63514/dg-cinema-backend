package com.dg_cinema.booking.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter
public class BookingItemId implements Serializable {
    private Long bookingId;
    private Long screeningSeatId;
}
