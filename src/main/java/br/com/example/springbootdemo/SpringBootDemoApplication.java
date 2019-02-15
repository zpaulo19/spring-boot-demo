package br.com.example.springbootdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackageClasses = {
        SpringBootDemoApplication.class,
        Jsr310JpaConverters.class
})
public class SpringBootDemoApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(SpringBootDemoApplication.class);

	@Autowired
	Environment environment;

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		getActiveProfiles();
	}

	public void getActiveProfiles() {
		for (final String profileName : environment.getActiveProfiles()) {
			logger.info("Currently active profile - " + profileName.toUpperCase());
		}
	}

}
