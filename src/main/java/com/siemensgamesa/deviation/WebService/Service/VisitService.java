package com.siemensgamesa.deviation.WebService.Service;

import com.siemensgamesa.deviation.Model.VisitModel;
import com.siemensgamesa.deviation.Repository.ITurbineRepository;
import com.siemensgamesa.deviation.Repository.IVisitRepository;
import com.siemensgamesa.deviation.WebService.Service.Interface.IVisitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class VisitService implements IVisitService {

    private final IVisitRepository visitRepository;

    @Override
    public List<VisitModel> getAllVisits() {
        log.info("Getting all visits from database");
        return visitRepository.findAll();
    }

    @Override
    public List<VisitModel> getAllVisitsByTurbineId(String turbineId) {
        log.info("Getting all visits by turbine Id: {}", turbineId);
        return visitRepository.findAllByTurbine_TurbineId(turbineId);
    }
}
