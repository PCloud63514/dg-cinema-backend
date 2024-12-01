package com.dg_cinema.screening.infra;

import com.dg_cinema.screening.domain.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

interface ScreeningJpaRepository extends JpaRepository<Screening, Long>, JpaSpecificationExecutor<Screening> {

}
