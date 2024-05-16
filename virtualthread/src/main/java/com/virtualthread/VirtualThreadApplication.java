package com.virtualthread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = VirtualThreadApplication.class)
@SpringBootApplication
public class VirtualThreadApplication {

	public static void main( String[] args ) {
		SpringApplication.run( VirtualThreadApplication.class, args );
	}
}
