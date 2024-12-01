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
    private final int totalPages;       // 전체 페이지 수
    private final int totalCount;       // 전체 데이터 수
    private final int currentCount;     // 현재 페이지 데이터 수
    private final boolean hasNextPage;  // 다음 페이지 존재 여부
    private final boolean hasPrevPage;  // 이전 페이지 존재 여부

    public static Meta of(final Collection<?> data, final int totalCount, final int page, final int limit) {
        final int totalPages = (totalCount + limit - 1) / limit;
        return builder()
                .page(0 < page ? page : 1)
                .limit(limit)
                .totalPages(totalPages)
                .totalCount(totalCount)
                .currentCount(data.size())
                .hasNextPage(totalPages > page)
                .hasPrevPage(1 < page)
                .build();
    }
}
