package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.TurbineModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITurbineRepository extends JpaRepository<TurbineModel, String> {
}
