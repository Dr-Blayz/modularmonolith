package ma.example.modularmonolith.job.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface JobRepository {

    Job save(Job job);

    Optional<Job> findById(UUID id);

    List<Job> findAll();
}
