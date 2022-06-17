package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.VisitModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVisitRepository extends JpaRepository<VisitModel, Long> {
}
