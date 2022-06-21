package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.DeviationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDeviationRepository extends JpaRepository<DeviationModel, Long> {
    List<DeviationModel> findAllByVisit_VisitId(long visitId);
}
