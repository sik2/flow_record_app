package com.flowLab.flowRecord.domain.record.repository;

import com.flowLab.flowRecord.domain.record.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
