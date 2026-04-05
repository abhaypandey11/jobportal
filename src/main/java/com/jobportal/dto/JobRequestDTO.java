package com.jobportal.dto;

import com.jobportal.entity.JobType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JobRequestDTO {

    @NotBlank(message = "Job title is required")
    private String title;

    @NotBlank(message = "Job description is required")
    private String description;

    @NotBlank(message = "Location is required")
    private String location;

    private String salaryRange;

    @NotNull(message = "Job type is required")
    private JobType jobType;
}
