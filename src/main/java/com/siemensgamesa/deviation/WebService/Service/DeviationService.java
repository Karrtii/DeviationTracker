package com.siemensgamesa.deviation.WebService.Service;

import com.siemensgamesa.deviation.Model.DeviationModel;
import com.siemensgamesa.deviation.Repository.IDeviationRepository;
import com.siemensgamesa.deviation.WebService.Service.Interface.IDeviationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DeviationService implements IDeviationService {

    private final IDeviationRepository deviationRepository;

    @Override
    public List<DeviationModel> getAllDeviationsByVisitId(long visitId) {
        log.info("Getting all deviations by visit Id: {}", visitId);
        return deviationRepository.findAllByVisit_VisitId(visitId);
    }
}
