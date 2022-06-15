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
@Table(name = "turbine", schema = "dbo")
public class TurbineModel {

    @Id
    @Column(name = "turbineid")
    private String turbineId;

    @ManyToOne
    @JoinColumn(name = "projectid")
    private ProjectModel project;
}
