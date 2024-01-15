package com.academic.business.Impl;

import com.academic.business.PeriodService;
import com.academic.dao.entity.PeriodEntity;
import com.academic.dao.repository.PeriodRepository;
import com.academic.dto.PeriodDto;
import com.academic.mapper.PeriodMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class PeriodServiceImpl implements PeriodService {

    @Inject
    PeriodRepository periodRepository;
    @Inject
    PeriodMapper periodMapper;

    @Override
    public List<PeriodDto.Response> getAllPeriods() {
        return periodMapper.toResponseList(periodRepository.listAll());
    }

    @Override
    @Transactional
    public PeriodDto.Response savePeriod(PeriodDto.Request request) {
        PeriodEntity periodEntity = periodMapper.toRequest(request);
        periodRepository.persist(periodEntity);

        return null;
    }
}
