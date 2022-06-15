package com.siemensgamesa.deviation.WebService.Service;

import com.siemensgamesa.deviation.Model.TurbineModel;
import com.siemensgamesa.deviation.Repository.ITurbineRepository;
import com.siemensgamesa.deviation.WebService.Service.Interface.ITurbineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TurbineService implements ITurbineService {

    private final ITurbineRepository turbineRepository;

    @Override
    public List<TurbineModel> getAllTurbines() {
        log.info("Getting all turbines from database");
        return turbineRepository.findAll();
    }
}
