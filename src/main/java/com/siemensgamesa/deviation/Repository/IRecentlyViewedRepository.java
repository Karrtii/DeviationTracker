package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.RecentlyViewedModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecentlyViewedRepository extends JpaRepository<RecentlyViewedModel, Integer> {

}