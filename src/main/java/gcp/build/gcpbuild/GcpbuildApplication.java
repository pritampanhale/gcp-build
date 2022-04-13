package gcp.build.gcpbuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GcpbuildApplication {

    public static void main(String[] args) {
	System.out.println("printing parameters...");
	for(String arg : args) {
	    System.out.println("----->" + arg);
	}
	
	System.out.println("printing env variables...");
	String secret = System.getenv("abcd");
	System.out.println("----->" + secret);
	SpringApplication.run(GcpbuildApplication.class, args);
    }

}
