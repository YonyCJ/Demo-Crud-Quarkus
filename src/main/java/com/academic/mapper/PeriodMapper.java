package com.academic.mapper;

import com.academic.dao.entity.PeriodEntity;
import com.academic.dto.PeriodDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface PeriodMapper {
    List<PeriodDto.Response> toResponseList(List<PeriodEntity> entity);
    PeriodEntity toRequest(PeriodDto.Request request);
    PeriodDto.Response toResponse(PeriodEntity entity);

}

