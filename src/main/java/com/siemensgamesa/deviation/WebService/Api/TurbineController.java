package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.TurbineModel;
import com.siemensgamesa.deviation.WebService.Service.Interface.ITurbineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/turbine")
public class TurbineController {

    private final ITurbineService turbineService;

    @GetMapping("/all")
    public ResponseEntity<List<TurbineModel>> getAllTurbines()
    {
        return ResponseEntity.ok().body(turbineService.getAllTurbines());
    }

    @GetMapping("/project")
    public ResponseEntity<List<TurbineModel>> getAllTurbinesByProjectName(@RequestParam("projectName") String projectName)
    {
        return ResponseEntity.ok().body(turbineService.getAllByProjectName(projectName));
    }

    @GetMapping
    public ResponseEntity<TurbineModel> getTurbineModelByTurbineId(String turbineId)
    {
        return ResponseEntity.ok().body(turbineService.getTurbineModelByTurbineId(turbineId));
    }
}
