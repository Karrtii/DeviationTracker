package com.siemensgamesa.deviation.WebService.Api;

import com.siemensgamesa.deviation.Model.ProjectModel;
import com.siemensgamesa.deviation.WebService.Service.Interface.IProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/project")
public class ProjectController {

    private final IProjectService projectService;
    
    @GetMapping
    public ResponseEntity<List<ProjectModel>> getAllProjects()
    {
        return ResponseEntity.ok().body(projectService.getAllProjects());
    }
}
