package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.TurbineModel;
import com.siemensgamesa.deviation.WebService.Service.Interface.ITurbineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/turbine")
public class TurbineController {

    private final ITurbineService turbineService;

    @GetMapping
    public ResponseEntity<List<TurbineModel>> getAllTurbines()
    {
        return ResponseEntity.ok().body(turbineService.getAllTurbines());
    }
}
