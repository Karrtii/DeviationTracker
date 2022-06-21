package com.siemensgamesa.deviation.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "deviation", schema = "dbo")
public class DeviationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviationid")
    private long deviationId;

    @Column(name = "deviationstartdate")
    private Date deviationStartDate;

    @Column(name = "deviationenddate")
    private Date deviationEndDate;

    @Column(name = "deviationstarttime")
    private Time deviationStartTime;

    @Column(name = "deviationendtime")
    private Time deviationEndTime;

    @Column(name = "problem")
    private String problem;

    @Column(name = "solution")
    private String solution;

    @Column(name = "approved")
    private boolean approved;

    @ManyToOne
    @JoinColumn(name = "visitid")
    private VisitModel visit;
}
