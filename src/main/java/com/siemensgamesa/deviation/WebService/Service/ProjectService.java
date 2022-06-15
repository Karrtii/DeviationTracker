package com.siemensgamesa.deviation.WebService.Service;

import com.siemensgamesa.deviation.Model.ProjectModel;
import com.siemensgamesa.deviation.Repository.IProjectRepository;
import com.siemensgamesa.deviation.WebService.Service.Interface.IProjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ProjectService implements IProjectService {

    private final IProjectRepository projectRepository;

    @Override
    public List<ProjectModel> getAllProjects() {
        log.info("Getting all projects from database");
        return projectRepository.findAll();
    }
}
