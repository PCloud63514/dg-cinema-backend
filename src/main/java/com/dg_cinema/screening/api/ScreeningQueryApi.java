package com.dg_cinema.screening.api;

import com.dg_cinema.screening.query.ScreeningQuery;
import com.dg_cinema.screening.query.ScreeningQueryInfo;
import com.dg_cinema.screening.query.ScreeningQueryRepository;
import com.dg_cinema.support.page.PaginatedResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
class ScreeningQueryApi {
    private final ScreeningQueryRepository screeningQueryRepository;

    @GetMapping("api/screening")
    PaginatedResult<ScreeningQueryInfo> searchScreening(final ScreeningQuery query) {
        return screeningQueryRepository.searchScreening(query);
    }
}
