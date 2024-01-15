package com.academic.dao.repository;

import com.academic.dao.entity.PeriodEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PeriodRepository implements PanacheRepository<PeriodEntity> {
}
