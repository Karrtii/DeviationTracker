package com.siemensgamesa.deviation.WebService.Service.Interface;

import com.siemensgamesa.deviation.Model.DeviationModel;

import java.util.List;

public interface IDeviationService {
    List<DeviationModel> getAllDeviationsByVisitId(long visitId);
    void addDeviation(DeviationModel deviationModel);
}
