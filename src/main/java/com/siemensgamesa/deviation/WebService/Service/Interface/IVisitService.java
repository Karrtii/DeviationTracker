package com.siemensgamesa.deviation.WebService.Service.Interface;

import com.siemensgamesa.deviation.Model.VisitModel;

import java.util.List;

public interface IVisitService {
    List<VisitModel> getAllVisits();
    List<VisitModel> getAllVisitsByTurbineId(String turbineId);
    void addVisit(VisitModel visitModel);
}
