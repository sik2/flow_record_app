package com.flowLab.flowRecord.domain.record.entity;

import com.flowLab.flowRecord.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Record extends BaseEntity {
    private String title;
    private String memo;
    private boolean isCatNap;
    private int catNapTime;
    private boolean isExercise;
    private int exerciseTime;
    private LocalDateTime RecordDate;
}
