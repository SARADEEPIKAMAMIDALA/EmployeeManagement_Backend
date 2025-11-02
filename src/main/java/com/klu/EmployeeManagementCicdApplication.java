//package com.klu;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class EmployeeManagementCicdApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(EmployeeManagementCicdApplication.class, args);
//	}
//
//}

//package com.klu;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
//@SpringBootApplication
//public class EmployeeManagementCicdApplication extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(EmployeeManagementCicdApplication.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(EmployeeManagementCicdApplication.class, args);
//    }
//}


//package com.klu;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // <-- ADD THIS IMPORT
//
//@SpringBootApplication
//// 1. EXTEND SpringBootServletInitializer
//public class EmployeeManagementCicdApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(EmployeeManagementCicdApplication.class, args);
//	}
//
//    // 2. ADD THE CONFIGURE METHOD
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(EmployeeManagementCicdApplication.class);
//    }
//}


//package com.klu;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
//@SpringBootApplication(scanBasePackages = "com.klu")
//public class EmployeeManagementCicdApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(EmployeeManagementCicdApplication.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(EmployeeManagementCicdApplication.class);
//    }
//}

package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // <-- ADD THIS IMPORT

@SpringBootApplication
// 1. EXTEND SpringBootServletInitializer
public class EmployeeManagementCicdApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementCicdApplication.class, args);
	}

    // 2. ADD THE CONFIGURE METHOD
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmployeeManagementCicdApplication.class);
    }
}