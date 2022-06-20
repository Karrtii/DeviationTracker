package com.siemensgamesa.deviation.WebService.Service.Interface;

import com.siemensgamesa.deviation.Model.RecentlyViewedModel;

import java.util.List;

public interface IRecentlyViewedService {
    void addView(String header, String turbineId);
    List<RecentlyViewedModel> getAllRecentlyViewed(String header);
}
