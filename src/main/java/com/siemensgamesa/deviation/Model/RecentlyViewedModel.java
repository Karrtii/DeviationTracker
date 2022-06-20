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
@Table(name = "recent", schema = "dbo")
public class RecentlyViewedModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recentid")
    private long recentId;

    @Column(name = "userid")
    private long userId;

    @Column(name = "turbineid")
    private String turbineId;
}
