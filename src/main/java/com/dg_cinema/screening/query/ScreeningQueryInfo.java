package com.dg_cinema.screening.query;

import com.dg_cinema.screening.domain.Screening;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Getter
public class ScreeningQueryInfo {
    private Long id;
    private Long screenId;
    private Long movieId;
    private LocalDate screenDate;
    private LocalTime startTime;
    private LocalTime endTime;

    public static ScreeningQueryInfo mapped(final Screening screening) {
        return builder()
                .id(screening.getId())
                .screenId(screening.getScreenId())
                .movieId(screening.getMovieId())
                .screenDate(screening.getSchedule().getScreenDate())
                .startTime(screening.getSchedule().getStartTime())
                .endTime(screening.getSchedule().getEndTime())
                .build();
    }
}
