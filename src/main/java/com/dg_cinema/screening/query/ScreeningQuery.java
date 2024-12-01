package com.dg_cinema.screening.query;

import com.dg_cinema.support.page.Query;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class ScreeningQuery extends Query {
    private Long screenId;
    private Long movieId;
    private LocalDate screenDate;

    @Builder
    public ScreeningQuery(final int page, final int limit, final Long screenId, final Long movieId, final LocalDate screenDate) {
        super(page, limit);
        this.screenId = screenId;
        this.movieId = movieId;
        this.screenDate = screenDate;
    }
}
