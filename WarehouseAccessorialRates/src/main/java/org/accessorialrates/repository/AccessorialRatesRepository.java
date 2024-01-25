package org.accessorialrates.repository;

import org.accessorialrates.domain.AccessorialRateId;
import org.accessorialrates.domain.AccessorialRates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessorialRatesRepository extends JpaRepository<AccessorialRates, AccessorialRateId> {
}
