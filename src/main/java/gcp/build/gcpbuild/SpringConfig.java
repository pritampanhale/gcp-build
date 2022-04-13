package gcp.build.gcpbuild;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SpringConfig {
    
    @Scheduled(fixedDelay = 1000*5)
    public void scheduleFixedDelayTask() throws IOException {
        System.out.println("Writing files");
        
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("hhmmss"));
	StringBuilder sb = new StringBuilder();
	sb.append("TestData");
	BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/" + format + ".txt", false));
	writer.append(sb.toString());
	writer.close();
    }
}
