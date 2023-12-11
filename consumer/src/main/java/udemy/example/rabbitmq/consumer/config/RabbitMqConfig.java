package udemy.example.rabbitmq.consumer.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public ObjectMapper objectMapper() {
        return JsonMapper.builder().findAndAddModules().build();
    }

}
