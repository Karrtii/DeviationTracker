package com.siemensgamesa.deviation.Model;

import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "visit", schema = "dbo")
public class VisitModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visitid")
    private long visitId;

    @Column(name = "activitystartdate")
    private Date activityStartDate;

    @Column(name = "activityenddate")
    private Date activityEndDate;

    @Column(name = "activitystarttime")
    private Time activityStartTime;

    @Column(name = "activityendtime")
    private Time activityEndTime;

    @ManyToOne
    @JoinColumn(name = "turbineid")
    private TurbineModel turbine;
}
