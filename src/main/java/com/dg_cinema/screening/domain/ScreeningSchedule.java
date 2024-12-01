package com.dg_cinema.screening.domain;

import com.dg_cinema.support.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
@Getter
public class ScreeningSchedule extends ValueObject<ScreeningSchedule> {
    private LocalDate screenDate;
    private LocalTime startTime;
    private LocalTime endTime;

    protected ScreeningSchedule() {
    }

    @Builder
    protected ScreeningSchedule(final LocalDate screenDate, final LocalTime startTime, final LocalTime endTime) {
        Assert.notNull(screenDate, "ScreeningSchedule.screenDate must not be null");
        Assert.notNull(startTime, "ScreeningSchedule.startTime must not be null");
        Assert.notNull(endTime, "ScreeningSchedule.endTime must not be null");
        this.screenDate = screenDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
