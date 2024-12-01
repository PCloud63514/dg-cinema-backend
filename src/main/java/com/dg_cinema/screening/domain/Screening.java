package com.dg_cinema.screening.domain;

import com.dg_cinema.support.base.AggregateRoot;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Table(name = "SCREENING")
@Entity
@Getter
public class Screening extends AggregateRoot<Screening, Long> {
    @Id
    private Long id;
    private Long screenId;
    private Long movieId;
    private ScreeningSchedule schedule;
}
