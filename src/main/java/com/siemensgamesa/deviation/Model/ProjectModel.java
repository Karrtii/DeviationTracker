package com.siemensgamesa.deviation.Model;

import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project", schema = "dbo")
public class ProjectModel {

    @Id
    @Column(name = "projectid")
    private String projectId;

    @Column(name = "projectName")
    private String projectName;
}
