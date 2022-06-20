package com.siemensgamesa.deviation.WebService.Service.Interface;

import com.siemensgamesa.deviation.Model.TurbineModel;

import java.util.List;

public interface ITurbineService {
    List<TurbineModel> getAllTurbines();
    List<TurbineModel> getAllByProjectName(String projectName);
    TurbineModel getTurbineModelByTurbineId(String turbineId);
}
