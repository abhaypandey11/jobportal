package com.jobportal.dto;

import com.jobportal.entity.JobStatus;
import com.jobportal.entity.JobType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResponseDTO {

    private Long id;
    private String title;
    private String description;
    private String location;
    private String salaryRange;
    private JobType jobType;
    private JobStatus status;
    private String recruiterName;
    private LocalDateTime createdAt;
}
