package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.VisitModel;
import com.siemensgamesa.deviation.WebService.Service.Interface.IVisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
