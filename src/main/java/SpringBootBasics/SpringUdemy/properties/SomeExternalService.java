package SpringBootBasics.SpringUdemy.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
// To read the values from property file

    @Value("${external.service.url}")
    private String url;

    public String getServiceUrl(){
        return url;
    }
}
