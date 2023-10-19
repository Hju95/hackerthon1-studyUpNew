package com.kernel360.hackerthon.studyup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyupApplication implements CommandLineRunner {

	@Autowired
	private DataLoader dataLoader;


	public static void main(String[] args) {
		SpringApplication.run(StudyupApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataLoader.loadInitialData(); // 애플리케이션 시작 시점에 DataLoader의 loadInitialData() 메서드 호출
	}

}
