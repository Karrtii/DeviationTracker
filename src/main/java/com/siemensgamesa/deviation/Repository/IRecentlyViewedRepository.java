package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.RecentlyViewedModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRecentlyViewedRepository extends JpaRepository<RecentlyViewedModel, Long> {
    List<RecentlyViewedModel> findAllByUserIdOrderByRecentIdDesc(long userId);
}
