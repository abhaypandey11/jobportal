package com.jobportal.repository;


import com.jobportal.entity.Job;
import com.jobportal.entity.JobStatus;
import com.jobportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findByStatus(JobStatus status);

    List<Job> findByRecruiter(User recruiter);

    List<Job> findByTitleContainingIgnoreCaseAndStatus(
        String keyword, JobStatus status
    );

    List<Job> findByLocationContainingIgnoreCaseAndStatus(
        String location, JobStatus status
    );
}
