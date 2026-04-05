package com.jobportal.dto;


import com.jobportal.entity.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationResponseDTO {

    private Long id;
    private Long jobId;
    private String jobTitle;
    private String companyName;
    private String applicantName;
    private ApplicationStatus status;
    private String resumeUrl;
    private LocalDateTime appliedAt;
}
