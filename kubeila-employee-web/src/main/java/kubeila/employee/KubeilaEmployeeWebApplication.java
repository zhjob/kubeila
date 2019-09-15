package kubeila.employee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "kubeila.employee")
@MapperScan("kubeila.employee.dao.mapper")
public class KubeilaEmployeeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubeilaEmployeeWebApplication.class, args);
    }

}
