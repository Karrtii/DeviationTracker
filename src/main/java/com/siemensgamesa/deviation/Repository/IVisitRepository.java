package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.VisitModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVisitRepository extends JpaRepository<VisitModel, Long> {
    List<VisitModel> findAllByTurbine_TurbineId(String turbineId);
}
