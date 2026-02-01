package ma.example.modularmonolith.job.application;

import jakarta.transaction.Transactional;
import ma.example.modularmonolith.job.domain.Job;
import ma.example.modularmonolith.job.domain.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job createJob(String title) {
        Job job = new Job(title);
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
