package com.siemensgamesa.deviation.Repository;

import com.siemensgamesa.deviation.Model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<ProjectModel, String> {
}
