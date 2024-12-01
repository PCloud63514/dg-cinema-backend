package com.dg_cinema.support.page;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class PaginatedResult<T> {
    private final Meta meta;
    private final List<T> items;

    public static <T> PaginatedResult<T> of (final List<T> items, final Meta meta) {
        return PaginatedResult.<T>builder()
                .meta(meta)
                .items(items)
                .build();
    }

    public static <T> PaginatedResult<T> of(final List<T> items, final int totalCount, final int page, final int limit) {
        return PaginatedResult.<T>builder()
                .meta(Meta.of(items, totalCount, page, limit))
                .items(items)
                .build();
    }
}
