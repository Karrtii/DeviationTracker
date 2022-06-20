package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.RecentlyViewedModel;
import com.siemensgamesa.deviation.WebService.Service.RecentlyViewedService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/recent")
public class RecentlyViewedController {

    private final RecentlyViewedService recentlyViewedService;

    @GetMapping
    public ResponseEntity<List<RecentlyViewedModel>> getAllRecentlyViewed()
    {
        return ResponseEntity.ok().body(recentlyViewedService.getAllRecentlyViewed());
    }

    @PostMapping
    public ResponseEntity<Void> addView(@RequestHeader("Authorization") String header, @RequestParam String turbineId)
    {
        recentlyViewedService.addView(header, turbineId);
        return ResponseEntity.ok().build();
    }
}
