package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.VisitModel;
import com.siemensgamesa.deviation.WebService.Service.Interface.IVisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/visit")
public class VisitController {

    private final IVisitService visitService;

    @GetMapping
    public ResponseEntity<List<VisitModel>> getAllVisits()
    {
        return ResponseEntity.ok().body(visitService.getAllVisits());
    }

    @GetMapping("/turbine")
    public ResponseEntity<List<VisitModel>> getAllVistsByTurbineId(@RequestParam("turbineId") String turbineId)
    {
        return ResponseEntity.ok().body(visitService.getAllVisitsByTurbineId(turbineId));
    }

    @PostMapping
    public ResponseEntity<Void> addVisit(@RequestBody VisitModel visitModel)
    {
        visitService.addVisit(visitModel);
        return ResponseEntity.ok().build();
    }
}
