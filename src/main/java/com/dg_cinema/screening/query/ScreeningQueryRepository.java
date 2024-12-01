package com.dg_cinema.screening.query;

import com.dg_cinema.support.page.PaginatedResult;

public interface ScreeningQueryRepository {
    PaginatedResult<ScreeningQueryInfo> searchScreening(final ScreeningQuery query);
}
