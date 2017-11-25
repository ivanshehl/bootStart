package io.ivan.tao;

import io.ivan.tao.business.mycat.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@EnableAutoConfiguration
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class SampleController {
	
	@Autowired
	private OrderService orderService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	orderService.addOrder();
    	orderService.addOrder();
    	orderService.addOrder();
    	orderService.addOrder();
        return "Hello World!";
    }
    
    @RequestMapping("/showAll")
    @ResponseBody
    String showAll() {
        return "Hello World!\t"+orderService.findByUser().size();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
