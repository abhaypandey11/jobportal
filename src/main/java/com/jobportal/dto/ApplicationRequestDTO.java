package com.jobportal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ApplicationRequestDTO {

    @NotNull(message = "Job ID is required")
    private Long jobId;

    private String resumeUrl;
}