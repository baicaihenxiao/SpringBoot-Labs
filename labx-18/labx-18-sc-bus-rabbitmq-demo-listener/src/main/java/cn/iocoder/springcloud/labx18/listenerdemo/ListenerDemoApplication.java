package cn.iocoder.springcloud.labx18.listenerdemo;

import cn.iocoder.springcloud.labx18.listenerdemo.event.UserRegisterEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

@SpringBootApplication
@RemoteApplicationEventScan(basePackageClasses = UserRegisterEvent.class)
public class ListenerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListenerDemoApplication.class, args);
    }

}
