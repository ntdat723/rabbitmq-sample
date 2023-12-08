package udemy.example.rabbitmq.producer.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitProducerService {

    private final RabbitTemplate rabbitTemplate;

    public void sendHello(String name) {
        rabbitTemplate.convertAndSend("course.hello", STR."Hello \{name}");
    }
}
