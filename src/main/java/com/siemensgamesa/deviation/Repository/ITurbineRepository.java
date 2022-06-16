package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.TurbineModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITurbineRepository extends JpaRepository<TurbineModel, String> {
    List<TurbineModel> findAllByProject_ProjectName(String projectName);
}
