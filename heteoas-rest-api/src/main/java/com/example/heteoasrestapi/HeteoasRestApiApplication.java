package com.example.heteoasrestapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HeteoasRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeteoasRestApiApplication.class, args);
	}

	// 공용으로 사용하도록 bean 등록
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
