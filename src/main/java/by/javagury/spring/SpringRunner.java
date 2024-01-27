package by.javagury.spring;

import by.javagury.spring.database.repository.CompanyRepository;
import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.database.utils.ConnectionManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("application.xml");

        var companyRepository = context.getBean("companyRepo", CompanyRepository.class);
        System.out.println(companyRepository.findById(2L));

        var userRepository = context.getBean("userRepo", UserRepository.class);
        System.out.println(userRepository.findById(1L));
        context.close();


    }
}
