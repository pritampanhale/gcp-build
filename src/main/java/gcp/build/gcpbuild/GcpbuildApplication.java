package gcp.build.gcpbuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GcpbuildApplication {

    public static void main(String[] args) {
	System.out.println("printing env variables");
	for(String arg : args) {
	    System.out.println("----->" + arg);
	}
	SpringApplication.run(GcpbuildApplication.class, args);
    }

}
