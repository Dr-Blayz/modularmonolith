package ma.example.modularmonolith.job.infrastructure;

import ma.example.modularmonolith.job.domain.Job;
import ma.example.modularmonolith.job.domain.JobRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaJobRepository
        extends JpaRepository<Job, UUID>, JobRepository {
}