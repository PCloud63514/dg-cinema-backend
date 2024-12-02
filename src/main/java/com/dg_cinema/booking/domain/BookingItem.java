package com.dg_cinema.booking.domain;

import com.dg_cinema.support.base.DomainEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDateTime;

@Table(name = "BOOKING_ITEM")
@Entity
@Getter
public class BookingItem extends DomainEntity<BookingItem, BookingItemId> {
    @EmbeddedId
    private BookingItemId id;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
}
