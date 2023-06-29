package SpringBootBasics.SpringUdemy.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private ServiceConfiguration serviceConfiguration;

    @RequestMapping("/service-configuration")
    public ServiceConfiguration retriveAllConfigData(){
        return serviceConfiguration;
    }
}
