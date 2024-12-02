package com.dg_cinema.booking.domain;

import com.dg_cinema.support.base.AggregateRoot;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Table(name = "BOOKING")
@Entity
@Getter
public class Booking extends AggregateRoot<Booking, Long> {
    public enum BookingStatus { RESERVED, CANCELLED }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "memberId")
    private Long memberId;
    @Column(name = "paymentId")
    private Long paymentId;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BookingStatus status;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "bookingId")
    private Set<BookingItem> items = new HashSet<>();
    @Column(name = "reservedAt")
    private LocalDateTime reservedAt;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;
    /*
    memberId   BIGINT    NOT NULL COMMENT '회원 ID',
    paymentId  BIGINT             DEFAULT NULL COMMENT '결제 ID',
    status     VARCHAR(40)        DEFAULT 'RESERVED' COMMENT 'RESERVED, CANCELLED',
    reservedAt TIMESTAMP          DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '예매 일시',
    createdAt  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedAt  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

        bookingId       BIGINT    NOT NULL COMMENT '예매 ID',
    screeningSeatId BIGINT    NOT NULL COMMENT '상영 좌석 ID',
    createdAt       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedAt       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (bookingId, screeningSeatId)
     */
}
