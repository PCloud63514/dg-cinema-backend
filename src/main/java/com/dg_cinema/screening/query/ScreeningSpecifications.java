package com.dg_cinema.screening.query;

import com.dg_cinema.screening.domain.Screening;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ScreeningSpecifications {

    public static Specification<Screening> hasScreenId(final Long screenId) {
        return (root, query, cb) -> {
            if (null == screenId) return null;
            return cb.equal(root.get("screenId"), screenId);
        };
    }

    public static Specification<Screening> hasMovieId(final Long movieId) {
        return (root, query, cb) -> {
            if (null == movieId) return null;
            return cb.equal(root.get("movieId"), movieId);
        };
    }

    public static Specification<Screening> hasScreenDate(final LocalDate screenDate) {
        return (root, query, cb) -> {
            if (null == screenDate) return null;
            return cb.equal(root.get("schedule").get("screenDate"), screenDate);
        };
    }
}
