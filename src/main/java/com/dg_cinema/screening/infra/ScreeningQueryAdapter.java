package com.dg_cinema.screening.infra;

import com.dg_cinema.screening.domain.Screening;
import com.dg_cinema.screening.query.ScreeningQuery;
import com.dg_cinema.screening.query.ScreeningQueryInfo;
import com.dg_cinema.screening.query.ScreeningQueryRepository;
import com.dg_cinema.screening.query.ScreeningSpecifications;
import com.dg_cinema.support.page.PaginatedResult;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
class ScreeningQueryAdapter implements ScreeningQueryRepository {
    private final ScreeningJpaRepository screeningJpaRepository;

    @Override
    public PaginatedResult<ScreeningQueryInfo> searchScreening(final ScreeningQuery query) {
        final Specification<Screening> spec = Specification.where(ScreeningSpecifications.hasScreenId(query.getScreenId()))
                .and(ScreeningSpecifications.hasMovieId(query.getMovieId()))
                .and(ScreeningSpecifications.hasScreenDate(query.getScreenDate()));
        final long count = screeningJpaRepository.count(spec);
        if (0L == count) return PaginatedResult.empty(query);
        final Page<Screening> screenings = screeningJpaRepository.findAll(spec, query.getPageable());

        return PaginatedResult.of(screenings.map(ScreeningQueryInfo::mapped).toList(), count, query);
    }
}
