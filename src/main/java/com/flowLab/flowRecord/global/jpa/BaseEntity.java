package com.flowLab.flowRecord.global.jpa;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@ToString
public abstract class BaseEntity {
        @Id
        @GeneratedValue(strategy = IDENTITY)
        @EqualsAndHashCode.Include
        private Long id;
        @CreatedDate
        private LocalDateTime createdDate;
        @LastModifiedDate
        private LocalDateTime modifiedDate;
    }
