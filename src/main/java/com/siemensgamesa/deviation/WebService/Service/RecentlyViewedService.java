package com.siemensgamesa.deviation.WebService.Service;

import com.siemensgamesa.deviation.Model.RecentlyViewedModel;
import com.siemensgamesa.deviation.Model.UserModel;
import com.siemensgamesa.deviation.Repository.IRecentlyViewedRepository;
import com.siemensgamesa.deviation.WebService.Service.Interface.IRecentlyViewedService;
import com.siemensgamesa.deviation.WebService.Service.Interface.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RecentlyViewedService implements IRecentlyViewedService {

    private final IRecentlyViewedRepository recentlyViewedRepository;
    private final IUserService userService;

    @Override
    public void addView(String header, String turbineId) {
        UserModel user = userService.getUserFromHeader(header);

        RecentlyViewedModel recentlyViewedModel = new RecentlyViewedModel();
        recentlyViewedModel.setUserId(user.getUserId());
        recentlyViewedModel.setTurbineId(turbineId);

        recentlyViewedRepository.save(recentlyViewedModel);
    }

    @Override
    public List<RecentlyViewedModel> getAllRecentlyViewed(String header) {
        UserModel user = userService.getUserFromHeader(header);

        log.info("Getting all recently viewed by user id: {}", user.getUserId());
        return recentlyViewedRepository.findAllByUserIdOrderByRecentIdDesc(user.getUserId());
    }
}
