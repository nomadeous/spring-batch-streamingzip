package prototypes.batches.chunks.jobs;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/parallelchunking/applicationContext.xml"})
public class ParallelChunkingJobIT extends BatchJobIT {

    @Resource(name = "parallelChunkingJob")
    private Job parallelChunkingJob;

    @Override
    protected Job getJob() {
        return parallelChunkingJob;
    }

    @Test
    @Override
    public void testLaunch() {
        super.testLaunch();
    }
}
