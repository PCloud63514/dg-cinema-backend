package com.dg_cinema.support.page;

import lombok.experimental.SuperBuilder;
import org.springframework.data.domain.Pageable;

@SuperBuilder
public abstract class Query {
    private int page;
    private int limit;
    private String keyword;

    protected Query() {
    }

    protected Query(final int page, final int limit) {
        this.page = page;
        this.limit = limit;
    }

    protected Query(final int page, final int limit, final String keyword) {
        this.page = page;
        this.limit = limit;
        this.keyword = keyword;
    }

    public int getPage() {
        return 0 < this.page ? (page - 1) * this.limit : 0;
    }

    public int getLimit() {
        return 0 == limit ? 10 : limit;
    }

    public String getKeyword() {
        return keyword;
    }

    public Pageable getPageable() {
        return org.springframework.data.domain.PageRequest.of(getPage(), limit);
    }
}
