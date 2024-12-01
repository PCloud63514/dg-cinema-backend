package com.dg_cinema.support.page;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Collection;

@Builder(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Meta {
    private final int page;             // 요청한 페이지
    private final int limit;            // 요청한 페이지당 데이터 수
    private final long totalPages;       // 전체 페이지 수
    private final long totalCount;       // 전체 데이터 수
    private final int currentCount;     // 현재 페이지 데이터 수
    private final boolean hasNextPage;  // 다음 페이지 존재 여부
    private final boolean hasPrevPage;  // 이전 페이지 존재 여부

    public static Meta of(final Collection<?> data, final long totalCount, final Query query) {
        final long totalPages = (totalCount + (long) query.getLimit() - 1L) / (long) query.getLimit();
        return builder()
                .page(query.getPage())
                .limit(query.getLimit())
                .totalPages(totalPages)
                .totalCount(totalCount)
                .currentCount(data.size())
                .hasNextPage(totalPages > (long) query.getPage())
                .hasPrevPage(1 < query.getPage())
                .build();
    }

    public static Meta empty(final Query query) {
        return builder()
                .page(0 == query.getPage()? 1 : query.getPage())
                .limit(query.getLimit())
                .totalPages(0L)
                .totalCount(0L)
                .currentCount(0)
                .hasNextPage(false)
                .hasPrevPage(false)
                .build();
    }
}
