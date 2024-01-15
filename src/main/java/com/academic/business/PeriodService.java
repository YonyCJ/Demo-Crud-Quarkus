package com.academic.business;

import com.academic.dao.entity.PeriodEntity;
import com.academic.dto.PeriodDto;

import java.util.List;

public interface PeriodService {

    List<PeriodDto.Response> getAllPeriods();
    PeriodDto.Response savePeriod(PeriodDto.Request request);
}
