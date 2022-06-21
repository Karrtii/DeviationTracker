package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.DeviationModel;
import com.siemensgamesa.deviation.WebService.Service.Interface.IDeviationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/deviation")
public class DeviationController {

    private final IDeviationService deviationService;

    @GetMapping
    public ResponseEntity<List<DeviationModel>> getAllDeviationsByVisitId(@RequestParam("visitId") long visitId)
    {
        return ResponseEntity.ok().body(deviationService.getAllDeviationsByVisitId(visitId));
    }

    @PostMapping
    public ResponseEntity<Void> addDeviation(@RequestBody DeviationModel deviationModel)
    {
        deviationService.addDeviation(deviationModel);
        return ResponseEntity.ok().build();
    }
}
